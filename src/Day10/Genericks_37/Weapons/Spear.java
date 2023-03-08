package Day10.Genericks_37.Weapons;

public class Spear implements RangeWeapon{
    @Override
    public int takeDamage1() {
        return 10;
    }

    @Override
    public String toString() {
        return "Копье";
    }

    @Override
    public int getDamage() {
        return takeDamage1();
    }
}
