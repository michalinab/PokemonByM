package com.lodz360;

/**
 * Created by michalina on 08/08/16.
 */
public class Raichu extends Pokemon implements PokemonInterfejs {
    public Raichu() {
        this.name = "Raichu";
        this.combatpower = 500;
        this.hp = 2000;
    }

    public boolean isStrong() {
        if (combatpower >= 500) {
            return true;
        } else {
            return false;
        }
    }

    public void gigglePokemon(){
        System.out.println("hahahahaha");    }

}
