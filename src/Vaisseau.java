public abstract class Vaisseau {
String type;
int nbPassagers;
int shielding;
int shieldResistance;
int currentCargoWeight;
int maxCargoWeight;

//methodes

abstract int carryCargo(int weight); 

void activateShield(){
  System.out.println("Activation du bouclier d'un vaiseau de type " + this.type);
};
void desactivateShield(){
  System.out.println("Désactivation du bouclier de type "+ this.type);
};
}
