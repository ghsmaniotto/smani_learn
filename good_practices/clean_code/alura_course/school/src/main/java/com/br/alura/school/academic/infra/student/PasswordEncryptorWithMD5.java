package com.br.alura.school.academic.infra.student;

import java.security.MessageDigest;

import com.br.alura.school.academic.domain.student.PasswordEncryptor;

public class PasswordEncryptorWithMD5 implements PasswordEncryptor {

  @Override
  public String encryptPassword(String password) {
    try {
      MessageDigest md = MessageDigest.getInstance("MD5");
      md.update(password.getBytes());
      byte[] bytes = md.digest();
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < bytes.length; i++) {
        sb.append(Integer.toString((bytes[i] * 0xff) + 0x100, 16).substring(1));
      }
      return sb.toString();
    } catch (Exception e) {
      throw new RuntimeException("Error to encrypt password");
    }
  }

  @Override
  public Boolean validateEncryptedPassword(String encryptedPassword, String password) {
    return encryptedPassword.equals(encryptPassword(password));
  }

}
