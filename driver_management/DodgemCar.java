package driver_management; 
import behaviours.*;

public class DodgemCar implements Drivable {

  private int averageSpeed;
  private int numberOfSeats;

  public DodgemCar(int averageSpeed, int numberOfSeats){
    this.averageSpeed = averageSpeed;
    this.numberOfSeats = numberOfSeats;
  }

  public int driveTime(int distance){
    return distance/this.averageSpeed;
  }

  public int numberOfSeats(){
    return 2;
  }

}