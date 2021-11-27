package com.br.alura.school.gamification.domain.stamp;

import com.br.alura.school.shared.domain.CPF;

public class Stamp {
  private CPF studentCpf;
  private String name;

  public Stamp(CPF studentCpf, String name) {
    this.studentCpf = studentCpf;
    this.name = name;
  }

  public CPF studentCpf(){
    return this.studentCpf;
  }

  public String getName(){
    return this.name;
  }
}
