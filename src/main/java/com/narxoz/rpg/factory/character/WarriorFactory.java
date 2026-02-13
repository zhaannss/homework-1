package com.narxoz.rpg.factory.character;
import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.Warrior;
public class WarriorFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name, String race, int age, String gender) {
        return new Warrior(name, race, age, gender);
    }
}
