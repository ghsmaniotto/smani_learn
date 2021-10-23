package com.br.alura.school.student;

public class Email {
  private String address;

  public Email(String address){
    if(address == null || !address.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
      throw new IllegalArgumentException("E-mail inválido");
    }

    this.address = address;
  }

  public String getAddreess() {
    return this.address;
  }

}
