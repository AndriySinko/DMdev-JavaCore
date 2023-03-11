package Day013.ExceptionTasks_52;

public class Task5 {
    /**
     * Бросить существующее в JDK исключение, отловить его, обработать, выбросить свое, и в причине указать выброшеное
     * JDK исключение
     */
    public static void main(String[] args) {
        System.out.println("main start");
        try {
            unsafe();
        }catch (RuntimeException e){
            throw new TestException1(e);
        }
        System.out.println("main end");
    }
    public static void unsafe(){
        throw new RuntimeException("Ошибка");
    }
}
