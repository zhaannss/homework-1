package com.narxoz.rpg.factory.equipment;
import com.narxoz.rpg.equipment.*;
public class RangerEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new Elvenbow();
    }
    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }
}
