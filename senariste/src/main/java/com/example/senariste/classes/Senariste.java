package com.example.senariste.classes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
public class Senariste {

    @Autowired
    AskService askService;

    /*
      route: localhost:8082/addJoueurs
      type: PUT
      ajout et mis à jour des  joueurs
     */
    @RequestMapping(value = "/addJoueur", method = RequestMethod.PUT)
    void addJoueur(@RequestBody Joueur joueur){


        askService.addJoeur(joueur);

    }


    /*
     route : localhost:8082/questionToAsk/{joeurs}

     */

    @RequestMapping(value = "/questionToAsk/{joueur}", method = RequestMethod.GET)
    @ResponseBody
    Joueur questionToAsk(@PathVariable String joueur){


            return askService.searchQuestion(joueur);


    }

    /*
    route : localhost:8082/joueurs
     reccueprer la liste des joeurs avec leurs niveaux
     */
    @RequestMapping(value = "/joueurs", method = RequestMethod.GET)
    @ResponseBody
    List<Joueur> getQuestion() {

        return askService.getJoueurs();
    }

    /*
      route : localhost:8082/curiosite
      type : POST
      recevoir la curioste d'un joueur afin de prendre une decision sur la question à poser
     */
    @RequestMapping(value = "/curiosite", method = RequestMethod.POST)
    void joueurCuriosite(@RequestBody Curiosite curiosite){


        askService.addCuriosite(curiosite);

    }
    /*
     route : localhost:8082/progression
     type : POST
     recevoir la progression d'un joueur afin de prendre une decision sur la question à poser
    */
    @RequestMapping(value = "/progression", method = RequestMethod.POST)
    void joueurCuriosite(@RequestBody Progression progression){


        askService.addProgression(progression);

    }


    /*
     pour simuler l'api GlobalApiSeer
     */
    @RequestMapping(value = "/api_progression", method = RequestMethod.POST)
    void apiProgression(@RequestBody Map<String, Integer> map ){


        System.out.println("recu");
    }
    /*
     pour simuler l'api GlobalApiSeer
     */
    @RequestMapping(value = "/api_curiosite", method = RequestMethod.POST)
    void apiCuriosite(@RequestBody Map<String, String> map ){


        System.out.println("recu");
    }







}

