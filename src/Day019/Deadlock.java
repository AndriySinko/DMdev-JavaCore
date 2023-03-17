package Day019;

public class Deadlock {
    /**
     * deadlock — ситуация при которой несколько процессов находятся в состоянии ожидания ресурсов, занятых
     * друг другом, и ни один из них не может продолжать свое выполнение.
     */
    public static void main(String[] args) throws InterruptedException {
        Account account1 = new Account(1000);
        Account account2 = new Account(3000);
        AccountThread accountThread1 = new AccountThread(account1,account2,100,10);
        AccountThread accountThread2 = new AccountThread(account2,account1,100,1000);
        accountThread1.start();
        accountThread2.start();
        accountThread1.join();
        accountThread2.join();
        System.out.println(account1+"\n"+account2);
    }
}
class Account{
    private static int gen = 1;
    private int id;
    private int money;

    public Account(int money) {
        this.money = money;
        this.id = gen++;
    }
    public void add(int money){
        this.money+=money;
    }
    public boolean takeOff(int money){
        if(this.money>=money){
            this.money-=money;
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

class AccountThread extends Thread{
    private Account accountTo;
    private Account accountFrom;
    private int money;
    private int value;

    public AccountThread(Account accountTo, Account accountFrom, int money, int value) {
        this.accountTo = accountTo;
        this.accountFrom = accountFrom;
        this.money = money;
        this.value = value;
    }

    @Override
    public void run() {
        for (int i = 0; i<this.value;i++){
            synchronized (accountFrom){
                synchronized (accountTo){
                    if (accountFrom.takeOff(this.money)) {
                        accountTo.add(this.money);
                    }
                }
            }
        }
    }
}