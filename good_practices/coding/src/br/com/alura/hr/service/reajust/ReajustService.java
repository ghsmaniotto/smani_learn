package br.com.alura.hr.service.reajust;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.hr.model.Employee;

public class ReajustService {

  List<ReajustValidation> validations;

  public ReajustService(List<ReajustValidation> validations){
    this.validations = validations;
  }

  public void reajustEmployeeSalary(Employee employee, BigDecimal raise){
    this.validations.forEach(v -> v.validate(employee, raise));

    BigDecimal salaryReajustado = employee.getSalary().add(raise);
    employee.atualizarSalary(salaryReajustado);
  }
  
}
