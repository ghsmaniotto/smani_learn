package com.br.alura.school.infra.student;

import java.util.ArrayList;
import java.util.List;

import com.br.alura.school.domain.student.CPF;
import com.br.alura.school.domain.student.Student;
import com.br.alura.school.domain.student.StudentNotFoundException;
import com.br.alura.school.domain.student.StudentRepository;

public class StudentRepositoryInMemory implements StudentRepository {

  private List<Student> registeredStudents = new ArrayList<Student>();

  @Override
  public void register(Student student) {
    this.registeredStudents.add(student);
  }

  @Override
  public Student searchByCPF(CPF cpf) {
    return this.registeredStudents.stream().filter(student -> student.getCpf().equals(cpf.getNumber())).findFirst()
        .orElseThrow(() -> new StudentNotFoundException(cpf));
  }

  @Override
  public List<Student> listAllRegisteredStudents() {
    return this.registeredStudents;
  }

}
