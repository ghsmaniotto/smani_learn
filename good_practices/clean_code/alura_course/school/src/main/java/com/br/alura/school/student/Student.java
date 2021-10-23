package com.br.alura.school.student;

import java.util.ArrayList;
import java.util.List;

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

  public void addPhone(String ddd, String number){
    this.phones.add(new Phone(ddd, number));
  }

  public String getName(){
    return this.name;
  }

  public CPF getCpf(){
    return this.cpf;
  }

  public Email getEmail(){
    return this.email;
  }

  public List<Phone> getPhones(){
    return this.phones;
  }
}
