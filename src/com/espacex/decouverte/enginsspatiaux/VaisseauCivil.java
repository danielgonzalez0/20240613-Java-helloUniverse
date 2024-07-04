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
public int carryCargo(int weight){
int newWeight = this.currentCargoWeight + weight;

  if(this.maxCargoWeight == 0){
    System.out.println("Ce vaisseau n'est pas conçu pour transporter des marchandises, quantité refusée: " + weight);
    return weight;
  }

  if(this.maxCargoWeight < weight ){
    System.out.println("Le poids de la cargaison est trop important pour ce vaisseau, quantité refusée:  " + (weight - this.maxCargoWeight));
    return weight - this.maxCargoWeight;
  }

if(newWeight > this.maxCargoWeight){
  int refusedWeight = newWeight - this.maxCargoWeight;
  System.out.println("Le poids de la cargaison est trop important pour ce vaisseau, quantité refusée: " + refusedWeight);
  return refusedWeight;
}

this.currentCargoWeight = newWeight;
System.out.println("Le vaisseau de type " + this.type + " peut transporter " + weight + " tonnes de marchandises");
return 0;

};
}
