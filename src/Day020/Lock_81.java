package Day020;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lock_81 {
    /**
     * Lock - классы которые захватывают мониторы наших обьектов и устраняют возможность дедлоков - аналог synchronized
     * Обычно лок присваивают какомуто полю, и мы захватываем монитор у этого поля, а это поле у наших обьектов на которых
     * мы вызвали лок
     */

    public static void main(String[] args) throws InterruptedException {
        Account account1 = new Account(10000);
        Account account2 = new Account(10000);
        AccountThread accountThread1 = new AccountThread(account1, account2, 100, 1000);
        AccountThread accountThread2 = new AccountThread(account2, account1, 100, 1000);
        accountThread1.start();
        accountThread2.start();
        accountThread1.join();
        accountThread2.join();
        System.out.println(account1 + "\n" + account2);
    }
}

class Account {
    private static int gen = 1;
    private final Lock lock = new ReentrantLock();
    private final int id;

    public Lock getLock() {
        return lock;
    }

    private int money;

    public Account(int money) {
        this.money = money;
        this.id = gen++;
    }

    public void add(int money) {
        this.money += money;
    }

    public boolean takeOff(int money) {
        if (this.money >= money) {
            this.money -= money;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }

}

class AccountThread extends Thread {
    private final Account accountTo;
    private final Account accountFrom;
    private final int money;
    private final int value;

    public AccountThread(Account accountTo, Account accountFrom, int money, int value) {
        this.accountTo = accountTo;
        this.accountFrom = accountFrom;
        this.money = money;
        this.value = value;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.value; i++) {
                lockAccount();
            try {
                if (accountFrom.takeOff(this.money)) {
                    accountTo.add(this.money);
                }
            } finally {
                accountFrom.getLock().unlock();
                accountTo.getLock().unlock();
            }
        }
    }

    private void lockAccount() {
        while (true){
            boolean resultLockFrom = accountFrom.getLock().tryLock();
            boolean resultLockTo = accountTo.getLock().tryLock();
            if(resultLockFrom && resultLockTo){
                break;
            }
            if (resultLockFrom){
                accountFrom.getLock().unlock();
            }
            if (resultLockTo){
                accountTo.getLock().unlock();
            }
        }
    }
}
