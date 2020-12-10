package com.example.senariste;

public class Joueur {

    String joueur;
    Integer level_game;



    public Joueur(){}



    public Joueur(String joeur , Integer level_game){
        this.joueur=joueur;
        this.level_game=level_game;
    }

    public String getJoueur() {
        return joueur;
    }

    public void setJoueur(String joueur) {
        this.joueur = joueur;
    }

    public Integer getLevel_game() {
        return level_game;
    }

    public void setLevel_game(Integer level_game) {
        this.level_game = level_game;
    }
}
