/**
 * Created by michalina on 08/08/16.
 */
package com.lodz360;

public class Main {//klasa Main musi być publiczna, wejście do programu, łączy, klei pozostałe klasy
    public static void main(String[] args) {//metoda mian służy do komuniacji z użytkownikiem, pobiera i wyświetla dane

        Pikaczu.createPikaczuList(3);
        Pikaczu pikaczu = new Pikaczu();
        pikaczu.gigglePokemon();
        pikaczu.isStrong();

        pikaczu.pikaczuEvolve();


        if (pikaczu.isStrong()) {
            System.out.println(pikaczu.name + " is very strong");

        } else {
            System.out.println(pikaczu.name + " is weak");
        }



        int a;


    }
}
