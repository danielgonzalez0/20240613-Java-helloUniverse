package com.espacex.decouverte.enginsspatiaux;

public class VaisseauDeGuerre extends Vaisseau {

  // attributs
  Boolean isWeaponDesactivated = false;

  // constructeur

  public VaisseauDeGuerre(TypeVaisseau type) {
    super(type);
    switch (type) {
    case CHASSEUR -> this.maxCargoWeight = 0;
    case FREGATE -> this.maxCargoWeight = 50;
    case CROISEUR -> this.maxCargoWeight = 200;
    default -> this.maxCargoWeight = 0;
    }
  }

  // méthode
  public void attack(Vaisseau target, String weapon, int attackDuration) {

    if (this.isWeaponDesactivated) {
      System.out.println("Attaque impossible, l'armement est désactivé");
      return;
    }

    System.out.println("Un vaisseau de type " + this.type + " attaque un vaisseau de type " + target.type
        + " avec l'arme " + weapon + " pendant " + attackDuration + " minutes");

    target.shieldResistance = 0;
    target.shielding = target.shielding / 2;

  };

  private void desactivateWeapons() {
    this.isWeaponDesactivated = true;
  }

  @Override
  public void activateShield() {
    super.activateShield();
    this.desactivateWeapons();
  };

  @Override
  public void carryCargo(int weight) throws DeppassementTonnageException {

    int newWeight = this.currentCargoWeight + weight;

    if (this.maxCargoWeight == 0) {
      System.out.println("Ce vaisseau n'est pas conçu pour transporter des marchandises, quantité refusée: " + weight);
    }

    if (this.nbPassagers < 12) {
      System.out.println(
          "Le nombre de passagers minimum pour transporter des marchandises n'est pas atteint, quantité refusée: "
              + weight);
    }

    if (this.maxCargoWeight < weight) {
      int refusedWeight = weight - this.maxCargoWeight;
      throw new DeppassementTonnageException(refusedWeight);
    }

    if (weight > nbPassagers * 2) {
      int refusedWeight = weight - (nbPassagers * 2);
      throw new DeppassementTonnageException(refusedWeight);
    }

    if (newWeight > this.maxCargoWeight) {
      int refusedWeight = newWeight - this.maxCargoWeight;
      throw new DeppassementTonnageException(refusedWeight);
    }

    this.currentCargoWeight = newWeight;
    System.out.println("Le vaisseau de type " + this.type + " peut transporter " + weight + " tonnes de marchandises");

  };

}// end class
