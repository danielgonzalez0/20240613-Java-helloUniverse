package classes;

public class UsineAssemblageVoiture extends UsineAssemblage {
  

  //méthode
  @Override
  public Voiture assemble(){
    Voiture voiture = new Voiture();
    return voiture;
  }

}
