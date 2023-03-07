package Day9.Tasks_34;

public class Warrior extends Hero {
    public Warrior(String name,Enemy enemy) {
        super(name,enemy);
    }

    @Override
    public void attackEnemy(int damageEnemy) {
        System.out.println("Воин по имени "+getName()+" атакует врага мечом и наносит урон "+damageEnemy);
        enemy.takeDamage(damageEnemy);
    }
}
