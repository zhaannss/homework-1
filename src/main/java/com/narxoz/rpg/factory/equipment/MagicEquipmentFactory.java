package com.narxoz.rpg.factory.equipment;
import com.narxoz.rpg.equipment.*;
public class MagicEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new ArcaneStaff();
    }
    @Override
    public Armor createArmor() {
        return new Robe();
    }
}
