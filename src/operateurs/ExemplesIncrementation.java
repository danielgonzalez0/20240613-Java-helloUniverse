package operateurs;

public class ExemplesIncrementation {
  public static void main(String[] args) {
      int valeurEntiere = 5;
      int valeurEntiere2;

      valeurEntiere2 = valeurEntiere++;
      System.out.println("valeurEntiere2 = " + valeurEntiere2);
      System.out.println("valeurEntiere = " + valeurEntiere);
      valeurEntiere2 = ++valeurEntiere;
      System.out.println("valeurEntiere2 = " + valeurEntiere2);
  }
}
