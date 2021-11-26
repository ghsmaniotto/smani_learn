package com.br.alura.school.academic.infra.student;

import java.util.ArrayList;
import java.util.List;

import com.br.alura.school.academic.domain.student.CPF;
import com.br.alura.school.academic.domain.student.Student;
import com.br.alura.school.academic.domain.student.StudentNotFoundException;
import com.br.alura.school.academic.domain.student.StudentRepository;

public class StudentRepositoryInMemory implements StudentRepository {

  private List<Student> registeredStudents = new ArrayList<Student>();

  @Override
  public void register(Student student) {
    this.registeredStudents.add(student);
  }

  @Override
  public Student searchByCPF(CPF cpf) {
    return this.registeredStudents.stream().filter(student -> student.getCpf().getNumber().equals(cpf.getNumber()))
        .findFirst().orElseThrow(() -> new StudentNotFoundException(cpf));
  }

  @Override
  public List<Student> listAllRegisteredStudents() {
    return this.registeredStudents;
  }

}
