package com.espacex.decouverte.enginsspatiaux;
public abstract class Vaisseau {
final public TypeVaisseau type;
public int nbPassagers;
public int shielding;
public int shieldResistance;
protected  int currentCargoWeight;
public int maxCargoWeight;

//constructeur
public Vaisseau(TypeVaisseau type){
  this.type = type;
}
  
//methodes

public abstract void carryCargo(int weight) throws DeppassementTonnageException; 

public void activateShield(){
  System.out.println("Activation du bouclier d'un vaiseau de type " + this.type);
};
public void desactivateShield(){
  System.out.println("Désactivation du bouclier de type "+ this.type);
};
}
