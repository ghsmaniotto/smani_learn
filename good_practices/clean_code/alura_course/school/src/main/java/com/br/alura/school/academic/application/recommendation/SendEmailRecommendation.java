package com.br.alura.school.academic.application.recommendation;

import com.br.alura.school.academic.domain.student.Student;

public interface SendEmailRecommendation {

  void sentTo(Student student);

}
