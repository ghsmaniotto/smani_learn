package com.br.alura.school.domain.student;

public class StudentNotFoundException extends RuntimeException {

  public StudentNotFoundException(CPF cpf) {
    super("Was not found a student with CPF: " + cpf.getNumber());
  }
}
