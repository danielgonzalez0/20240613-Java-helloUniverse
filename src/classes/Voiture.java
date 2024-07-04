package classes;

import interfaces.Vidangeable;

public class Voiture extends VehiculeAMoteur implements Vidangeable {

  public static int nbWheels = 4;


 private int nbDoors = 5;
 private boolean isAutomatic;
  private BoiteVitesse typeBoite;
 private String color;
 private char firstLetterImmat;
 private int currentGear;



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

    public int getNbDoors() {
        return nbDoors;
    }

    public void setNbDoors(int nbDoors) {
        this.nbDoors = nbDoors;
    }

    public boolean isIsAutomatic() {
        return isAutomatic;
    }

    public void setIsAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }

    public char getFirstLetterImmat() {
        return firstLetterImmat;
    }

    public void setFirstLetterImmat(char firstLetterImmat) {
        this.firstLetterImmat = firstLetterImmat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BoiteVitesse getTypeBoite() {
        return typeBoite;
    }

    public void setTypeBoite(BoiteVitesse typeBoite) {
        this.typeBoite = typeBoite;
    }



  
}
