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

    public static void createPikaczu(int n) {
        List <Pikaczu> pikaczuList = new ArrayList <>();

        for (int i = 1; i <= n; i++) {
            pikaczuList.add((new Pikaczu()));

        }
        System.out.println(pikaczuList);
    }


}
