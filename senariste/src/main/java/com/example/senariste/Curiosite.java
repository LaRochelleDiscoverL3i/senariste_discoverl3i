package com.example.senariste;

public class Curiosite {

    String joueur;
    String curiosite;

    public Curiosite(){}
    public Curiosite(String joueur, String curiosite){
        this.joueur=joueur;
        this.curiosite=curiosite;
    }

    public String getJoueur() {
        return joueur;
    }

    public void setJoueur(String joueur) {
        this.joueur = joueur;
    }

    public String getCuriosite() {
        return curiosite;
    }

    public void setCuriosite(String curiosite) {
        this.curiosite = curiosite;
    }
}
