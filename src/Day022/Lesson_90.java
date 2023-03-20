package Day022;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson_90 {
    /**
     * Наши регулярные выражения можно заменить другими значениями с помощью StringBuilder и StringBuffer с помощью
     * appendReplacement() который заменяет нашнаше 1 рег. выражения на что-то дургое, но после него нужно
     * вызвать метод appendTail() который вернет нам все строки, которые идуь после регулярного выражения.
     * replaceAll() также используется для замены всех рег. выражений на что-то другое
     *
     * $ еще работает как ссылка, с помощью него мы можем обращатся к каким-то группам
     * $2 $3 и т.д
     */
    public static void main(String[] args) {
        String string = "asdsassadsa (97) 677-43-67sdfsdfsf+380 (98) 645-24-92 +380 (65) 894-33-67 sasadsaas" +
                " (68) 555-44-33 asdasds +380 (56) 444-33-22";
        String regex = "(?:\\+380)? (?<one>\\(\\d{2}\\)) (?<two>\\d{3})-(?<three>\\d{2})-(?<for>\\d{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()){
            matcher.appendReplacement(stringBuilder," XXX ");
        }
        matcher.appendTail(stringBuilder);

        System.out.println(string);
        System.out.println(stringBuilder);



        String string1 = "asdsassadsasa (97) 677-43-67sdfsdfsfasd+380 (98) 645-24-92 +380asdasd (65) 894-33-67 sasadsaas" +
                " (68) 555-44-33 asdasdsasd +380 (56) 444-33-22asdsdsa";

        Matcher matcher1 = pattern.matcher(string1);
        StringBuilder stringBuilder2 = new StringBuilder();
        while(matcher1.find()){
            matcher1.appendReplacement(stringBuilder2, " $1 $2-$3-$4 ");
        }

        System.out.println(stringBuilder2);
    }

}
