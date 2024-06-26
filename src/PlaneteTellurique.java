public class PlaneteTellurique extends Planet implements Habitable {
  String MATTER = "tellurique";
  int totalVisitors;
  Vaisseau stockedShip;

  //constructeur
  public PlaneteTellurique(){
    super();
    // System.out.println("Une nouvelle planète " + this.MATTER + " a été découverte");
  }

  public PlaneteTellurique(String name){
    super(name);
  }

    @Override
    public Vaisseau welcomeSpaceship(Vaisseau ship) {

    if (ship instanceof VaisseauDeGuerre vaisseauDeGuerre){
          vaisseauDeGuerre.desactivateWeapons();
    }
           if (this.stockedShip == null){
    System.out.println("Aucun vaisseau ne s'en va");
  } else {
    System.out.println("Un vaisseau de type "+this.stockedShip.type+" doit s'en aller");
  }
    Vaisseau leavingShip = this.stockedShip;
    if(ship != null && ship.nbPassagers > 0) {
        this.totalVisitors += ship.nbPassagers;
    }
    this.stockedShip = ship;
    return leavingShip;
    }

    public String getMATTER() {
        return MATTER;
    }
}
