package com.example.ddinitiativetracker;
import java.util.LinkedList;
import java.util.List;

/**  ViewModel to store data

    @author Michael Marinaro & Patrick Mayo, May 2019
 */
public class ViewModel
{
    private List<Encounter> encounterList;
    private Creature creature;
    private Manager manager;

    /**
     * Default Constructor
     */
    protected ViewModel()
    {
        encounterList = new LinkedList<Encounter>();
    }

    /**
     * Constructor
     * @param manager The manager to initialize
     */
    protected ViewModel(Manager manager)
    {
        this.manager = manager;
        encounterList = new LinkedList<Encounter>();
    }

    /**
     * Add an encounter to the encounterList
     * @param encounter The encounter to be added.
     * @return True if added successfully
     */
    public boolean addEncounter(Encounter encounter)
    {
        return encounterList.add(encounter);
    }


    //Getters and Setters
    public List<Encounter> getEncounterList(){
        return encounterList;
    }
    public void setEncounterList(List<Encounter> encounterList)
    {
        this.encounterList = encounterList;
    }
    public Creature getCreature() {
        return creature;
    }
    public void setCreature(Creature creature) {
        this.creature = creature;
    }
    public String getCreatureName() {
        return creature.getName();
    }
    public String getCreatureAC() {
        return Integer.toString(creature.getAc());
    }
    public String getCreatureInit() {
        return Integer.toString(creature.getInitiative());
    }
}
