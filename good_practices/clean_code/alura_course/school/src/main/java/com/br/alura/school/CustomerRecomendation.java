package com.br.alura.school;

import java.time.LocalDateTime;

public class CustomerRecomendation {

  private Student indicated;
  private Student whoIndicate;
  private LocalDateTime createdAt;

  public CustomerRecomendation(Student indicated, Student whoIndicate){
    this.indicated = indicated;
    this.whoIndicate = whoIndicate;
    this.createdAt = LocalDateTime.now();
  }

  public Student getIndicated() {
    return indicated;
  }

  public Student getWhoIndicate() {
    return whoIndicate;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }  
}
