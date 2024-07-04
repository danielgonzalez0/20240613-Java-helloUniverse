package classes;

public class UsineAssemblage {
  

  public VehiculeAMoteur assemble(){
    Moteur engine = new Moteur();
    /*
     Il s'agit d'instancier un véhicule à moteur avec un moteur par défaut
    on ne sait si le moteur est diesel ou essence
     */
    VehiculeAMoteur vehicule = new VehiculeAMoteur(engine);
    return vehicule;
  }
}
