package http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {
  
  public void post(String url, Map<String, Object> body){
    try {
      URL apiUrl = new URL(url);
      URLConnection connection = apiUrl.openConnection();
      connection.connect();
    } catch (Exception e) {
      throw new RuntimeException("Error when sending request");
    }
  }
}
