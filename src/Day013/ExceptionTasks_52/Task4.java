package Day013.ExceptionTasks_52;

public class Task4 {
    /**
     * Сделать тоже самое что в задании 3, только унаследовать RuntimeException и в конструктор добавить возможность
     * вывода сообщения
     */
    public static void main(String[] args) {
        System.out.println("main start");
        exceptionExample();
        System.out.println("main end");
    }
    public static void exceptionExample(){
        throw new TestException1(new RuntimeException());
    }
}
class TestException1 extends RuntimeException{
    public TestException1(Throwable s){
        System.out.println(s);
    }
}
