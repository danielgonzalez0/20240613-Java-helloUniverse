package com.espacex.decouverte.enginsspatiaux;
public abstract class Vaisseau {
public TypeVaisseau type;
public int nbPassagers;
public int shielding;
public int shieldResistance;
protected  int currentCargoWeight;
public int maxCargoWeight;

//methodes

public abstract int carryCargo(int weight); 

public void activateShield(){
  System.out.println("Activation du bouclier d'un vaiseau de type " + this.type);
};
public void desactivateShield(){
  System.out.println("Désactivation du bouclier de type "+ this.type);
};
}
