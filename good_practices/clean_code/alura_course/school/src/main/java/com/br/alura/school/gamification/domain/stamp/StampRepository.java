package com.br.alura.school.gamification.domain.stamp;

import java.util.List;

import com.br.alura.school.academic.domain.student.CPF;

public interface StampRepository {

  void register(Stamp stamp);

  List<Stamp> listStudentStamps(CPF cpf);

}
