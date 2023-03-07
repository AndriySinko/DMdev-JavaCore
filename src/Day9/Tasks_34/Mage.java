package Day9.Tasks_34;

public class Mage extends Hero {
    public Mage(String name,Enemy enemy) {
        super(name,enemy);
    }

    @Override
    public void attackEnemy(int damageEnemy) {
        System.out.println("Маг по имени "+getName()+" атакует врага своей магией и наносит урон "+ damageEnemy);
        enemy.takeDamage(damageEnemy);
    }
}
