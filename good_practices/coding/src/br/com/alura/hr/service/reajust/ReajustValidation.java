package br.com.alura.hr.service;

import java.math.BigDecimal;

import br.com.alura.hr.model.Employee;

public interface ReajustValidation {
  public void validate(Employee employee, BigDecimal raise);
}
