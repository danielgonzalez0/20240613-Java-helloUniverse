package structuresDeControles;

public class Structures {
  public static void main (String... args){
    int age = 43;
    String message = "Mon âge est de %d ans. ";
    System.out.printf(message, age);

    //structure conditionnelle if

    if(age > 30){
      System.out.println("Je sais que je suis vieux");
    }

    int ageDuCapitaine = 19;

    // structure conditionnelle if else
    if (ageDuCapitaine > 20 && age  < 50){
      System.out.println("L'âge du capitaine est de " + ageDuCapitaine + " ans");
    }else{
      System.out.println("le code ne permet pas d'afficer l'âge du capitaine");
    }

    //opérateur ternaire
System.out.println(ageDuCapitaine > 20 && age  < 50 ? "L'âge du capitaine est de " + ageDuCapitaine + " ans": "le code ne permet pas d'afficer l'âge du capitaine");

//structure conditionnelle switch

int mois = 1;
        String nomMois = switch (mois) {
            case 1 -> "Janvier";
            case 2 -> "Février";
            case 3 -> "Mars";
            case 4 -> "Avril";
            case 5 -> "Mai";
            case 6 -> "Juin";
            case 7 -> "Juillet";
            case 8 -> "Août";
            case 9 -> "Septembre";
            case 10 -> "Octobre";
            case 11 -> "Novembre";
            case 12 -> "Décembre";
            default -> "Mois inconnu";
        };

        System.out.println(nomMois);
}

}

