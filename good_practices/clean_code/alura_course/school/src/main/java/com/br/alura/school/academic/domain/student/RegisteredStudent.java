package com.br.alura.school.academic.domain.student;

import java.time.LocalDateTime;
import java.util.Map;

import com.br.alura.school.shared.domain.CPF;
import com.br.alura.school.shared.domain.event.Event;
import com.br.alura.school.shared.domain.event.EventType;

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

  @Override
  public EventType type() {
    return EventType.REGISTERD_STUDENT;
  }

  @Override
  public Map<String, Object> data() {
    return Map.of("cpf", studentCPF);
  }

}
