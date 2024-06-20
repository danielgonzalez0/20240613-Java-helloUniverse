public class Planet {

  String name;
  String matter;
  long diameter;
  int totalVisitors;

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

void welcomeSpaceship(int newVisitors){
totalVisitors += newVisitors;
}
void welcomeSpaceship(String newVisitors){
switch (newVisitors) {
case "CHASSEUR"->totalVisitors+=3;
case "FREGATE"->totalVisitors+=12;
case "CROISEUR"->totalVisitors+=50;
default -> totalVisitors+=0;
}
}
}
