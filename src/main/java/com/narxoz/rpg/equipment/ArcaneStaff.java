package com.narxoz.rpg.equipment;
public class ArcaneStaff implements Weapon {
    private int damage;
    private String name;
    private String type;
    private String specialEffect;

    public ArcaneStaff() {
        this.damage = 35;
        this.name = "Arcane Staff";
        this.type = "Staff";
        this.specialEffect = "Can fill itself with natural mana";
    }
    @Override
    public int getDamage() {
        return damage;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getType() {
        return type;
    }
    @Override
    public String getSpecialEffect() {
        return specialEffect;
    }
}