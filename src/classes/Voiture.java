package classes;

public class Voiture extends VehiculeAMoteur {

 public int nbDoors = 5;
 public boolean isAutomatic;
 public String color;
 public char firstLetterImmat;
 public int currentGear;

 public static int nbWheels = 4;

public Voiture() {
}

public Voiture(String color) {
   this.color = color;
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
}
