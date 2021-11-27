package com.br.alura.school.gamification.application;

import com.br.alura.school.gamification.domain.stamp.Stamp;
import com.br.alura.school.gamification.domain.stamp.StampRepository;
import com.br.alura.school.shared.domain.CPF;
import com.br.alura.school.shared.domain.event.Event;
import com.br.alura.school.shared.domain.event.EventType;
import com.br.alura.school.shared.domain.event.Listener;

public class CreateNewStudentStamp extends Listener {

  private final StampRepository repository;

  public CreateNewStudentStamp(StampRepository repository){
    this.repository = repository;
  }

  @Override
  protected boolean mustProcess(Event event) {
    return event.type() == EventType.REGISTERD_STUDENT;
  }

  @Override
  protected void reactTo(Event event) {
    CPF studentCpf = (CPF) event.data().get("cpf");
    Stamp newStudent = new Stamp(studentCpf, "New Student");

    this.repository.store(newStudent);
  }

}
