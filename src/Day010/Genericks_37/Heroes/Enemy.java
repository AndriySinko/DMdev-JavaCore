package Day10.Genericks_37.Heroes;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        if (health > 0) {
            return health;
        } else {
            return 0;
        }
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int takeDamage(int damage) {
        if (health > 0) {
            return health -= damage;
        } else {
            return 0;
        }
    }

    @Override
    public boolean isAlive() {
        boolean result = false;
        if (health > 0) {
            result = true;
        }
        return result;
    }
}

