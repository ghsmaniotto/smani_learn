package com.br.alura.school.domain.student;

import java.time.format.DateTimeFormatter;

import com.br.alura.school.domain.Event;
import com.br.alura.school.domain.Listener;

public class RegisteredStudentLog extends Listener {

  @Override
  protected boolean mustProcess(Event event) {
    return event instanceof RegisteredStudent;
  }

  @Override
  protected void reactTo(Event event) {
    String formattedMoment = event.moment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

    System.out.println(String.format("Aluno com CPF %s matriculado em: %s", ((RegisteredStudent) event).getStudentCPF(),
        formattedMoment));
  }

}
