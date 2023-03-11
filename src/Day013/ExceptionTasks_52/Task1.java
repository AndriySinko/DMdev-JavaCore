package Day013.ExceptionTasks_52;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

public class Task1 {
    /**
     * Обьявите переменную null и вызовите с ней метод, отловите возникшее исключение
     */
    public static void main(String[] args) {
        System.out.println("main start");
    String s = null;
//    s.toUpperCase();
        try {
            s.toUpperCase();
        }catch (NullPointerException exception){
            exception.printStackTrace();
            System.out.println("Ошибка обработана");
        }
        System.out.println("main end");
    }
}
