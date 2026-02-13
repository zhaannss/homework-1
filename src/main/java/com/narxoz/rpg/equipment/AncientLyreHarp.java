package com.narxoz.rpg.equipment;
public class AncientLyreHarp implements Weapon {
    private int damage;
    private String name;
    private String type;
    private String specialEffect;

    public AncientLyreHarp() {
        this.damage = 35;
        this.name = "AncientLyreHarp";
        this.type = "Harp";
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