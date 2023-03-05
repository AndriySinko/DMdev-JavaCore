package Day7.TasksStrings_24;

public class Task2 {
    /**
     * Написать метод который принимает 2 параметра: строку и слово, и возвращает true если строка начинается или
     * заканчивается на это слово
     *
     * startsWith() проверяет являеется ли первое значение во вашей строке равно заданой вами строке в параметры
     * endsWith() проверяет являеется ли последнее значение во вашей строке равно заданой вами строке в параметры
     */
    public static void main(String[] args) {
        String word = "Hello";
        String string = "Hello may name is Ruslan";
        boolean result = compareWord(string, word);
        System.out.println(result);
    }
    public static boolean compareWord(String string, String word){
        return string.startsWith(word) && string.endsWith(word);
    }
}
