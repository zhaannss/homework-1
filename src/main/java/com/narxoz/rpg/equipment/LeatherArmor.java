package com.narxoz.rpg.equipment;
public class LeatherArmor implements Armor {

    @Override
    public int getDefense() {
        return 5; // лёгкая защита
    }
    @Override
    public String getArmorInfo() {
        return "Leather Armor: Light armor made from tough animal hide. " +
                "Provides agility and basic protection.";
    }
    @Override
    public String getArmorType() {
        return "Light Armor";
    }
}
