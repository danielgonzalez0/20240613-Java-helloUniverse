package classes;

public class VehiculeAMoteur {
 public int currentSpeed;
 public Moteur engine;

  public int accelerate(){
  System.out.println("J'accélère");
  return 100;
 }

  public int accelerate(int speedAddition){
  int newSpeed = speedAddition + this.currentSpeed;
  System.out.println("J'accélère à " + speedAddition + " km/h");
  return newSpeed;
 }

 public Ville transport(Passager passager, Ville villeDepart){
  Ville destination = new Ville();
  destination.name = "Paris";
  System.out.println("Je transporte " + passager.firstName + " " + passager.lastName);
  System.out.println("Le passager est partie de "+ villeDepart.name);
  return destination;


}
}
