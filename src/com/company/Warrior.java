package com.company;

public  class Warrior {
    private int health;
    private String name;
    private int damage;

    //region  Getter and Setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    //endregion

    public Warrior(int health, String name, int damage) {
        this.health = health;
        this.name = name;
        this.damage = damage;
    }

    public Warrior() {
    }

    public void attack(Warrior oponent){
        oponent.setHealth(oponent.getHealth() - damage);
    }



}
