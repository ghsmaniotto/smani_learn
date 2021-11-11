package com.br.alura.school.domain.student;

public class TooManyPhonesException extends IllegalArgumentException {
  public TooManyPhonesException() {
    super("Student has more phones than allowed");
  }
}
