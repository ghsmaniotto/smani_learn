package com.br.alura.school.domain.student;

public class CPF {
  private String number;

  public CPF(String  number){
    if(number == null || !number.matches("[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{2}")){
      throw new IllegalArgumentException("Invalid CPF");
    }

    this.number = number;
  }

  public String getNumber(){
    return this.number;
  }

}
