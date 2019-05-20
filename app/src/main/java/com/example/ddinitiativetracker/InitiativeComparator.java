package com.example.ddinitiativetracker;

import java.util.Comparator;

/**
 * A comparator used to sort Creatures by initiative.
 */
public class InitiativeComparator implements Comparator<Creature>
{
    /**
     * See {@link java.util.Comparator#compare(Object, Object)}
     */
    public int compare(Creature a, Creature b)
    {
        return a.getInitiative() - b.getInitiative();
    }
}
