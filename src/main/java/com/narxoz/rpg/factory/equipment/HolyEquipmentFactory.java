package com.narxoz.rpg.factory.equipment;
import com.narxoz.rpg.equipment.*;
public class HolyEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new HolyWand();
    }
    @Override
    public Armor createArmor() {
        return new Robe();
    }
}
