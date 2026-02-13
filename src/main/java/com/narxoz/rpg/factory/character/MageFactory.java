package com.narxoz.rpg.factory.character;
import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.Mage;
public class MageFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name, String race, int age, String gender) {
        return new Mage(name, race, age, gender);
    }
}
