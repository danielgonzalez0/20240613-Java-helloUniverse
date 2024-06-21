public class Planet {

  String name;
  String matter;
  long diameter;
  int totalVisitors;
  Atmosphere atmosphere;
  Vaisseau stockedShip;
  static String form = "sphérique";

  //methode
  int rotation(int angle){
    int turn = angle/360;
    System.out.println("Je suis la planète " + name + " et je tourne sur moi-même");
    return turn;
  }

  int revolution(int angle){
    int turn = angle/360;
    System.out.println("Je suis la planète " + name + " et je tourne autour de mon étoile");
    return turn;
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

Vaisseau welcomeSpaceship(Vaisseau ship){

  if (this.stockedShip == null){
    System.out.println("Aucun vaisseau ne s'en va");
  } else {
    System.out.println("Un vaisseau de type "+this.stockedShip.type+" doit s'en aller");
  }
    Vaisseau leavingShip = this.stockedShip;
    this.totalVisitors += ship.nbPassagers;
    this.stockedShip = ship;
    return leavingShip;
}
}
