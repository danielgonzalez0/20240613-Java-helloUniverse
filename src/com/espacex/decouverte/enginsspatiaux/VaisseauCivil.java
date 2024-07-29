package com.espacex.decouverte.enginsspatiaux;
public class VaisseauCivil extends Vaisseau{

  //constructeur

public VaisseauCivil(TypeVaisseau type){
super(type);
switch (this.type) {
  case CARGO-> this.maxCargoWeight = 500;
  case VAISSEAU_MONDE-> this.maxCargoWeight = 2000;
default -> this.maxCargoWeight = 0;
}
}

//méthode
@Override
public void carryCargo(int weight) throws DeppassementTonnageException{
int newWeight = this.currentCargoWeight + weight;
int tonnageEnExces = newWeight - this.maxCargoWeight;

  if(this.maxCargoWeight == 0){
    System.out.println("Ce vaisseau n'est pas conçu pour transporter des marchandises, quantité refusée: " + weight);
  }

  if(this.maxCargoWeight < weight || newWeight > this.maxCargoWeight){
    throw new DeppassementTonnageException(tonnageEnExces);
  }

this.currentCargoWeight = newWeight;
System.out.println("Le vaisseau de type " + this.type + " peut transporter " + weight + " tonnes de marchandises");


};
}
