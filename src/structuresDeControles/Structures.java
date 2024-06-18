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

  }

}
