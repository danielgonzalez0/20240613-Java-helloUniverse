

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

}//end public
}


