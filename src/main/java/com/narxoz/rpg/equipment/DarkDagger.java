package com.narxoz.rpg.equipment;
public class DarkDagger implements Weapon {
    private int damage;
    private String name;
    private String type;
    private String specialEffect;

    public DarkDagger() {
        this.damage = 15;
        this.name = "DarkDagger";
        this.type = "Dagger";
        this.specialEffect = "";
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