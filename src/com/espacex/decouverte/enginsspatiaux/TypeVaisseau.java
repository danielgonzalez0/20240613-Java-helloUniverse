package com.espacex.decouverte.enginsspatiaux;
public enum TypeVaisseau {

  CHASSEUR("Chasseur"), 
  CROISEUR("Croiseur"), 
  FREGATE("Frégate"), 
  CARGO("Cargo"),
  VAISSEAU_MONDE("Vaisseau Monde");


  public String nomTypeVaisseau;

  TypeVaisseau(String nomTypeVaisseau) {
    this.nomTypeVaisseau = nomTypeVaisseau;
  }
}
