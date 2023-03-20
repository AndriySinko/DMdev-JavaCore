package Day022;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAndGroup_89 {
    /**
     * Если метод .matches() возвращает нам только те строки, где все точь в точь сходится, то метод
     * .find() будет в строке искать все даные нашего regex
     * <p>
     * группа в регулярных выражениях обозначается ( ), и с помощью метода group можно выводить какие-то строки,
     * или самые группы. К группам можно обращатся по индексу или давать им имя с помощью ?<name>.
     * Сделать так чтобы при поиске какая-то группа не искалась, мы можем ее ограничить с помощью ?:
     */
    public static void main(String[] args) {
        List<String> phoneNumbers = new ArrayList<>();
        List<String> group1 = new ArrayList<>();
        List<String> group2 = new ArrayList<>();
        List<String> group3 = new ArrayList<>();
        List<String> group4 = new ArrayList<>();
        String string = "asdsassadsa (97) 677-43-67sdfsdfsf+380 (98) 645-24-92 +380 (65) 894-33-67 sasadsaas" +
                " (68) 555-44-33 asdasds +380 (56) 444-33-22";
        String regex = "(?:\\+380)? (?<one>\\(\\d{2}\\)) (?<two>\\d{3})-(?<three>\\d{2})-(?<for>\\d{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            phoneNumbers.add(matcher.group());
            group1.add(matcher.group("one"));
            group2.add(matcher.group(2));
            group3.add(matcher.group(3));
            group4.add(matcher.group("for"));
        }
        System.out.println("numbers: ");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
        System.out.println("\ngroup 1:");
        for (String s : group1) {
            System.out.println(s);
        }
        System.out.println("\ngroup 2:");
        for (String s : group2) {
            System.out.println(s);
        }
        System.out.println("\ngroup 3:");
        for (String s : group3) {
            System.out.println(s);
        }
        System.out.println("\ngroup 4:");
        for (String s : group4) {
            System.out.println(s);
        }
    }
}
