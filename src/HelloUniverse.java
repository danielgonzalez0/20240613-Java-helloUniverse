

public class HelloUniverse {
    public static void main(String... args)  {
        // String message = "Aux dernieres nouvelles, le nombre total de planetes dans le systeme solaire est de : ";
        // int nbPlanetes = 8;
        // System.out.println(message + nbPlanetes);
        // message="Il y a quelques années cependant, elles étaient au nombre de : ";
        // nbPlanetes++;
        // System.out.println(message + nbPlanetes);

String message = "En %d, les planètes du système solaire était au nombre de : %d. ";
String error = "Le programme ne peut pas fournir de résultat pour l'année %d. ";

short annee = 2013;
int nbPlanetes;

if(annee < 1600 || annee > 2024) {
System.out.printf(error + "\n", annee);
return ;
}

if(annee < 1700) {
nbPlanetes = 7;
} else if(annee <= 1800) {
nbPlanetes = 8; // Commented out the assignment statement
}else if(annee < 2006) {
    nbPlanetes = 9;
}else {
    nbPlanetes = 8;
}
System.out.printf(message + "\n", annee, nbPlanetes);

//switch
int newNBPlanetes = 7;

//boucle for
while (newNBPlanetes < 10) {
    String messageToDisplay = switch (newNBPlanetes) {
        case 7 -> "On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes";
        case 8 -> "On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006";
        case 9 -> "On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8";
        default -> "Le programme ne peut pas fournir de résultat pour %d";
    };
       System.out.printf(messageToDisplay + "\n", newNBPlanetes);
       newNBPlanetes++;
}

//objet et classe exemple avec Planet

//instanciation de la classe Planet
Planet mercury = new Planet();
mercury.name = "Mercure";
mercury.matter = "tellurique";
mercury.diameter = 4880;

Planet venus = new Planet();
venus.name = "Venus";
venus.matter = "tellurique";
venus.diameter = 12104;

Planet earth = new Planet();
earth.name = "Terre";
earth.matter = "tellurique";
earth.diameter = 12742;

Planet mars = new Planet();
mars.name = "Mars";
mars.matter = "tellurique";
mars.diameter = 6779;

Planet jupiter = new Planet();
jupiter.name = "Jupiter";
jupiter.matter = "gazeuse";
jupiter.diameter = 142984;

Planet saturn = new Planet();
saturn.name = "Saturne";
saturn.matter = "gazeuse";
saturn.diameter = 120536;

Planet uranus = new Planet();
uranus.name = "Uranus";
uranus.matter = "gazeuse";
uranus.diameter = 51118;

Planet neptune = new Planet();
neptune.name = "Neptune";
neptune.matter = "gazeuse";
neptune.diameter = 49528;

System.out.println(jupiter.name + " est une planète " + jupiter.matter + " avec un diamètre de " + jupiter.diameter + " km");

Planet unknown = new Planet();

System.out.println(unknown.name + " est une planète " + unknown.matter + " avec un diamètre de " + unknown.diameter + " km");

//appel des méthodes de la classe Planet
int marsTurn = mars.rotation(-684);
System.out.println(mars.name + " a tourné " + marsTurn + " fois sur elle-même");

int neptuneTurn = neptune.revolution(-3542);
System.out.println(neptune.name + " a tourné " + neptuneTurn + " fois autour de son étoile");

int venusTurn = venus.rotation(1250);
System.out.println(venus.name + " a tourné " + venusTurn + " fois sur elle-même");

//surcharge de méthode
mars.welcomeSpaceship(8);
mars.welcomeSpaceship("FREGATE");
System.out.println("Le nombre d'humains ayant déjà séjourné sur "+mars.name+" est actuellement de "+mars.totalVisitors);



}//end public
}


