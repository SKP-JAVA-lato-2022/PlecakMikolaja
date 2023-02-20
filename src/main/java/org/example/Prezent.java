package org.example;

public class Prezent {
    private String nazwa;
    private double waga;

    public Prezent(String nazwa, double waga) {
        this.nazwa = nazwa;
        this.waga = waga;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getWaga() {
        return waga;
    }
}
