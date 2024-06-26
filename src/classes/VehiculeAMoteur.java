package classes;

public class VehiculeAMoteur {
 public int currentSpeed;
 public Moteur engine;

//constructeur

public VehiculeAMoteur() {
}

public VehiculeAMoteur (Moteur engine){
  this.engine = engine;
  System.out.println( "Le moteur du vehicule a moteur est à " + engine.carburation);
}

//methode
  public int accelerate(){
  System.out.println("J'accélère");
  return 100;
 }

  public int accelerate(int speedAddition){
  int newSpeed = speedAddition + this.currentSpeed;
  System.out.println("J'accélère à " + speedAddition + " km/h");
  return newSpeed;
 }

 public Ville transport(Passager passager, Ville villeDepart, Ville...villesEtapes){
  Ville destination = new Ville();
  destination.name = "Paris";
  System.out.println("Je transporte " + passager.firstName + " " + passager.lastName);
  System.out.println("Le passager est partie de "+ villeDepart.name);
  System.out.println("La première étape est " + villesEtapes[0].name);
  return destination;


}
}
