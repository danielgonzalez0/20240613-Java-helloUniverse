package classes;

public class NombreCaracteresInvalidesException extends Exception{
  
  //constructeurs
  public NombreCaracteresInvalidesException(){
  }

  public NombreCaracteresInvalidesException(String message){
    super(message);
  }
}
