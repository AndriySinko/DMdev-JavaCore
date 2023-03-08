package Day10.Genericks_37.Heroes;

import Day10.Genericks_37.Weapons.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T> {

    public Archer(String name, Enemy enemy) {
        super(name,enemy);
    }
    @Override
    public void attackEnemy(int damageEnemy) {
        System.out.println("Лучник по имени "+getName()+" стреляет у врага и наносит урон "+ damageEnemy);
        enemy.takeDamage(damageEnemy);
    }
    @Override
    public void takeDamageWeapon(T weapon) {
        System.out.println(weapon.takeDamage1());
        enemy.takeDamage(weapon.takeDamage1());
    }



}
