package org.example.imcPack;

public class Imc {

    private double poids;
    private double taille;

    public Imc(double poids, double taille) {
        this.poids = poids;
        this.taille = taille;
    }

    public double calcul() {
        return poids / (taille * taille);
    }
}
