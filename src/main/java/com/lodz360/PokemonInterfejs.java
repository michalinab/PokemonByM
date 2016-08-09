package com.lodz360;

/**
 * Created by michalina on 08/08/16.
 */
public interface PokemonInterfejs {//interfejs musi być publiczny, bo inaczejnie ma sensu - zbior metod, które implementują klasy
                                        // zawsze jest abstract
    String toString();

    boolean isStrong();

    void gigglePokemon();
}
