package com.espacex.decouverte.objetsastro;
import com.espacex.decouverte.enginsspatiaux.Vaisseau;

public class PlaneteTellurique extends Planet implements Habitable {
  String MATTER = "tellurique";
 public int totalVisitors;
  // Vaisseau stockedShip;
  int sizeDockingBay;
  Vaisseau[][] stockedSpaceShip;

  // constructeur
  public PlaneteTellurique() {
    super();
    this.sizeDockingBay = 5;
    this.stockedSpaceShip = new Vaisseau[2][this.sizeDockingBay];
    // System.out.println("Une nouvelle planète " + this.MATTER + " a été
    // découverte");
  }

  public PlaneteTellurique(String name, int sizeDockingBay) {
    super(name);
    this.sizeDockingBay = sizeDockingBay;
    this.stockedSpaceShip = new Vaisseau[2][this.sizeDockingBay];
  }

  // methode

  @Override
  public void welcomeSpaceship(Vaisseau... ships) {


    for (int i = 0; i < ships.length; i++) {
      // if (ships[i] instanceof VaisseauDeGuerre vaisseauDeGuerre) {
      //   vaisseauDeGuerre.desactivateWeapons();
      // }
      // if (this.stockedShip == null){
      // System.out.println("Aucun vaisseau ne s'en va");
      // } else {
      // System.out.println("Un vaisseau de type "+this.stockedShip.type+" doit s'en
      // aller");
      // }
      // Vaisseau leavingShip = this.stockedShip;
      boolean isFreeDockingBay = this.isFreeDockingBay(ships[i]);

      if (!isFreeDockingBay) {
        System.out.println("Pas de place pour le vaisseau dans la baie d'atterrissage");

      }

      if (ships[i] != null && ships[i].nbPassagers > 0) {
        this.totalVisitors += ships[i].nbPassagers;
      }
      // this.stockedShip = ship;
    }
  }

  public boolean isFreeDockingBay(Vaisseau ship) {


  int indexZone = switch (ship.type) {
    case CARGO, VAISSEAU_MONDE -> 1;
    case CHASSEUR, CROISEUR, FREGATE -> 0;
    default -> 0;
  };


    if (this.sizeDockingBay == 0) {
      System.out.println("Pas de baie d'atterrissage sur cette planète");
      return false;
    }
    int i = 0;
    while (i < this.sizeDockingBay) {
      if (this.stockedSpaceShip[indexZone][i] == null) {
        System.out.println("Le vaisseau "+ ship.type.nomTypeVaisseau +" c'est posé sur la planète " + this.name + " dans la baie " + i + " de la zone " + indexZone);
        this.stockedSpaceShip[indexZone][i] = ship;
        return true;
      }
      i++;
    }
    System.out.println("La baie d'atterrissage est pleine");
    return false;
  }

  public String getMATTER() {
    return MATTER;
  }
}
