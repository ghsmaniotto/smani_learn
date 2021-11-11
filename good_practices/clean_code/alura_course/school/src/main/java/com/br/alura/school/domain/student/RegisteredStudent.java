package com.br.alura.school.domain.student;

import java.time.LocalDateTime;

import com.br.alura.school.domain.Event;

public class RegisteredStudent implements Event {

  private LocalDateTime moment;
  private CPF studentCPF;

  public RegisteredStudent(CPF studentCpf) {
    this.studentCPF = studentCpf;
    this.moment = LocalDateTime.now();
  }

  @Override
  public LocalDateTime moment() {
    return this.moment;
  }

  public CPF getStudentCPF() {
    return this.studentCPF;
  }

}
