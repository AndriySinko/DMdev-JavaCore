package Day7.TasksStrings_24;

public class Task4 {
    /**
     * Подсчитать кол-во точек, запятых и восклицательных знаков.
     *
     * length() - возвращает нам длинну строки
     * replace() заменяет ваше первое значение на второе во всей строке.
     */
    public static void main(String[] args) {
        String string = "asdd.,,.asada!!..,assd.,,.!!!.";
        int result = getCountSymbols(string);
        System.out.println(result);
    }
    public static int getCountSymbols(String str){
        String result = str.replace(",","").replace(".","").replace("!","");
        return str.length() - result.length();
    }
}
