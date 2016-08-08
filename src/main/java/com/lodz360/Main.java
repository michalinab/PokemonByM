/**
 * Created by michalina on 08/08/16.
 */
package com.lodz360;
public  class Main {
    public static void main(String[] args) {

        Pikaczu.createPikaczu(3); //tworzenie wielu Pikaczu
        Pikaczu pikaczu = new Pikaczu(); //delkaracja nowego obiektu typu Pikaczu, jak odwołać się do listy????
        pikaczu.gigglePokemon();
        pikaczu.isStrong();

        pikaczu.pikaczuEvolve();






        if(pikaczu.isStrong() ){
            System.out.println(pikaczu.name + " is very strong");

        }else {
            System.out.println(pikaczu.name + " is weak");
        }



    }
}
