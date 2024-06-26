
import java.util.Scanner;

public class HelloUniverse2 {
  public static void main(String[] args) {
    // instanciation de la classe Planet
    PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
    mercure.diameter = 4880;

    PlaneteTellurique venus = new PlaneteTellurique();
    venus.name = "Venus";
    venus.diameter = 12104;

    PlaneteTellurique terre = new PlaneteTellurique();
    terre.name = "Terre";
    terre.diameter = 12742;

    PlaneteTellurique mars = new PlaneteTellurique();
    mars.name = "Mars";
    mars.diameter = 6779;

    PlaneteGazeuse jupiter = new PlaneteGazeuse();
    jupiter.name = "Jupiter";
    jupiter.diameter = 142984;

    PlaneteGazeuse saturn = new PlaneteGazeuse();
    saturn.name = "Saturne";
    saturn.diameter = 120536;

    PlaneteGazeuse uranus = new PlaneteGazeuse();
    uranus.name = "Uranus";
    uranus.diameter = 51118;

    PlaneteGazeuse neptune = new PlaneteGazeuse();
    neptune.name = "Neptune";
    neptune.diameter = 49528;

    VaisseauDeGuerre chasseur = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
    chasseur.nbPassagers = 15;
    VaisseauDeGuerre fregate = new VaisseauDeGuerre(TypeVaisseau.FREGATE);
    fregate.nbPassagers = 20;
    VaisseauDeGuerre croiseur = new VaisseauDeGuerre(TypeVaisseau.CROISEUR);
    croiseur.nbPassagers = 25;
    VaisseauCivil cargo = new VaisseauCivil(TypeVaisseau.CARGO);
    VaisseauCivil vaisseauMonde = new VaisseauCivil(TypeVaisseau.VAISSEAU_MONDE);

    System.out.println("Quel vaisseau souhaitez-vous manipuler parmi les vaisseaux suivants : " + chasseur.type.nomTypeVaisseau + ", "
        + fregate.type.nomTypeVaisseau + ", " + croiseur.type.nomTypeVaisseau + ", " + cargo.type.nomTypeVaisseau + ", " + vaisseauMonde.type.nomTypeVaisseau);

    // objet scanner
    try (Scanner sc = new Scanner(System.in)) {
      String vaisseauChoisi = sc.nextLine().toLowerCase();
      // Rest of the code

      // switch
      Vaisseau vaisseau = null;
      switch (vaisseauChoisi) {
      case "chasseur" -> vaisseau = chasseur;
      case "fregate" -> vaisseau = fregate;
      case "croiseur" -> vaisseau = croiseur;
      case "cargo" -> vaisseau = cargo;
      case "vaisseau monde" -> vaisseau = vaisseauMonde;
      default -> {
        System.out.println("Le vaisseau choisi n'existe pas");
        System.exit(1);
      }
      }
      if (vaisseau != null) {
        System.out.println("Vous avez choisi le vaisseau " + vaisseau.type.nomTypeVaisseau);
      }

      System.out.println("Sur quelle planète tellurique souhaitez-vous-vous poser parmi les planètes suivantes : "
          + mercure.name + ", " + venus.name + ", " + terre.name + ", " + mars.name);
      String planeteChoisie = sc.nextLine().toLowerCase();
      // switch
      PlaneteTellurique planete = null;
      switch (planeteChoisie) {
      case "mercure" -> planete = mercure;
      case "venus" -> planete = venus;
      case "terre" -> planete = terre;
      case "mars" -> planete = mars;
      default -> {
        System.out.println("La planète choisie n'est pas une planète tellurique");
        System.exit(1);
      }
      }
      if (planete != null) {
        System.out.println("Vous avez choisi la planète " + planete.name);
      }

      System.out.println("Quelle tonnage de cargaison souhaitez-vous transporter ?");
      int tonnage = sc.nextInt();
      System.out.println("Vous avez choisi de transporter " + tonnage + " tonnes de cargaison");

      planete.welcomeSpaceship(vaisseau);
      vaisseau.carryCargo(tonnage);
      System.out.println(
          "Le vaisseau " + vaisseau.type.nomTypeVaisseau + " a maintenant une cargaison de " + vaisseau.currentCargoWeight + " tonnes");
      System.out.println("le tonnage rejeté est de " + vaisseau.carryCargo(tonnage) + " tonnes");

    } // end try

  }/* end of main */
}
