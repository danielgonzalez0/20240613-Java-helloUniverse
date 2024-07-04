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


/**
 * Transporte un passager d'une ville de départ à une destination, en passant par des villes étapes.
 * <p>
 * Imprime le nom du passager, la ville de départ, et la première ville étape. Retourne la ville de destination finale.
 * </p>
 * 
 * @param passager Le passager à transporter.
 * @param villeDepart La ville de départ du voyage.
 * @param villesEtapes Les villes étapes du voyage.
 * @return La ville de destination finale.
 */ 
 public Ville transport(Passager passager, Ville villeDepart, Ville...villesEtapes){
  final Ville destination;
  destination = new Ville();
  destination.name = "Paris";
  System.out.println("Je transporte " + passager.firstName + " " + passager.lastName);
  System.out.println("Le passager est partie de "+ villeDepart.name);
  System.out.println("La première étape est " + villesEtapes[0].name);
  return destination;


}
}
