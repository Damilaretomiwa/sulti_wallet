import org.junit.Test;
import  repositories.DatabaseConnectionManager;
import java.sql.Connection;
import static org.junit.Assert.assertNotNull;
public class DatabaseConnectionManagerTest {
     @Test

     public  void testDatabaseConnection(){
          String username = "root";
          String password = "Bright23$$$";
          Connection connection =
          DatabaseConnectionManager.connect(username,password);
          System.out.println("connection:: " + connection);
          assertNotNull(connection);

     }
}
