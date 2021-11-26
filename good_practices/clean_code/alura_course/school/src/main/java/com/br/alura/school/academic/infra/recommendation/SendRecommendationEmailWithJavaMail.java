package com.br.alura.school.academic.infra.recommendation;

import com.br.alura.school.academic.application.recommendation.SendEmailRecommendation;
import com.br.alura.school.academic.domain.student.Student;

public class SendRecommendationEmailWithJavaMail implements SendEmailRecommendation {

  @Override
  public void sentTo(Student student) {
    // Send email using Java Mail package
  }

}
