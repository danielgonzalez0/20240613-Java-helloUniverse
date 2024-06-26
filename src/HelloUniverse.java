
public class HelloUniverse {
    public static void main(String... args) {
        // String message = "Aux dernieres nouvelles, le nombre total de planetes dans
        // le systeme solaire est de : ";
        // int nbPlanetes = 8;
        // System.out.println(message + nbPlanetes);
        // message="Il y a quelques années cependant, elles étaient au nombre de : ";
        // nbPlanetes++;
        // System.out.println(message + nbPlanetes);

        String message = "En %d, les planètes du système solaire était au nombre de : %d. ";
        String error = "Le programme ne peut pas fournir de résultat pour l'année %d. ";

        short annee = 2013;
        int nbPlanetes;

        if (annee < 1600 || annee > 2024) {
            System.out.printf(error + "\n", annee);
            return;
        }

        if (annee < 1700) {
            nbPlanetes = 7;
        } else if (annee <= 1800) {
            nbPlanetes = 8; // Commented out the assignment statement
        } else if (annee < 2006) {
            nbPlanetes = 9;
        } else {
            nbPlanetes = 8;
        }
        System.out.printf(message + "\n", annee, nbPlanetes);

        // switch
        int newNBPlanetes = 7;

        // boucle for
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

        // objet et classe exemple avec Planet

        // instanciation de la classe Planet
        PlaneteTellurique mercury = new PlaneteTellurique("Mercure");
        mercury.diameter = 4880;

        PlaneteTellurique venus = new PlaneteTellurique();
        venus.name = "Venus";
        venus.diameter = 12104;

        PlaneteTellurique earth = new PlaneteTellurique();
        earth.name = "Terre";
        earth.diameter = 12742;

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

        System.out.println(jupiter.name + " est une planète " + jupiter.MATTER + " avec un diamètre de "
                + jupiter.diameter + " km");

        // Planet unknown = new Planet();

        // System.out.println(unknown.name + " est une planète " + unknown.matter + "
        // avec un diamètre de " + unknown.diameter + " km");

        // appel des méthodes de la classe Planet
        int marsTurn = mars.rotation(-684);
        System.out.println(mars.name + " a tourné " + marsTurn + " fois sur elle-même");

        int neptuneTurn = neptune.revolution(-3542);
        System.out.println(neptune.name + " a tourné " + neptuneTurn + " fois autour de son étoile");

        int venusTurn = venus.rotation(1250);
        System.out.println(venus.name + " a tourné " + venusTurn + " fois sur elle-même");

        // surcharge de méthode
        // mars.welcomeSpaceship(8);
        // mars.welcomeSpaceship("FREGATE");
        // System.out.println("Le nombre d'humains ayant déjà séjourné sur "+mars.name+"
        // est actuellement de "+mars.totalVisitors);

        // Utiliser des propriétés sous forme d'objet
        Atmosphere uranusAtmosphere = new Atmosphere();
        uranusAtmosphere.hydrogene = 82f;
        uranusAtmosphere.helium = 15.5f;
        uranusAtmosphere.methane = 2.5f;
        uranusAtmosphere.nitrogen = 0.5f;
        uranusAtmosphere.argon = 0f;
        // uranusAtmosphere.carbonDioxide = 0.0001f;
        // uranusAtmosphere.sodium = 0.0007f;
        uranus.atmosphere = uranusAtmosphere;

        System.out.println(uranus.name + " est composée :");
        if (uranus.atmosphere.hydrogene != null) {
            System.out.println("D'hydrogène à " + uranus.atmosphere.hydrogene + "%");
        }
        if (uranus.atmosphere.helium != null) {
            System.out.println("D'hélium à " + uranus.atmosphere.helium + "%");
        }
        if (uranus.atmosphere.methane != null) {
            System.out.println("De méthane à " + uranus.atmosphere.methane + "%");
        }
        if (uranus.atmosphere.nitrogen != null) {
            System.out.println("D'azote à " + uranus.atmosphere.nitrogen + "%");
        }
        if (uranus.atmosphere.argon != null) {
            System.out.println("D'argon à " + uranus.atmosphere.argon + "%");
        }
        if (uranus.atmosphere.carbonDioxide != null) {
            System.out.println("De dioxyde de carbone à " + uranus.atmosphere.carbonDioxide + "%");
        }
        if(uranus.atmosphere.sodium != null){
            System.out.println("De sodium à " + uranus.atmosphere.sodium + "%");
        }

        // utilisation de la référence d'objet dans les méthodes
        // Vaisseau fregate = new Vaisseau();
        // fregate.type = "FREGATE";
        // fregate.nbPassagers = 9;
        // Vaisseau croiseur = new Vaisseau();
        // croiseur.type = "CROISEUR";
        // croiseur.nbPassagers = 42;
        // mars.welcomeSpaceship(fregate);
        // mars.welcomeSpaceship(croiseur);

        System.out.println("Le nombre d'humains ayant déjà séjourné sur " + mars.name + " est actuellement de "
                + mars.totalVisitors);

        // static
        System.out.println("La forme d'une planète est généralement " + Planet.form);
        System.out.println("La forme de " + mars.name + " est " + Planet.form);

        System.out.println(Planet.expansion(10.5));
        System.out.println(Planet.expansion(14.2));

        System.out.println("Le nombre de planètes découvertes est de " + Planet.nbDiscoveredPlanets);

        // hétitage
        // Vaisseau chasseur = new VaisseauDeGuerre();
        // chasseur.type = "CHASSEUR";
        // chasseur.shielding = 156;
        // chasseur.shieldResistance = 2;

        // Vaisseau vaisseauMonde = new VaisseauCivil();
        // vaisseauMonde.type = "VAISSEAU MONDE";
        // vaisseauMonde.shielding = 4784;
        // vaisseauMonde.shieldResistance = 30;

        // ((VaisseauDeGuerre)chasseur).activateShield();
        // vaisseauMonde.activateShield();

        // ((VaisseauDeGuerre)chasseur).attack(vaisseauMonde, "lasers photoniques", 3);
        // vaisseauMonde.desactivateShield();
        // System.out.println("Le vaisseau monde a maintenant une durée de protection de
        // " + vaisseauMonde.shieldResistance);
        // System.out.println("Le vaisseau monde a maintenant un blindage de " +
        // vaisseauMonde.shielding);

        VaisseauDeGuerre chasseur = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur.shielding = 156;
        chasseur.shieldResistance = 2;

        VaisseauCivil vaisseauMonde = new VaisseauCivil(TypeVaisseau.VAISSEAU_MONDE);
        // vaisseauMonde.type = "VAISSEAU MONDE";
        vaisseauMonde.shielding = 4784;
        vaisseauMonde.shieldResistance = 30;

        mars.welcomeSpaceship(chasseur);
        mars.welcomeSpaceship(vaisseauMonde);

        // methode abstraite et classe abstraite
        earth.welcomeSpaceship(chasseur);
        chasseur.carryCargo(20);

        VaisseauDeGuerre fregate = new VaisseauDeGuerre(TypeVaisseau.FREGATE);
        fregate.nbPassagers = 100;
        earth.welcomeSpaceship(fregate);
        int fregateQuantiteRefusee = fregate.carryCargo(45);
        System.out.println("La quantité de marchandises refusée est de " + fregateQuantiteRefusee);
        fregate.carryCargo(12);
        VaisseauDeGuerre fregate2 = new VaisseauDeGuerre(TypeVaisseau.FREGATE);
        fregate2.nbPassagers = 14;
        earth.welcomeSpaceship(fregate2);
        fregate2.carryCargo(30);
        VaisseauCivil vaisseauMonde2 = new VaisseauCivil(TypeVaisseau.VAISSEAU_MONDE);
        earth.welcomeSpaceship(vaisseauMonde2);
        int qterefusee = vaisseauMonde2.carryCargo(1560);
        System.out.println("La quantité de marchandises refusée est de " + qterefusee);
        vaisseauMonde2.carryCargo(600);

    }// end public
}
