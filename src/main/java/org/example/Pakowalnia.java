package org.example;

public class Pakowalnia {
    Magazyn magazyn = new Magazyn();
    Magazyn magazynPrezentow = new Magazyn();

    public Pakowalnia() {
        double obecnaWaga = 0;
        int iloscKursow = 0;
        for (int i = 1; i <= magazyn.getMagazynPrezentow().size(); i++) {
            double waga = magazyn.getMagazynPrezentow().get(i).getWaga();
            double pojemnoscPlecaka = 4.0;
            if(obecnaWaga + waga <= pojemnoscPlecaka) {
                obecnaWaga += waga;
            } else {
                iloscKursow++;
                obecnaWaga = waga;
            }
        }
        iloscKursow++;
        System.out.println("Ilość wykonanych kórsów: " + iloscKursow);
    }
}
