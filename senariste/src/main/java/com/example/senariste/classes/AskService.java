package com.example.senariste.classes;

import java.util.ArrayList;

public interface AskService {


    public abstract void addJoeur(Joueur joueur);
    public abstract Joueur searchQuestion(String joueur);
    public abstract void addCuriosite(Curiosite curiosite);
    public abstract void addProgression(Progression progression);
    public abstract ArrayList<Joueur> getJoueurs();

}
