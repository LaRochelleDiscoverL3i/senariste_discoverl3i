# senariste_discoverl3i

Projet Discoverl3i

Les routes:
 - localhost:8082/questionToAsk/{joueur}   /* HTTP  GET */
 - localhost:8082/addJoueur    /* HTTP  POST */
 - localhost:8082/curiosite    /* HTTP POST */
 - localhost:8082/progression   /* HTTP POST */

Dans cette partie nous expliquerons la communication entre senariste et globalAPIServer.

Lors de chaque creation de compte d'un joueur globalAPIServer fait un post sur l'url(localhost:port/addJoueur) du senariste le json suivant:
    {
        - joueur
        - level_game  /* par exemple à la creation d'un compte le level_game d'un joueur est 1.
    }
Chaque fois aussi que le level_game d'un joueur augmente globalAPIServer envoie le meme json sur le meme url afin que le senariste soit à jour :
 



Pour que globalApiServer pose une question au joueur, il fait un get sur senariste ( url : localhost:port/questionToAsk/{joueur})
 ex: localhost:port/questionToAsk/toto
 sur ce url on trouve le json suivant :
    {
        - joueur
        - level_game
    }

    ex:
    {
        - "joueur": toto
        - level_game: 3
    }

    chaque fois que un joueur trouve une bonne reponse  , il tape sur ce url afin globalAPIServer fait des operation sur la base de donnes pour trouver une question pour un joueur correspondant à son niveau afin que globalApiServer met à jour la question que   phoneGap  reccupere sur l'url localhost:port/question/{joueur}




Chaque fois l'analyste fait des analyses sur la progression d'un joueur , globalAPIServer fait un Post sur l'url (localhost:port//progression) du senariste avec le json suivant :
    {
        - joueur
        - progression
    }

    ex: 
    {
        - "joueur": "toto"
        - progression: "bas",
        - "chercheur": "Armelle Prigent"
    }
  des que le senariste recoit le json , il fait des traitement et fait Post automatiquement sur globalAPIServer avec le json suivant :
    {
        -joueur: number
    }
    

    ex:
    {
        -"joueur": 4    / *  4 level de la question à poser au joueur
    }

    des que globalAPIServer recoit le json , elle doit automatiquement changer la question sur l'url phonegap de la joueur en lui posant une question de niveau de difficilite 4 dans l'exemple en dessus.



Chaque fois l'analyste fait des analyses sur la curiosite d'un joueur , globalAPIServer fait un Post sur l'url (localhost:port//curiosite) du senariste avec le json suivant :
    {
        - joueur
        - curiosite
    }

    ex: 
    {
        - "joueur": "toto"
        - curiosite: "eleve"
    }
  des que le senariste recoit le json , il fait des traitement et fait Post automatiquement sur globalAPIServer avec le json suivant :
    {
        -joueur: chercheur
    }
    

    ex:
    {
        -"joueur": "Jeanloup Guillaume"    / * 
    }

    des que globalAPIServer recoit le json , elle doit automatiquement changer la question sur l'url de phonegap de la joueur en lui posant une question sur "Jeanloup Guillaume" dans l'exemple en dessus.




Remarque : reste des petites amelioration à faire peut-etre.



