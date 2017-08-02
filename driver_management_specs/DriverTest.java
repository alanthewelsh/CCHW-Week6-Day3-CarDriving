import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DriverTest {

  Driver driver;

  @Test
  public void driveDistanceReturnsTime(){
    assertEquals (1, driver.driveTime(10));
  }

  @Test
  public void driverHasName(){
    assertEquals("Dave", driver.name());
  }

}