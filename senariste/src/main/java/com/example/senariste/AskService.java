package com.example.senariste;

import java.util.HashMap;
import java.util.Map;

public interface AskService {


    public abstract void addJoeur(Joueur joueur);
    public abstract Joueur searchQuestion(String joueur);
    public abstract void addCuriosite(Curiosite curiosite);
    public abstract void addProgression(Progression progression);


}
