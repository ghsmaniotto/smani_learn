package com.br.alura.school.academic.domain.student;

import java.time.LocalDateTime;

import com.br.alura.school.academic.domain.Event;
import com.br.alura.school.shared.domain.CPF;

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
