package com.narxoz.rpg.factory.equipment;
import com.narxoz.rpg.equipment.*;
public class ShadowEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new DarkDagger();
    }
    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }
}
