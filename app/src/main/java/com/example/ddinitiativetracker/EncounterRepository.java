package com.example.ddinitiativetracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* Singleton Repository for all Encounters and encounter information

    Michael Marinaro & Patrick Mayo, May 2019
 */

public class EncounterRepository {

    private static EncounterRepository repository = null;

    private List<Creature> creatureList;
    private LinkedList<Encounter> encounterList;

    private EncounterRepository(){
        creatureList = test();
        sortInit(creatureList); //TODO: Remove this test.
    }

    public static EncounterRepository getInstance(){
        if (repository == null)
            repository = new EncounterRepository();

        return repository;
    }

    public List<Creature> getCreatureList() {
        return creatureList;
    }

    public void setCreatureList(List<Creature> creatures) {
        creatureList = creatures;
    }

    public void addCreature(Creature creature){
        creatureList.add(creature);
    }

    public void sortInit(List<Creature> cList){
        Collections.sort(cList, new InitiativeComparator());
    }

    //TEST LIST
    private List<Creature> test(){
        List<Creature> testCreatures = new ArrayList<>();

        testCreatures.add(new Monster("Goblin Infantry", 10, 1));
        testCreatures.add(new Monster("Goblin Boss", 15, 19));
        testCreatures.add(new Monster("Bugbear", 11, 8));
        testCreatures.add(new Monster("Red Dragon", 21, 19));
//        testCreatures.add(new Monster("Kobold Infantry", 10, 2));
//        testCreatures.add(new Monster("Kobold Boss", 13, 11));
//        testCreatures.add(new Monster("Guard Drake", 14, 12));
//        testCreatures.add(new Monster("Black Dragon", 1, 5));
        testCreatures.add(new Monster("Vilhelm", 18, 15));
        testCreatures.add(new Monster("Aldwin", 22, 7));

        return testCreatures;
    }
}
