import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Example {
  private static final Logger logger = LogManager.getLogger(Example.class);

  public static void main(String[] args) {
    String user = args[0];
    String password = args[1];
    logger.info("User " + user + " logged in successfully");
  }
}
