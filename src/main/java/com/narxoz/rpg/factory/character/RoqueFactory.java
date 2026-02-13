package com.narxoz.rpg.factory.character;
import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.Roque;
public class RoqueFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name, String race, int age, String gender) {
        return new Roque(name, race, age, gender);
    }
}
