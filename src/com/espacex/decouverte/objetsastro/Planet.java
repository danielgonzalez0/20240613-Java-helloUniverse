package com.espacex.decouverte.objetsastro;
public abstract class Planet implements Comparable<Planet>{

 public String name;
  // String matter;
 public long diameter;
  Atmosphere atmosphere;
 
 public static String form = "sphérique";
 public static int nbDiscoveredPlanets;
  public Float distanceFromStar;

 public Planet(){
    nbDiscoveredPlanets++;
  };

  public Planet(String name){
    this.name = name;
    nbDiscoveredPlanets++;
  };

  //methode
  public int rotation(int angle){
    int turn = angle/360;
    System.out.println("Je suis la planète " + name + " et je tourne sur moi-même");
    return turn;
  }

 public  int revolution(int angle){
    int turn = angle/360;
    System.out.println("Je suis la planète " + name + " et je tourne autour de mon étoile");
    return turn;
  }

 public static String expansion(double distance){
    if(distance >= 14){
      return "Oh la la mais c'est super rapide !";
    }else{
      return "Je rêve ou c'est plus rapide que la lumière ?";
    }
  
  }

// void welcomeSpaceship(int newVisitors){
// totalVisitors += newVisitors;
// }
// void welcomeSpaceship(String shipType){
// switch (shipType) {
// case "CHASSEUR"->totalVisitors+=3;
// case "FREGATE"->totalVisitors+=12;
// case "CROISEUR"->totalVisitors+=50;
// default -> totalVisitors+=0;
// }
// }

    public Atmosphere getAtmosphere() {
        return atmosphere;
    }

    @Override
    public int compareTo(Planet planet) {
        return this.distanceFromStar.compareTo(planet.distanceFromStar);
    }
}
