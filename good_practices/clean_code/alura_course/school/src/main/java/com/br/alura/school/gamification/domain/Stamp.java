package com.br.alura.school.gamification.domain;

import com.br.alura.school.academic.domain.student.CPF;

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
