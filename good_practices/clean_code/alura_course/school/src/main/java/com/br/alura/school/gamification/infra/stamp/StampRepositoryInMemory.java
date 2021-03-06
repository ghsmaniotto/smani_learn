package com.br.alura.school.gamification.infra.stamp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.br.alura.school.gamification.domain.stamp.Stamp;
import com.br.alura.school.gamification.domain.stamp.StampRepository;
import com.br.alura.school.shared.domain.CPF;

public class StampRepositoryInMemory implements StampRepository {

  private List<Stamp> stamps = new ArrayList<Stamp>();

  @Override
  public List<Stamp> listStudentStamps(CPF cpf) {
    return this.stamps.stream().filter(
      stamp -> stamp.studentCpf().getNumber().equals(cpf.getNumber())
      ).collect(Collectors.toList());
  }

  @Override
  public void store(Stamp stamp) {
    this.stamps.add(stamp);
  }
  
}
