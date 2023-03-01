package Day3.Tasks_11;

public class Task1 {
    /**
     * Напсиать программу которая выщитывает факторил числа x
     */
    public static void main(String[] args) {
        int value =10;
        facForVoid(value);

        int x = facWhileInt(value);
        System.out.println(x);
    }
    static void facForVoid(int i){
        int result = 1;
        System.out.println("Факториал чила "+i+" с помощью цикла for, и ничего не возвращающего типа данных void");
        for(int y=1;y<=i;y++){
            result*=y;
            System.out.print(result+" ");
        }
    }
    static int facWhileInt(int i){
        System.out.println("\n\nФакториал числа "+i+" с помощью цикла while, и возвращаемого типа данных int");
        int x = 1;
        int result = 1;
        while(x<=i){
            result*=x;
            x++;
        }
        return result;
    }
}
