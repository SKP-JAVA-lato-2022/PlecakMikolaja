package org.example;

import java.util.ArrayList;

public class Magazyn {
    private ArrayList<Prezent> magazynPrezentow;

    public Magazyn(ArrayList<Prezent> magazynPrezentow) {
        this.magazynPrezentow.add(new Prezent("Miś", 0.54));
        this.magazynPrezentow.add(new Prezent("Konik", 2.59));
        this.magazynPrezentow.add(new Prezent("Lalka", 0.87));
        this.magazynPrezentow.add(new Prezent("Sukienka", 0.24));
        this.magazynPrezentow.add(new Prezent("Klocki", 1.12));
        this.magazynPrezentow.add(new Prezent("Nerf", 1.67));
        this.magazynPrezentow.add(new Prezent("Hantle", 3.89));
    }
}
