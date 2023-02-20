package org.example;

import java.util.HashMap;

public class Pakowalnia {
    private HashMap<Integer, Prezent> magazynPrezentow;
    private final double pojemnoscPlecaka = 4.0;
    private int iloscKursow = 0;

    Magazyn magazyn = new Magazyn(magazynPrezentow);

    public Pakowalnia() {
        int obecnaWaga = 0;
        for (int i = 0; i < magazynPrezentow.size(); i++) {
            double waga = magazynPrezentow.get(i).getWaga();
            if(obecnaWaga + waga <= pojemnoscPlecaka) {
                obecnaWaga += waga;
            } else {
                iloscKursow++;
                obecnaWaga = 0;
            }
        }

        System.out.println(iloscKursow);
    }
}
