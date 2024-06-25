
import classes.Moteur;
import classes.Passager;
import classes.UsineAssemblage;
import classes.UsineAssemblageVoiture;
import classes.VehiculeAMoteur;
import classes.Velo;
import classes.Ville;
import classes.Voiture;

public class Convertisseur {
public static void main(String[] args) {
    short montantInitial=1500;
		float taux=1.22f;
		float resultat=montantInitial*taux;
    int arrondi = (int)resultat;
		
		System.out.println(arrondi);

    boolean estCeQueCestVrai = 20 != 30;
    System.out.println(estCeQueCestVrai);

    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool3 = bool1 || bool2;
    System.out.println("bool3 = " + bool3);

    //class et objet exemple avec Voiture


    Voiture car = new Voiture("red");
    car.nbDoors = 3;
    car.isAutomatic = true;
    // car.color = "red";
    String transition = car.isAutomatic ? "automatique" : "manuelle";
    String message = String.format("la voiture de JP est de couleur %s, a %d portes et est %s", car.color, car.nbDoors, transition);
    System.out.printf(message + "\n");
    Voiture.honk();
    int newSpeed = car.accelerate();
    System.out.println("La nouvelle vitesse est de " + newSpeed + " km/h");
    int newGear = car.changeGear(true); 
    System.out.println("Le nouveau rapport est de " + newGear);
    car.turn(false, 90);

    //encapsulation propriété dans une autre classe
    Voiture car2 = new Voiture();
    Moteur engine = new Moteur();
    engine.carburation = "diesel";
    engine.nbCylinders = 4;
    car2.engine = engine;
    System.out.println("Le moteur de la voiture 2 est à " + car2.engine.carburation);

    //reference objet dans les méthodes
    Passager passager = new Passager();
    passager.firstName = "Jean";
    passager.lastName = "Dupont";
    Ville rennes = new Ville();
    rennes.name = "Rennes";
    Ville destination = car2.transport(passager, rennes);
    System.out.println("Le passager est arrivé à " + destination.name);

    //static
    System.out.println("Le nombre de roues d'une voiture est de " + Voiture.nbWheels);

    VehiculeAMoteur carMichel = new Voiture();
    ((Voiture)carMichel).isAutomatic = true;
    System.out.println("La voiture de Michel est " + (((Voiture)carMichel).isAutomatic? "automatique" : "manuelle"));
    // Voiture carMichelGoodType = (Voiture) carMichel;
    // carMichelGoodType.isAutomatic = true;
    // System.out.println("La voiture de Michel est " + (carMichelGoodType.isAutomatic ? "automatique" : "manuelle"));
    Voiture carDaniel =new Voiture (engine);
    System.out.println("La voiture de Daniel est " + (carDaniel.engine.carburation));

    // covariance des méthodes
    UsineAssemblage usine = new UsineAssemblage();
    VehiculeAMoteur vehicule = usine.assemble();
    UsineAssemblageVoiture usineVoiture = new UsineAssemblageVoiture();
    System.out.println("Le véhicule assemblé est un " + vehicule.engine.carburation);
    Voiture voiture = usineVoiture.assemble();
    System.out.println("La voiture assemblée est de couleur " + voiture.color);

    // polymorphisme sous-typage

    // Voiture peugeot206 = new Voiture();
    // VehiculeAMoteur peugeot207 = new Voiture();
    // Vidangeable peugeot208 = new Voiture();

    // peugeot208 a acces uniquement a la methode vidanger
    // transtypage pourra etre fait pour peugeot208 pour acceder aux autres methodes de Voiture
    // c'est grâce au polymorphisme que l'on peut faire cela

    //abstract class
    Velo bike = new Velo();
    bike.klaxonner();
    
}
}
