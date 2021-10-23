package com.br.alura.school;

import java.util.ArrayList;
import java.util.List;

public class Student {
    
  private String name;
  private CPF cpf;
  private Email email;
  
  private List<Phone> phones = new ArrayList<Phone>();

  public void addPhone(String ddd, String number){
    this.phones.add(new Phone(ddd, number));
  }
}
