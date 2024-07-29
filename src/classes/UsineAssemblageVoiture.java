package classes;

public class UsineAssemblageVoiture extends UsineAssemblage {

  // méthode
  @Override
  public Voiture assemble() {
    Voiture voiture = new Voiture();
    try {
      voiture.immatriculer("AA-123-BB");
  
    } catch (NombreCaracteresInvalidesException | VoitureDejaImmatriculeeException e) {
      // handle the exception here
      System.out.println(e.getMessage());
    }
    finally {
      System.out.println("Assemblage de la voiture terminé");
    }
    return voiture;

  }
}
