package Day9.Tasks_34;

public class Archer extends Hero {

    public Archer(String name,Enemy enemy) {
        super(name,enemy);
    }
    @Override
    public void attackEnemy(int damageEnemy) {
        System.out.println("Лучник по имени "+getName()+" стреляет у врага и наносит урон "+ damageEnemy);
        enemy.takeDamage(damageEnemy);
    }
}
