package com.br.alura.school.academic.application.student.registration;

import com.br.alura.school.academic.domain.student.Student;
import com.br.alura.school.academic.domain.student.StudentFactory;

public class RegisterStudentDTO {

  private String studentName;
  private String studentEmail;
  private String studentCPF;

  public RegisterStudentDTO(String studentName, String studentEmail, String studentCPF) {
    this.studentName = studentName;
    this.studentEmail = studentEmail;
    this.studentCPF = studentCPF;
  }

  public Student createStudent() {
    return new StudentFactory().withNameCPFEmail(studentName, studentCPF, studentEmail).create();
  }
}
