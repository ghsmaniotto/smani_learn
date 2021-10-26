package com.br.alura.school.application.recommendation;

import com.br.alura.school.domain.student.Student;

public interface SendEmailRecommendation {

  void sentTo(Student student);

}
