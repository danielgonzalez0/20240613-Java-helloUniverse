public class HelloUniverse {
    public static void main(String... args)  {
        // String message = "Aux dernieres nouvelles, le nombre total de planetes dans le systeme solaire est de : ";
        // int nbPlanetes = 8;
        // System.out.println(message + nbPlanetes);
        // message="Il y a quelques années cependant, elles étaient au nombre de : ";
        // nbPlanetes++;
        // System.out.println(message + nbPlanetes);

String message = "En %d, les planètes du système solaire était au nombre de : %d";

short annee = 2013;

int nbPlanetes = annee < 2006 ? 9 : 8;



System.out.printf(message, annee, nbPlanetes);
    }
}
