package classes;

public class UsineAssemblage {
  
  public VehiculeAMoteur assemble(){
    Moteur engine = new Moteur();
    VehiculeAMoteur vehicule = new VehiculeAMoteur(engine);
    return vehicule;
  }
}
