package com.br.alura.school.recomendation;

import java.time.LocalDateTime;

import com.br.alura.school.student.Student;

public class StudentRecomendation {

  private Student indicated;
  private Student whoIndicate;
  private LocalDateTime createdAt;

  public StudentRecomendation(Student indicated, Student whoIndicate){
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
