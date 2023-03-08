package Day10.Genericks_37.Weapons;

public class Bow implements RangeWeapon{
    @Override
    public int takeDamage1() {
        return 15;
    }

    @Override
    public String toString() {
        return "Лук";
    }

    @Override
    public int getDamage() {
        return takeDamage1();
    }
}
