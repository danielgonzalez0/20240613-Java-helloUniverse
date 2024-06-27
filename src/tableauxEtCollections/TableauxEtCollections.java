package tableauxEtCollections;

import classes.Passager;
import classes.Ville;
import classes.Voiture;
import java.util.ArrayList;
import java.util.List;

public class TableauxEtCollections {
  public static void main(String[] args) {
    // tableaux unidimensionnels
    int[] tableauEntiers = new int[5];
    char[] tableauCaracteres = new char[5];
    Voiture[] tableauVoitures = new Voiture[5];

    tableauEntiers[1] = 2;
    tableauEntiers[4] = 5;

    System.out.println("tableauEntiers[1] = " + tableauEntiers[1]);
    System.out.println("la talle du tableau des caractères est " + tableauCaracteres.length);

    // ellipses et varargs
    // avant Java5 mise en place lourde pour passer un tableau en argument

    Voiture peugeot206 = new Voiture();
    peugeot206.color = "rouge";
    Passager passager1 = new Passager();
    passager1.firstName = "Jean";
    passager1.lastName = "Dupont";
    Ville depart = new Ville();
    depart.name = "Rennes";
    Ville etape1 = new Ville();
    etape1.name = "Paris";
    Ville etape2 = new Ville();
    etape2.name = "Lyon";
    Ville etape3 = new Ville();
    etape3.name = "Marseille";
    // Ville[] villesEtapes = new Ville[3];
    // villesEtapes[0] = etape1;
    // villesEtapes[1] = etape2;
    // villesEtapes[2] = etape3;
    // peugeot206.transport(passager1, depart, villesEtapes);
    peugeot206.transport(passager1, depart, etape1, etape2, etape3);
    // tableaux multidimensionnels
    int[][] tableauEntiers2D = new int[2][3];
    tableauEntiers2D[0][1] = 2;
    for (int i = 0; i < tableauEntiers2D.length; i++) {
      for (int j = 0; j < tableauEntiers2D[i].length; j++) {
        System.out.println("tableauEntiers2D[" + i + "][" + j + "] = " + tableauEntiers2D[i][j]);
      }
    }

    // collections
    // List

    List<Voiture>list = new ArrayList<>();
    list.add(peugeot206);
    list.add(peugeot206);
    list.add(peugeot206);

    list.remove(peugeot206);

    Voiture elVoiture = (Voiture) list.get(1);
    System.out.println("element index 1 = " + elVoiture.color);

  }
}
