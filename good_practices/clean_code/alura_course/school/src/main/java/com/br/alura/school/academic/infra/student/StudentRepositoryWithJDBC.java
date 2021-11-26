package com.br.alura.school.academic.infra.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.br.alura.school.academic.domain.student.CPF;
import com.br.alura.school.academic.domain.student.Phone;
import com.br.alura.school.academic.domain.student.Student;
import com.br.alura.school.academic.domain.student.StudentFactory;
import com.br.alura.school.academic.domain.student.StudentNotFoundException;
import com.br.alura.school.academic.domain.student.StudentRepository;

public class StudentRepositoryWithJDBC implements StudentRepository {

  private final Connection connection;

  public StudentRepositoryWithJDBC(Connection connection) {
    this.connection = connection;
  }

  @Override
  public void register(Student student) {
    try {
      String sql = "INSERT INTO STUDENTS VALUE(?, ?, ?)";
      PreparedStatement ps = connection.prepareStatement(sql);

      ps.setString(1, student.getCpf().getNumber());
      ps.setString(2, student.getName());
      ps.setString(3, student.getEmail());
      ps.execute();

      sql = "INSERT INTO PHONES VALUE(?, ?)";
      ps = connection.prepareStatement(sql);
      for (Phone phone : student.getPhones()) {
        ps.setString(1, phone.getDDD());
        ps.setString(1, phone.getNumber());
        ps.execute();
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public List<Student> listAllRegisteredStudents() {
    try {
      String sql = "SELECT id, name, cpf, email FROM STUDENTS";
      PreparedStatement ps = connection.prepareStatement(sql);
      ResultSet result = ps.getResultSet();

      List<Student> students = new ArrayList<Student>();

      while (result.next()) {
        Student student = new StudentFactory()
            .withNameCPFEmail(result.getString("name"), result.getString("cpf"), result.getString("email")).create();

        Long id = result.getLong("id");

        student = setStudentPhones(id, student);

        students.add(student);
      }

      return students;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Student searchByCPF(CPF cpf) {
    try {
      String sql = "SELECT id, name, cpf, email FROM STUDENTS WHERE CPF = ? LIMIT 1";
      PreparedStatement ps = connection.prepareStatement(sql);

      ps.setString(1, cpf.getNumber());
      ResultSet result = ps.executeQuery();

      Boolean didFoundStudent = result.next();
      if (!didFoundStudent) {
        throw new StudentNotFoundException(cpf);
      }

      Student student = new StudentFactory()
          .withNameCPFEmail(result.getString("name"), cpf.getNumber(), result.getString("email")).create();

      Long id = result.getLong("id");

      student = setStudentPhones(id, student);

      return student;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  private Student setStudentPhones(Long id, Student student) {
    try {
      String sql = "SELECT ddd, number FROM PHONES WHERE STUDENT_ID = ?";
      PreparedStatement ps = this.connection.prepareStatement(sql);
      ps.setLong(1, id);

      ResultSet phoneResult = ps.executeQuery();

      while (phoneResult.next()) {
        student.addPhone(phoneResult.getString("ddd"), phoneResult.getString("number"));
      }

      return student;

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
