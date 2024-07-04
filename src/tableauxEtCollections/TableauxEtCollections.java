package tableauxEtCollections;

import classes.Carre;
import classes.Passager;
import classes.Ville;
import classes.Voiture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

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
    peugeot206.setColor("rouge");
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

    List<Voiture> list = new ArrayList<>();
    list.add(peugeot206);
    list.add(peugeot206);
    list.add(peugeot206);

    list.remove(peugeot206);

    Voiture elVoiture = (Voiture) list.get(1);
    System.out.println("element index 1 = " + elVoiture.getColor());

    // set
    Voiture peugeot208 = new Voiture();
    peugeot208.setColor("vert");
    Voiture peugeot308 = new Voiture();
    peugeot308.setColor("noir");
    Voiture peugeot408 = new Voiture();
    peugeot408.setColor("bleu");

    Set<Voiture> setVoiture = new HashSet<>();
    setVoiture.add(peugeot208);
    setVoiture.add(peugeot308);
    setVoiture.add(peugeot408);

    System.out.println("la taille de setVoiture est " + setVoiture.size());
    Voiture setVoitureIndex2 = (Voiture) setVoiture.toArray()[2];
    System.out.println("la couleur de la voiture est a l'index 2 est " + setVoitureIndex2.getColor());

    for (Voiture voiture : setVoiture) {
      System.out.println("la couleur de la voiture est " + voiture.getColor());
    }

    Iterator<Voiture> iterator = setVoiture.iterator();
    while (iterator.hasNext()) {
      Voiture v = iterator.next();
      System.out.println("iterator: la couleur de la voiture est " + v.getColor());
    }

    // Map
    Map<String, Voiture> map = new HashMap<>();
    map.put("208", peugeot208);
    map.put("308", peugeot308);
    map.put("408", peugeot408);
    Voiture voitureCle308 = map.get("308");
    System.out.println("map : la couleur de la voiture 308 est " + voitureCle308.getColor());

    for (Map.Entry<String, Voiture> voiture : map.entrySet()) {
      String cle = voiture.getKey();
      Voiture valeur = voiture.getValue();
      System.out.println("map : la couleur de la voiture " + cle + " est " + valeur.getColor());
    }

    for (String key : map.keySet()) {
      System.out.println("map : la cle est " + key);
    }
    for (Voiture voiture : map.values()) {
      System.out.println("map : la couleur de la voiture est " + voiture.getColor());
    }

    System.out.println("la map est elle vide ? " + map.isEmpty());

    // trier les collections : ordre naturel des éléments
    List<Integer> listEntiers = new ArrayList<>();
    listEntiers.add(5);
    listEntiers.add(2);
    listEntiers.add(8);
    listEntiers.add(1);
    listEntiers.add(3);

    Collections.sort(listEntiers);
    for (Integer integer : listEntiers) {
      System.out.println("listEntiers : " + integer);
    }

    List<Carre> listCarres = new ArrayList<>();
    listCarres.add(new Carre(5L));
    listCarres.add(new Carre(2L));
    listCarres.add(new Carre(8L));
    listCarres.add(new Carre(1L));

    Collections.sort(listCarres);

    for (Carre carre : listCarres) {
      System.out.println("listCarres : " + carre.cote);
    }

//treeset et treemap

Set<Carre> setCarres = new TreeSet<>();
setCarres.add(new Carre(5L));
setCarres.add(new Carre(2L));
setCarres.add(new Carre(8L));
setCarres.add(new Carre(1L));

for (Carre carre : setCarres) {
  System.out.println("setCarres : " + carre.cote);
}

Map<Carre, Voiture> mapCarres = new TreeMap<>();
mapCarres.put(new Carre(5L), peugeot206);
mapCarres.put(new Carre(2L), peugeot208);
mapCarres.put(new Carre(8L), peugeot308);
mapCarres.put(new Carre(1L), peugeot408);

for (Map.Entry<Carre, Voiture> carre : mapCarres.entrySet()) {
  Carre cle = carre.getKey();
  Voiture valeur = carre.getValue();
  System.out.println("mapCarres : " + cle.cote + " " + valeur.getColor());
}

  }

}
