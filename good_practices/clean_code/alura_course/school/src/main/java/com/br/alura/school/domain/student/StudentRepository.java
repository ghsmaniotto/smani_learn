package com.br.alura.school.domain.student;

import java.util.List;

public interface StudentRepository {

  void register(Student student);

  Student searchByCPF(CPF cpf);

  List<Student> listAllRegisteredStudents();
  
}
