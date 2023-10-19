import java.net.URL;
import java.net.URLConnection;

public class Example {
  public static void main(String[] args) {
    try {
      URL url = new URL("https://www.example.com");
      URLConnection connection = url.openConnection();
      connection.setRequestProperty("Proxy-Connection", "open");
      connection.connect();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
