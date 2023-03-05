package Day7.TasksStrings_24;

public class Task3 {
    /**
     * Написать меод который принимает имя фамилию отчесвто и возвращает инициалы. Инициалы должны быть во верхнем регистре
     * topUpperCase() - все символы в нашей строке делает большими
     * charAt() - возвращает нам символ под заданым индексом
     * format() - вставляет на место %s нашу строку, %d число
     */
    public static void main(String[] args) {
        String result = getFio("Урста","Руслан","Русланович");
        System.out.println(result);
    }
    public static String getFio(String surname, String name, String patronymic){
        char n1 = surname.toUpperCase().charAt(0);
        char n2 = name.toUpperCase().charAt(0);
        char n3 = patronymic.toUpperCase().charAt(0);
        return String.format("%s.%s.%s.",n1,n2,n3);
    }
}
