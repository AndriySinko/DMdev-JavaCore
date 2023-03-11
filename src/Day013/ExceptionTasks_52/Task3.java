package Day013.ExceptionTasks_52;

public class Task3 {
    /**
     * Создать свое исключение, создать метод который его ловит, обработать его, и вывести stackTrace
     */
    public static void main(String[] args) {
        System.out.println("main start");
        try {
            testEx();
        } catch (TestException e) {
            e.printStackTrace();
        }
        System.out.println("main end");
    }
    public static void testEx() throws TestException{
        throw new TestException();
    }
}
class TestException extends Exception {
}