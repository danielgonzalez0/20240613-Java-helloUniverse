
import java.util.Scanner;

public class HelloUniverse2 {
  public static void main(String[] args) {

    Galaxy solarSystem = new Galaxy();
    solarSystem.name = "Système solaire";
    


    // instanciation de la classe Planet
    PlaneteTellurique terre = new PlaneteTellurique("Terre", 3);
    terre.diameter = 12742;
    terre.distanceFromStar = 149.6f;
    solarSystem.planets.add(terre);
    PlaneteGazeuse jupiter = new PlaneteGazeuse();
    jupiter.name = "Jupiter";
    jupiter.diameter = 142984;
    jupiter.distanceFromStar = 778.6f;
    solarSystem.planets.add(jupiter);
    PlaneteTellurique mercure = new PlaneteTellurique("Mercure", 0);
    mercure.diameter = 4880;
    mercure.distanceFromStar = 57.9f;
    solarSystem.planets.add(mercure);
    PlaneteTellurique venus = new PlaneteTellurique("Venus", 1);
    venus.diameter = 12104;
    venus.distanceFromStar = 108.2f;
    solarSystem.planets.add(venus);
    PlaneteTellurique mars = new PlaneteTellurique("Mars", 4);
    mars.diameter = 6779;
    mars.distanceFromStar = 227.9f;
    solarSystem.planets.add(mars);
    PlaneteGazeuse saturn = new PlaneteGazeuse();
    saturn.name = "Saturne";
    saturn.diameter = 120536;
    saturn.distanceFromStar = 1433.5f;
    solarSystem.planets.add(saturn);
    PlaneteGazeuse neptune = new PlaneteGazeuse();
    neptune.name = "Neptune";
    neptune.diameter = 49528;
    neptune.distanceFromStar = 4495.1f;
    solarSystem.planets.add(neptune);
    PlaneteGazeuse uranus = new PlaneteGazeuse();
    uranus.name = "Uranus";
    uranus.diameter = 51118;
    uranus.distanceFromStar = 2872.5f;
    solarSystem.planets.add(uranus);

    for (Planet planet : solarSystem.planets) {
      System.out.println("planete "+ planet.name);
        
    }



    VaisseauDeGuerre chasseur = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
    chasseur.nbPassagers = 15;
    VaisseauDeGuerre fregate = new VaisseauDeGuerre(TypeVaisseau.FREGATE);
    fregate.nbPassagers = 20;
    VaisseauDeGuerre croiseur = new VaisseauDeGuerre(TypeVaisseau.CROISEUR);
    croiseur.nbPassagers = 25;
    VaisseauCivil cargo = new VaisseauCivil(TypeVaisseau.CARGO);
    VaisseauCivil vaisseauMonde = new VaisseauCivil(TypeVaisseau.VAISSEAU_MONDE);

    boolean recommencer = true;
    Scanner sc = new Scanner(System.in);

    while (recommencer) {

        System.out.println("Quel vaisseau souhaitez-vous manipuler parmi les vaisseaux suivants : "
            + chasseur.type.nomTypeVaisseau + ", " + fregate.type.nomTypeVaisseau + ", " + croiseur.type.nomTypeVaisseau
            + ", " + cargo.type.nomTypeVaisseau + ", " + vaisseauMonde.type.nomTypeVaisseau);
            
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

        // System.out.println("Sur quelle planète tellurique souhaitez-vous-vous poser parmi les planètes suivantes : "
        //     + mercure.name + ", " + venus.name + ", " + terre.name + ", " + mars.name + "choix: 1,2,3,4");
        // int planeteChoisie = sc.nextInt();
        // sc.nextLine();
        // switch

        // Planet p = solarSystem.planets.get(planeteChoisie - 1);

        System.out.println("Sur quelle planète tellurique souhaitez-vous-vous poser parmi les planètes suivantes : "
            + mercure.name + ", " + venus.name + ", " + terre.name + ", " + mars.name);
        String planeteChoisie = sc.nextLine().toLowerCase();
        Planet p = null;
        for (Planet planet : solarSystem.planets) {
          if (planet.name.toLowerCase().equals(planeteChoisie)) {
            p = planet;
            break;
          }
        }

        if(p instanceof PlaneteGazeuse || p == null){
            System.out.println("La planète choisie n'est pas une planète tellurique, recommencer");
            continue;
        }
        PlaneteTellurique planete = (PlaneteTellurique) p;
        
        if (planete != null) {
          System.out.println("Vous avez choisi la planète " + planete.name);
        }

        System.out.println("Quelle tonnage de cargaison souhaitez-vous transporter ?");
        int tonnage = sc.nextInt();
        sc.nextLine();

        System.out.println("Vous avez choisi de transporter " + tonnage + " tonnes de cargaison");

 
        planete.welcomeSpaceship(vaisseau);
        
        
        System.out.println("Voulez-vous recommencer oui/non ?");
        recommencer = sc.nextLine().equals("oui");
        // vaisseau.carryCargo(tonnage);
        // System.out.println(
        // "Le vaisseau " + vaisseau.type.nomTypeVaisseau + " a maintenant une cargaison
        // de " + vaisseau.currentCargoWeight + " tonnes");
        // System.out.println("le tonnage rejeté est de " + vaisseau.carryCargo(tonnage)
        // + " tonnes");

      }
      sc.close();
   

  }/* end of main */
}
