package Day013;

import java.io.IOException;

public class Exceptions_50_51 {
    /**
     * В джаве существует Класс Throwable который являеется родителем всех исключений/ошибок в джаве.
     * Исключения в джаве делятся на 2 типа:
     * Unchecked или RunTimeExceptions - это ошибки в работае программы которых быть не должно и их нужно устранять
     * Checked или CompileTimeExceptions - ошибки которые могут взникнуть в следствии каких-то ошибок в ходе
     * выполнения программы, и чтобы их устранить нужно их нужно обработать.
     *
     * Обрабатывать исключения можно 2 способами:
     * 1. пробрасывать их с помощью ключевого слова throws
     * 2. отлавливать их с помощью конструкии try catch и в каких-то случая finally
     * try()- туда мы пишем все методы или действия в следствии которых может возникнуть ошибка
     * catch() отслеживает определнные указанные нами ошибки и если отследит, то сделат какое-то действие
     * finally() метод который внезависимости есть ошибка или нет сделает какое-то действие
     *
     * Обычно после обработки исключения, программа продолжает свое выполнение
     * В случае с пробрасыванием, программа закончит свое выполнение как только наткнется на ошибку
     */
    public static void main(String[] args) {
        System.out.println("начинается выполнение программы");
        try {
            System.out.println("Заходим в блок обработки try");
            newException(135);
        } catch (OutOfMemoryError e) {
            System.out.println("Заходим в блок обработки catch");
            e.printStackTrace();
            System.out.println("catch обработало ошибку");
        }finally {
            System.out.println("Мы в блоке finally");
        }
        System.out.println("После обработки исключения");
    }
    public static void newException(int i)throws OutOfMemoryError{
        System.out.println("Заходим в метод newException и проверяем 'i'");
        if(i<10){
            System.out.println(i+" меньше 10, пробрасываем ошибку");
            throw new OutOfMemoryError();
        }else if(i>25){
            System.out.println(i+" больше 25, пробрасываем ошибку");
            throw new RuntimeException();
        }
        System.out.println(i+">10, и "+i+"<25 ошибки не произошло");
    }
}
