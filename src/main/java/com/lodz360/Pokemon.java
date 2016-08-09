package com.lodz360;

/**
 * Created by michalina on 08/08/16.
 */ //klsay mogabyc public, private, packageprivate, -dostep
    //rodzaj abstract, final
public abstract class Pokemon implements PokemonInterfejs { //klasa abstrakcyja z konstruktorem obiektu typu Pokemon, można po niej dzidziczć
    protected String name;//zmienne protected - tylko w samym pakiecie i dziedziczące klasy mogą sięodwołać
    protected int combatpower;//mogą być public, private , packageprivate
    protected int hp;


    public String toString() {//motodymogąbyć public, private, packageprivate
        return name + " health: " + hp + "combat power: " + combatpower;
    }//metoda toString pozwalająca wyświetlenie elementu obiektu w postaci Stringa
}
