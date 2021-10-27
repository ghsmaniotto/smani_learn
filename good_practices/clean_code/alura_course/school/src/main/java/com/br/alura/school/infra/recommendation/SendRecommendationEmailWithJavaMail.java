package com.br.alura.school.infra.recommendation;

import com.br.alura.school.application.recommendation.SendEmailRecommendation;
import com.br.alura.school.domain.student.Student;

public class SendRecommendationEmailWithJavaMail implements SendEmailRecommendation {

  @Override
  public void sentTo(Student student) {
    // Send email using Java Mail package
  }

}
