package com.br.alura.school.application.student.registration;

import com.br.alura.school.domain.student.Student;
import com.br.alura.school.domain.student.StudentRepository;

public class RegisterStudent {

  private final StudentRepository repository;

  public RegisterStudent(StudentRepository repository) {
    this.repository = repository;
  }

  public void register(RegisterStudentDTO data) {
    Student newStudent = data.createStudent();

    this.repository.register(newStudent);
  }

}
