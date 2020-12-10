package com.example.senariste;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class AskServiceImp implements AskService{

    ArrayList<Joueur> joueurs = new ArrayList<Joueur>(); // Create an ArrayList object



    @Override
    public void addJoeur(Joueur joueur) {

        joueurs.add(joueur);

    }



    @Override
    public Joueur searchQuestion(String joueur) {
        Joueur currentJoueur= new Joueur();
        for(Joueur j : joueurs)
        {
            if(j.getJoueur().equals(joueur)){
                currentJoueur.setJoueur(joueur);
                currentJoueur.setLevel_game(j.getLevel_game());

            }
        }
        return currentJoueur;

    }
    public Integer niveau(String joueur){
        Integer num=0;

        for(Joueur j : joueurs)
        {
            if(j.getJoueur().equals(joueur)){
                num= j.getLevel_game();

            }
        }
        return num;
    }

    @Override
    public void addCuriosite(Curiosite curiosite) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        RestTemplate template = new RestTemplate();
        String url = "http://localhost:8080/api";
        if(curiosite.getCuriosite().equals("eleve")){

            map.put(curiosite.getJoueur(), niveau(curiosite.getJoueur()) );
            template.postForLocation(url, map);
        }


        //template.postForLocation(url, rep);
    }

    @Override
    public void addProgression(Progression progression) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        RestTemplate template = new RestTemplate();
        String url = "http://localhost:8080/api";
        if(progression.getProgression().equals("bas")){

            map.put(progression.getJoueur(), 1 );
            template.postForLocation(url, map);
        }
         if (progression.getProgression().equals("fort")){
             map.put(progression.getJoueur(), niveau(progression.getJoueur() + 1) );
             template.postForLocation(url, map);
         }

    }


}
