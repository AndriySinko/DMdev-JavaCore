package Day3.Tasks_11;

public class Task5 {
    /**
     * Вывести согласные буквы начиная с b пока не наткешся на гласную английском алфавите
     */
    public static void main(String[] args) {
        for(char i = 'b'; !isLowe(i); i++){
            System.out.println(i);
        }
    }
    public static boolean isLowe(char i){
        return i == 'a' || i == 'e' || i == 'o' || i == 'u' || i == 'i' || i == 'y';
    }
}
