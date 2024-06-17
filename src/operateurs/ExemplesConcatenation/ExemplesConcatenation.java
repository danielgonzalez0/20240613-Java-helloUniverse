package operateurs.ExemplesConcatenation;

public class ExemplesConcatenation {
  public static void main(String... args){
  
  String debutMessage = "Voici ma chaine ";
  String finMessage = "de caracteres";
System.out.println(debutMessage + finMessage);

String debut = "Mon âge est de ";
int age = 43;
System.out.println(debut + (age + 1) + " ans");

// intro formattage de chaine de caractères
System.out.printf("Mon âge est de %d ans", age + 1);
  }
}
