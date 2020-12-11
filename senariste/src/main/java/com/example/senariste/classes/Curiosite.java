package com.example.senariste.classes;

public class Curiosite {

    String joueur;
    String curiosite;
    String chercheur;


    public Curiosite(){}
    public Curiosite(String joueur, String curiosite){
        this.joueur=joueur;
        this.curiosite=curiosite;
    }

    public String getChercheur() {
        return chercheur;
    }

    public void setChercheur(String chercheur) {
        this.chercheur = chercheur;
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
