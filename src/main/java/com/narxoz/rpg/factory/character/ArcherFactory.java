package com.narxoz.rpg.factory.character;
import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.Archer;
public class ArcherFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name, String race, int age, String gender) {
        return new Archer(name, race, age, gender);
    }
}
