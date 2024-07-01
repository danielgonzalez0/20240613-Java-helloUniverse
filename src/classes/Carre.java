package classes;

public class Carre implements Comparable<Object>{
  
  public Long cote;

 public Carre(Long cote) {
    this.cote = cote;
  }

  @Override
  public int compareTo(Object o) {
    Carre autreCarre = (Carre) o;
   return this.cote.compareTo(autreCarre.cote);
  }
}
