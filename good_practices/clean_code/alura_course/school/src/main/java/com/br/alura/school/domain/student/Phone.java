package com.br.alura.school.domain.student;

public class Phone {

  private String ddd;
  private String number;

  public Phone(String ddd, String number) {
    if (!new ValidatePhoneAttr(ddd, number).isValid()) {
      throw new IllegalArgumentException("Invalid Phone");
    }

    this.ddd = ddd;
    this.number = number;
  }

  public String getFormattedPhone() {
    return "(" + this.ddd + ") " + this.number;
  }

  public String getDDD() {
    return this.ddd;
  }

  public String getNumber() {
    return this.number;
  }
}

final class ValidatePhoneAttr {
  private String ddd;
  private String number;

  public ValidatePhoneAttr(String ddd, String number) {
    this.ddd = ddd;
    this.number = number;
  }

  public Boolean isValid() {
    return !areAttributesNull() && areAttributesValid();
  }

  private Boolean areAttributesNull() {
    return this.ddd == null || this.number == null;
  }

  private Boolean areAttributesValid() {
    return this.ddd.matches("[0-9]{2}") && this.number.matches("[0-9]{8,9}");
  }
}
