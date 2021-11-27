package com.br.alura.school.academic.application.student.registration;

import com.br.alura.school.academic.domain.student.RegisteredStudent;
import com.br.alura.school.academic.domain.student.Student;
import com.br.alura.school.academic.domain.student.StudentRepository;
import com.br.alura.school.shared.domain.event.EventPublisher;

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
