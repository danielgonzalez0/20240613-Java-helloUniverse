package classes;

public enum BoiteVitesse {
  AUTO("Automatique"), 
  MANUEL("Manuelle"), 
  SEMI_AUTO("Semi-automatique");

  public String nomTypeBoite;

  BoiteVitesse(String nomTypeBoite) {
    this.nomTypeBoite = nomTypeBoite;
  }
}
