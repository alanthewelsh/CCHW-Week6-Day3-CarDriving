package driver_management; 
import behaviours.*;

public class Driver {

  String name;
  private Drivable driveable;
  private int averageSpeed;

  public Driver(String name, Drivable driveable, int averageSpeed){
    this.name = name;
    this.driveable = driveable;
    this.averageSpeed = averageSpeed;
  }

  public String getName(){
    return this.name;
  }

  public int driveTime(int distance){
    return distance/this.averageSpeed;
  }

  public int name(){
    return "Dave";
  }

  public Drivable getVehicle(){
    return this.driveable;
  }

  public void setVehicle(Drivable driveable){
    this.driveable = driveable;
  }
}