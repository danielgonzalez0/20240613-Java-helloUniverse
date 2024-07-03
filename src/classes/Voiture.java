package classes;

import interfaces.Vidangeable;

public class Voiture extends VehiculeAMoteur implements Vidangeable {

  public static int nbWheels = 4;


 public int nbDoors = 5;
 public boolean isAutomatic;
  public BoiteVitesse typeBoite;
 public String color;
 public char firstLetterImmat;
 public int currentGear;



public Voiture() {
  super();
}

public Voiture(String color) {
  this();
   this.color = color;
}

public Voiture (Moteur engine){
super(engine);
}

 


 //honk = klaxonner
 //prefix void = pas de valeur de retour. Void = vide
 public static void honk(){
    System.out.println("Honk honk");
 }


 public int changeGear(boolean up){
  if(up){
    currentGear++;
  }else{
    currentGear--;
  }
  return currentGear;
 }

public void turn(boolean right, int angle){
  String direction = right ? "droite" : "gauche";
  System.out.println("Je tourne vers la " + direction + " à un angle de " + angle + " degrés");
}
public void turn(String rightOrLeft, int angle){
  System.out.println("Je tourne vers la " + rightOrLeft + " à un angle de " + angle + " degrés");
}

    @Override
    public void vidanger() {
        System.out.println("Dévissez le bouchon sous la culasse et attendez que l'huile s'écoule. Remettez le bouchon et versez de l'huile neuve.");
    }

  
}
