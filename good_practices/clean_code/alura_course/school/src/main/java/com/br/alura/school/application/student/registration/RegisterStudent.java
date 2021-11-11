package com.br.alura.school.application.student.registration;

import com.br.alura.school.domain.EventPublisher;
import com.br.alura.school.domain.student.RegisteredStudent;
import com.br.alura.school.domain.student.Student;
import com.br.alura.school.domain.student.StudentRepository;

public class RegisterStudent {

  private final StudentRepository repository;
  private final EventPublisher publisher;

  public RegisterStudent(StudentRepository repository, EventPublisher publisher) {
    this.repository = repository;
    this.publisher = publisher;
  }

  public void register(RegisterStudentDTO data) {
    Student newStudent = data.createStudent();

    this.repository.register(newStudent);
    
    RegisteredStudent event = new RegisteredStudent(newStudent.getCpf());
    publisher.publish(event);
  }

}
