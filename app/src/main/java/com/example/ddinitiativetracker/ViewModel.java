package com.example.ddinitiativetracker;

/*  ViewModel to draw info from creatures and populate creature cards

    Michael Marinaro & Patrick Mayo, May 2019
 */

public class ViewModel {
    private Creature creature;
    private Manager manager;
    private EncounterRepository repository = EncounterRepository.getInstance();

    public ViewModel(Manager manager) {
        this.manager = manager;
    }

    public Creature getCreature() {
        return creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }

    public String getName() {
        return creature.getName();
    }

    public String getAC() {
        return Integer.toString(creature.getAc());
    }

    public String getInit() {
        return Integer.toString(creature.getInitiative());
    }


    //Save a new creature to the current encounter from the text input from fragment_creature_creator
    public void saveNewCreature() {


    }

}
