package com.br.alura.school.academic.domain.student;

public interface PasswordEncryptor {

  String encryptPassword(String password);

  Boolean validateEncryptedPassword(String encriptedPassword, String password);
}
