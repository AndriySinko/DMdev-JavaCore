package Day9.Tasks_34;

public abstract class Hero {
    Enemy enemy;
    private String name;

    public Hero(String name,Enemy enemy) {
        this.name = name;
        this.enemy = enemy;
    }

    public String getName() {
        return name;
    }
    public abstract void attackEnemy(int damageEnemy);
}
