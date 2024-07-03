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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Carre carre = (Carre) o;
    return cote.equals(carre.cote);
  }

  @Override
  public int hashCode() {
    return cote.hashCode();
  }
  
}
