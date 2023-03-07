package Day9.Tasks_34;

public class Test {
    /**
     * 1.
     * Создать класс Hero, представляющий собой героя, и содержащий поле name.
     * Добавить конструктор с этим полем, и геттер для этого поля.
     * Добавить метод attackEnemy() - выводит в консоль "Герой атакует врага"
     * Создать класс Test с методом main, создать героя, и протестировать его атаку
     *
     * 2.
     * Создать классы Warrior Mage Archer, которые унаследовали класс Hero.
     * Переопределить метод attackEnemy() так чтобы выаодилось их специализированого сообщение об атаке
     * В класе Test протестируйте этих героев
     *
     * 3.
     * Создать класс Enemy представляющий собой врага и содержащий пол health, сдлать для этого поля конструктор, сет и гет
     * Создать мето takeDamage(int damage) который уменьшает кол-во здоровья в зависимости от полученного урона
     * Переопределить в классе Hero метод attackEnemy добавив ему парметр типа Enemy, метод должен вызывать метод
     * takeEnemy(int damage) и передать наносящее кол-во урона.
     * В класса Warrior Mage Archer переопределить метод attackEnemy() так чтобы они наносили разное кол-во урона
     *
     * 4.
     * Сделать класс Hero и метод attackEnemy абстрактным
     *
     * 5.
     * Создать интерфейс Mortal который реализовывает класс Enemy и сделать метод isAlive() который возвращает
     * true если здоровье Enemy больше 0
     */
    public static void main(String[] args) {
        Enemy enemy = new Enemy(100);
        Archer archer = new Archer("Всеволод",enemy);
        Warrior warrior = new Warrior("Володимир",enemy);
        Mage mage = new Mage("Игорь",enemy);
        System.out.println(enemy.getHealth());
        System.out.println(enemy.isAlive());
        mage.attackEnemy(20);
        warrior.attackEnemy(5);
        archer.attackEnemy(10);
        System.out.println(enemy.getHealth());
        System.out.println(enemy.isAlive());
        mage.attackEnemy(100);
        System.out.println(enemy.getHealth());
        System.out.println(enemy.isAlive());
    }
}
