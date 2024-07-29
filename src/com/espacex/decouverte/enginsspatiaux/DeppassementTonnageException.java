package com.espacex.decouverte.enginsspatiaux;

public class DeppassementTonnageException extends Exception{
  public int tonnageEnExces;

  public DeppassementTonnageException(int tonnageEnExces){
    super("Vous avez dépassé le tonnage autorisé de " + tonnageEnExces + " tonnes.");
    this.tonnageEnExces = tonnageEnExces;
    
  }
}
