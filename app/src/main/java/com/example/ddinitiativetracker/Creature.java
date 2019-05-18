package com.example.ddinitiativetracker;

/*  Abstract creature, parent of Monster and Player.
        All Creatures:
  	    - Have a Name, AC, Initiative (for now)
  	    - Should also have an Icon (can default to creature type for monsters & class for players)
  	    - And all the other stats, including ability scores, movement, perception, ex.

    Michael Marinaro & Patrick Mayo, May 2019
 */

public abstract class Creature {
    String name;
    int ac;
    int initiative;

    public Creature(String name, int ac, int init) {
        this.name = name;
        this.ac = ac;
        this.initiative = init;
    }




    //Getters and Setters
    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }
}
