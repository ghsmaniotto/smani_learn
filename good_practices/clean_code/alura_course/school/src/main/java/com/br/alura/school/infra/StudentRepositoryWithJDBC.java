package com.br.alura.school.infra;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.br.alura.school.domain.student.CPF;
import com.br.alura.school.domain.student.Phone;
import com.br.alura.school.domain.student.Student;
import com.br.alura.school.domain.student.StudentRepository;

public class StudentRepositoryWithJDBC implements StudentRepository {
  
  private final Connection connection;
  
  public StudentRepositoryWithJDBC(Connection connection){
    this.connection = connection;
  } 
  
  @Override
  public void register(Student student) {
    try {
      String sql = "INSERT INTO STUDENTS VALUE(?, ?, ?)";
      PreparedStatement ps = connection.prepareStatement(sql);
      
      ps.setString(1, student.getCpf());
      ps.setString(2, student.getName());
      ps.setString(3, student.getEmail());
      ps.execute();
      
      sql = "INSERT INTO PHONES VALUE(?, ?)";
      ps = connection.prepareStatement(sql);
      for(Phone phone : student.getPhones()){
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
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Student searchByCPF(CPF cpf) {
    // TODO Auto-generated method stub
    return null;
  }
}
