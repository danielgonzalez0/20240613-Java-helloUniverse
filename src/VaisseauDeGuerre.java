public class VaisseauDeGuerre extends Vaisseau{

//attributs
Boolean isWeaponDesactivated = false;

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
}
