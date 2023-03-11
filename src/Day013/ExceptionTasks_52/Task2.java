package Day013.ExceptionTasks_52;

public class Task2 {
    /**
     * наптсать код который создаст и отловит ArrayIndexOutOfBoundsException
     */
    public static void main(String[] args) {
        System.out.println("main start");
        int[] ints = new int[10];
        try {
            for (int i = 0; i < 20; i++) {
                ints[i] = i;
            }
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Вы вышли за пределы массива, вызываем исключение типа RunTime");
            throw new ArrayIndexOutOfBoundsException();
        }
        System.out.println("main end");
    }
}