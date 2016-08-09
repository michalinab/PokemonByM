/**
 * Created by michalina on 08/08/16.
 */
package com.lodz360;

import java.util.ArrayList;
import java.util.List;

public final class Pikaczu extends Pokemon implements PokemonInterfejs {//klasa final -nie można po niej dziedziczyć
    public Pikaczu() { //publiczny obiekt Pikaczu - możemy się do niego odwoływać w innych klasach
        this.name = "Pikaczu"; //ponieważ Pikaczu dziedziczy po Pokemonach to musi posiadać name, combatpower i hp
        this.combatpower = 100;
        this.hp = 1000;
    }

    public static void createPikaczuList(int n) { //metoda do tworzenia wielu Pikaczu, która nic nie zwraca -void, publiczna ponieważbędziemy z niej korzystać poza klasą
        List<Pikaczu> pikaczuList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            pikaczuList.add((new Pikaczu()));

        }
        System.out.println(pikaczuList);
    }

    public boolean isStrong() {  //metoda dla Pokemonów - implementujemy Interfejs Pokemonów z metodami, zatem każda musi się tu znaleźć
        if (combatpower >= 500) {//public boolean - metoda publiczna zwraca wartość true or false
            return true;
        } else {
            return false;
        }
    }

    public void gigglePokemon() {      //metoda dla Pokemonów
        System.out.println("hihihihihi");
    }//jak wyżej
                                                                        //void-nic nie zwraca

    public void pikaczuEvolve() {    //metoda tylko dla Pikaczu, nic nie zwraca
        Raichu raichu = null;
        if (combatpower + hp > 1000) {
            raichu = new Raichu("RaichuFromPikaczu", 200, 1000);
        }
        System.out.println("WoW! Twój Pikaczu to teraz: " + raichu.toString());
    }
}
