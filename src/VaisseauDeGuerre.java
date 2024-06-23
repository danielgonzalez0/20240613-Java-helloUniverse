public class VaisseauDeGuerre extends Vaisseau{
  void attack(Vaisseau target, String weapon, int attackDuration){

System.out.println("Un vaisseau de type " + this.type + " attaque un vaisseau de type " + target.type + " avec l'arme " + weapon + " pendant " + attackDuration + " minutes");

target.shieldResistance = 0;
target.shielding = target.shielding / 2;

  };
}
