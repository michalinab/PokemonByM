package com.lodz360;

/**
 * Created by michalina on 08/08/16.
 */
public class Raichu extends Pokemon implements PokemonInterfejs {
    public Raichu(String name, int combatpower, int hp) {
        this.name = name;
        this.combatpower = combatpower;
        this.hp = hp;
    }

    public boolean isStrong() {//metody z Interfejsu, opisane w Pikaczu
        if (combatpower >= 500) {
            return true;
        } else {
            return false;
        }
    }

    public void gigglePokemon() {
        System.out.println("hahahahaha");
    }

}
