package com.example.senariste.classes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
public class Senariste {

    @Autowired
    AskService askService;


    @RequestMapping(value = "/addJoueur", method = RequestMethod.POST)
    void addJoueur(@RequestBody Joueur joueur){


        askService.addJoeur(joueur);

    }

    @RequestMapping(value = "/questionToAsk/{joueur}", method = RequestMethod.GET)
    @ResponseBody
    Joueur questionToAsk(@PathVariable String joueur){


            return askService.searchQuestion(joueur);


    }

    @RequestMapping(value = "/joueurs", method = RequestMethod.GET)
    @ResponseBody
    List<Joueur> getQuestion() {

        return askService.getJoueurs();
    }


    @RequestMapping(value = "/curiosite", method = RequestMethod.POST)
    void joueurCuriosite(@RequestBody Curiosite curiosite){


        askService.addCuriosite(curiosite);

    }

    @RequestMapping(value = "/progression", method = RequestMethod.POST)
    void joueurCuriosite(@RequestBody Progression progression){


        askService.addProgression(progression);

    }

    @RequestMapping(value = "/api_progression", method = RequestMethod.POST)
    void apiProgression(@RequestBody Map<String, Integer> map ){


        System.out.println("recu");
    }
    @RequestMapping(value = "/api_curiosite", method = RequestMethod.POST)
    void apiCuriosite(@RequestBody Map<String, String> map ){


        System.out.println("recu");
    }







}

