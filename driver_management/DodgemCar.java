package driver_management; 
import behaviours.*;

public class DodgemCar implements Drivable {

  private int averageSpeed;

  public DodgemCar(int averageSpeed){
    this.averageSpeed = averageSpeed;
  }

  public int driveDistance(int distance){
    return distance/this.averageSpeed;
  }

}