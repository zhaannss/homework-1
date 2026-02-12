package com.narxoz.rpg.character;
public class Bard extends BaseCh {
    public Bard (String name, String race, int age, String gender) {
        super(name, race, age, gender);
        this.health = 0;
        this.mana = 0;
        this.strength = 0;
        this.intelligence = 0;
        this.agility = 0;
    }
    @Override
    public void useSpecialAbility() {
        System.out.println(name + " ");
    }

}