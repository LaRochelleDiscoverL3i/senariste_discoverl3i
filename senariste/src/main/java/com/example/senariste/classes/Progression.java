package com.example.senariste.classes;

public class Progression {

    String joueur;

    String progression;
    public Progression(){}
    public Progression(String joueur, String progression){
        this.joueur= joueur;
        this.progression= progression;
    }

    public String getProgression() {
        return progression;
    }

    public String getJoueur() {
        return joueur;
    }

    public void setProgression(String progression) {
        this.progression = progression;
    }

    public void setJoueur(String joueur) {
        this.joueur = joueur;
    }
}
