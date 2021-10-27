package com.br.alura.school.domain.recommendation;

import java.time.LocalDateTime;

import com.br.alura.school.domain.student.Student;

public class StudentRecommendation {

  private Student indicated;
  private Student whoIndicate;
  private LocalDateTime createdAt;

  public StudentRecommendation(Student indicated, Student whoIndicate) {
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
