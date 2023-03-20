package Day022;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher_88 {
    public static void main(String[] args) {
        //1 спосбоб
        String s = "+380 (45) 477-44-05";
        Pattern pattern = Pattern.compile("(\\+380)? ?\\(\\d{2}\\) ?\\d{3}-\\d{2}-\\d{2}");
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.matches());

        //2 способ
        String regex = "(\\+380)? ?\\(\\d{2}\\) ?\\d{3}-\\d{2}-\\d{2}";
        System.out.println(Pattern.matches(regex,s));

        //3 способ
        System.out.println(s.matches(regex));
    }
}
