package org.example;

import java.util.HashMap;

public class Magazyn {
    private HashMap<Integer, Prezent> magazynPrezentow;

    public Magazyn(HashMap<Integer, Prezent> magazynPrezentow) {
        this.magazynPrezentow.put(1, new Prezent("Miś",0.89));
        this.magazynPrezentow.put(2, new Prezent("Hulajnoga",2.59));
        this.magazynPrezentow.put(3, new Prezent("Laka",0.87));
        this.magazynPrezentow.put(4, new Prezent("Sukienka",0.24));
        this.magazynPrezentow.put(5, new Prezent("Konik",1.12));
        this.magazynPrezentow.put(6, new Prezent("Klocki",1.67));
        this.magazynPrezentow.put(7, new Prezent("Hantle",3.89));
    }
}
