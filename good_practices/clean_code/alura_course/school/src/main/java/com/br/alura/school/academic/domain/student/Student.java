package com.br.alura.school.academic.domain.student;

import java.util.ArrayList;
import java.util.List;

import com.br.alura.school.shared.domain.CPF;

public class Student {

  public Student(String name, CPF cpf, Email email) {
    this.name = name;
    this.cpf = cpf;
    this.email = email;
  }

  private String name;
  private CPF cpf;
  private Email email;

  private List<Phone> phones = new ArrayList<Phone>();

  private String password;

  public void addPhone(String ddd, String number) {
    if (this.phones.size() >= 2) {
      throw new TooManyPhonesException();
    }
    this.phones.add(new Phone(ddd, number));
  }

  public String getName() {
    return this.name;
  }

  public CPF getCpf() {
    return this.cpf;
  }

  public String getEmail() {
    return this.email.getAddreess();
  }

  public List<Phone> getPhones() {
    return this.phones;
  }
}
