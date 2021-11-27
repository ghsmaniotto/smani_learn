package com.br.alura.school.academic.domain.student;

import java.util.List;

import com.br.alura.school.shared.domain.CPF;

public interface StudentRepository {

  void register(Student student);

  Student searchByCPF(CPF cpf);

  List<Student> listAllRegisteredStudents();

}
