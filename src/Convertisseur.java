public class Convertisseur {
public static void main(String[] args) {
    short montantInitial=1500;
		float taux=1.22f;
		float resultat=montantInitial*taux;
    int arrondi = (int)resultat;
		
		System.out.println(arrondi);

    boolean estCeQueCestVrai = 20 != 30;
    System.out.println(estCeQueCestVrai);

    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool3 = bool1 || bool2;
    System.out.println("bool3 = " + bool3);

}
}
