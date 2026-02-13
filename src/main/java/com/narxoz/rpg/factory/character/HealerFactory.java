package com.narxoz.rpg.factory.character;
import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.Healer;
public class HealerFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name, String race, int age, String gender) {
        return new Healer(name, race, age, gender);
    }
}
