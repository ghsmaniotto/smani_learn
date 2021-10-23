package com.br.alura.school;

public class CPF {
  private String number;

  public CPF(String  number){
    if(number == null || number.matches("[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{2}")){
      throw new IllegalArgumentException("CPF inválido");
    }

    this.number = number;
  }

}
