/**
 * Created by michalina on 08/08/16.
 */
package com.lodz360;
import java.util.ArrayList;
import java.util.List;

public final class Pikaczu extends Pokemon implements PokemonInterfejs{
    public Pikaczu() {
        this.name = "Pikaczu";
        this.combatpower = 100;
        this.hp = 1000;
    }

    public static void createPikaczu(int n) { //kreator dla Pikaczu
        List <Pikaczu> pikaczuList = new ArrayList <>();

        for (int i = 1; i <= n; i++) {
            pikaczuList.add((new Pikaczu()));

        }
        System.out.println(pikaczuList);
    }

    public boolean isStrong() {  //metoda dla Pokemonów
        if (combatpower >= 500) {
            return true;
        } else {
            return false;
        }
    }

    public void gigglePokemon(){      //metoda dla Pokemonów
         System.out.println("hihihihihi");
    }

    public void pikaczuEvolve() {    //metoda tylko dla Pikaczu
        Raichu raichu = null;
        if (combatpower + hp > 1000) {
            raichu = new Raichu("RaichuFromPikaczu", 200, 1000);
        }
        System.out.println(raichu.toString());
    }
}
