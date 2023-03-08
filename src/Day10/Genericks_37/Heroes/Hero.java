package Day10.Genericks_37.Heroes;

import Day10.Genericks_37.Weapons.Weapon;
import Day9.Interfaces_32_33.Test1;

public abstract class Hero<T extends Weapon> {
    Enemy enemy;
    private String name;
    private T weapon;
    public abstract void takeDamageWeapon(T weapon);

    public Hero(String name, Enemy enemy) {
        this.name = name;
        this.enemy = enemy;
    }

    public String getName() {
        return name;
    }
    public abstract void attackEnemy(int damageEnemy);

    public T getWeapon() {
        return weapon;
    }
    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

}
