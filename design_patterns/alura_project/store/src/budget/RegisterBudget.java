package budget;

import java.util.Map;

import exceptions.DomainException;
import http.HttpAdapter;

public class RegisterBudget {

  private HttpAdapter http;

  public RegisterBudget(HttpAdapter httpAdapter){
    this.http = httpAdapter;
  }

  public void register(Budget budget){
    if(!budget.isCompleted()){
      throw new DomainException("The budget is not completed");
    }

    String url = "http://api.externa/budget";

    Map<String, Object> data = Map.of(
      "value", budget.getValue(),
      "itemsCount", budget.getItemsCount()
    );

    http.post(url, data); 
  }
  
}
