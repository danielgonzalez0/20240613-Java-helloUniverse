package classes;

public class Voiture {

 public int nbDoors = 5;
 public boolean isAutomatic;
 public String color;
 public char firstLetterImmat;
 public int currentGear;
 public int currentSpeed;

 //honk = klaxonner
 //prefix void = pas de valeur de retour. Void = vide
 public void honk(){
    System.out.println("Honk honk");
 }

 public int accelerate(){
  System.out.println("J'accélère");
  return 100;
 }

 public int accelerate(int speedAddition){
  int newSpeed = speedAddition + currentSpeed;
  System.out.println("J'accélère à " + speedAddition + " km/h");
  return newSpeed;
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
