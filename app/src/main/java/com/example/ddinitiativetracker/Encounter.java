package com.example.ddinitiativetracker;


/*  Encounter Class
        Encounters Have:
        -Title
        -Progress state (if the encounter is unstarted or in-progress)
        -Difficulty
        -Party
        -List of Monsters

        -Maybe rewards (gold/items), terrain effects (lair actions), background images (swamp, castle)


    Michael Marinaro & Patrick Mayo, May 2019
 */


import java.util.ArrayList;
import java.util.List;

public class Encounter {

    private String title;
    //private enum difficulty; //Enum: Trivial, Easy, Medium, Hard, Deadly
    private boolean inProgress = false;
    private List<Creature> party = new ArrayList<Creature>(); //Party should be its own class? Here for simplicity
    private List<Creature> creatures = new ArrayList<Creature>();
}
