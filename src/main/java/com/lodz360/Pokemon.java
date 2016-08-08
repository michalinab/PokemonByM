package com.lodz360;

/**
 * Created by michalina on 08/08/16.
 */
public class Pokemon implements PokemonInterfejs {
    protected String name;
    protected int combatpower;
    protected int hp;



    public String toString() {
        return name + " health: " + hp + "combat power: " + combatpower;
    }
}
