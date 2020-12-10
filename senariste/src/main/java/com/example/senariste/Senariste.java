package com.example.senariste;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


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


    @RequestMapping(value = "/curiosite", method = RequestMethod.POST)
    void joueurCuriosite(@RequestBody Curiosite curiosite){


        askService.addCuriosite(curiosite);

    }

    @RequestMapping(value = "/progression", method = RequestMethod.POST)
    void joueurCuriosite(@RequestBody Progression progression){


        askService.addProgression(progression);

    }







}

