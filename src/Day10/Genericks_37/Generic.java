package Day10.Genericks_37;

import Day10.Genericks_37.Heroes.Archer;
import Day10.Genericks_37.Heroes.Enemy;
import Day10.Genericks_37.Heroes.Hero;
import Day10.Genericks_37.Weapons.Bow;
import Day10.Genericks_37.Weapons.Spear;
import Day10.Genericks_37.Weapons.Weapon;

public class Generic {
    /**
     * Джинерики это параметры которые позволяют нам приводить какие-то данные в до особого типа. И если мы попытаемся
     * в нас класс добавить что-то что не является относящееся к типу дженерика, будет ошибка компиляции.
     *
     * Дженерики могут ыбть на уровне классов(параметризовывать клаассы) и на уровне методов.
     */
    public static void main(String[] args) {
        Bow bow = new Bow();
        Enemy enemy = new Enemy(100);
        Archer<Bow> archer = new Archer<>("Леголас",enemy);
        archer.setWeapon(bow);
        printWeaponDamage(archer);
        System.out.println(enemy.getHealth());
        archer.takeDamageWeapon(bow);
        System.out.println(archer.getWeapon());
        System.out.println(enemy.getHealth());
        System.out.println();

        Archer<Spear> archer1 = new Archer<>("Гендольф",enemy);
        archer1.setWeapon( new Spear());
        printWeaponDamage(archer1);
        System.out.println(enemy.getHealth());
        archer1.takeDamageWeapon(archer1.getWeapon());
        System.out.println(archer1.getWeapon());
        System.out.println(enemy.getHealth());
    }
    public static <T extends Weapon> void printWeaponDamage(Hero<T> hero){
        System.out.print(hero.getName()+" наносит урон оружием "+hero.getWeapon()+" ");

    }
}
