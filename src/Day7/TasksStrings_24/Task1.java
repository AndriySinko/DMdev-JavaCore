package Day7.TasksStrings_24;

public class Task1 {
    /**
     * Заменить все :( смайлики в строке на :)
     *
     * метод replace() заменяет ваше первое значение на второе во всей строке.
     */
    public static void main(String[] args) {
        String str = "dasd as :( :( asdasd :) asdd:( :(:)";
        String result = str.replace(":(",":)");
        System.out.println(result);
    }
}
