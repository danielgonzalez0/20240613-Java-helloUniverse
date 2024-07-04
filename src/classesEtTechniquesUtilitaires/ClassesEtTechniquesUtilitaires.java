package classesEtTechniquesUtilitaires;

import classes.BoiteVitesse;
import classes.Voiture;

public class ClassesEtTechniquesUtilitaires {

  public static void main(String[] args) {

    System.out.println("hello world");

    // try (Scanner sc = new Scanner(System.in)) {
    // String ligneSuivante = sc.nextLine();

    // System.out.println("Vous avez saisi : " + ligneSuivante);
    // }
    // les classes conteneur ou wrapper
    int i = Integer.parseInt("5");
    float f4 = Float.parseFloat("5.25");
    boolean b = Boolean.parseBoolean("true");
    String s = String.valueOf(20);
    long iAsLong = i;

    System.out.println("i = " + i);
    System.out.println("f4 = " + f4);
    System.out.println("b = " + b);
    System.out.println("s = " + s);
    System.out.println("iAsLong = " + iAsLong);

    Voiture peugeot206 = new Voiture();
    peugeot206.setTypeBoite(BoiteVitesse.MANUEL);

    System.out.println("La voiture est de type " + peugeot206.getTypeBoite().nomTypeBoite);
    System.out.println("numero alloué à la boite dans enum " + peugeot206.getTypeBoite().ordinal());
    switch (peugeot206.getTypeBoite()) {
    case AUTO -> System.out.println("C'est une boite automatique");
    case MANUEL -> System.out.println("C'est une boite manuelle");
    case SEMI_AUTO -> System.out.println("C'est une boite semi-automatique");
    default -> System.out.println("Je ne sais pas de quelle boite il s'agit");
    }

  }// end main
}
