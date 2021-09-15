package br.com.alura.hr.service.role_upgrade;

import br.com.alura.hr.ExceptionValidation;
import br.com.alura.hr.model.Employee;
import br.com.alura.hr.model.Role;

public class RoleUpgradeService {

  public void upgrade(Employee employee, boolean isGoalAchieved){
    Role currentRole = employee.getRole();

    if (Role.MANAGER == currentRole){
      throw new ExceptionValidation("Managers can't be upgrated");
    }

    if(isGoalAchieved){
      Role nextRole = currentRole.getNextRole();
      employee.upgradeRole(nextRole);
    } else {
      throw new ExceptionValidation("Employee did not achieved the goals"); 
    }
  }
  
}
