

public class VaisseauDeGuerre extends Vaisseau{

//attributs
Boolean isWeaponDesactivated = false;

//constructeur

VaisseauDeGuerre(){
}

VaisseauDeGuerre(String type){
this.type = type;
switch (type) {
  case "CHASSEUR"-> this.maxCargoWeight = 0;
  case "FREGATE"-> this.maxCargoWeight = 50;
  case "CROISEUR"-> this.maxCargoWeight = 200;
default -> this.maxCargoWeight = 0;
}
}

//méthode
  void attack(Vaisseau target, String weapon, int attackDuration){

  if(this.isWeaponDesactivated){
    System.out.println("Attaque impossible, l'armement est désactivé");
    return;
  }

System.out.println("Un vaisseau de type " + this.type + " attaque un vaisseau de type " + target.type + " avec l'arme " + weapon + " pendant " + attackDuration + " minutes");

target.shieldResistance = 0;
target.shielding = target.shielding / 2;

  };

void desactivateWeapons(){
  this.isWeaponDesactivated = true;
 
}

@Override
void activateShield(){
super.activateShield();
this.desactivateWeapons();
};



@Override
int carryCargo(int weight){

int newWeight = this.currentCargoWeight + weight;

  if(this.maxCargoWeight == 0){
    System.out.println("Ce vaisseau n'est pas conçu pour transporter des marchandises, quantité refusée: " + weight);
    return weight;
  }

  if(this.nbPassagers < 12){
    System.out.println("Le nombre de passagers minimum pour transporter des marchandises n'est pas atteint, quantité refusée: " + weight);
    return weight;
  }

  if(this.maxCargoWeight < weight ){
    System.out.println("Le poids de la cargaison est trop important pour ce vaisseau, quantité refusée:  " + (weight - this.maxCargoWeight));
    return weight - this.maxCargoWeight;
  }

if(weight > nbPassagers * 2){
  int refusedWeight = weight - (nbPassagers * 2);
  System.out.println("Le poids de la cargaison est trop important par rapport au nombre de passagers, quantité refusée: " + refusedWeight);
  return refusedWeight;
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

}//end class

