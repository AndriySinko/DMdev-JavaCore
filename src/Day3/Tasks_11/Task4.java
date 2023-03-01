package Day3.Tasks_11;

public class Task4 {
    /**
     * Написать является ли введенное число простым(Простое число делится только на себя и 1)
     */
    public static void main(String[] args) {
        int value = 13;
        aVoid(value);
    }
    static void aVoid(int x){
        boolean isPrime = true;
        for(int i = 2;i<x;i++){
            if(x%i==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println("Число "+x+" являеется простым");
        }else {
            System.out.println("Число "+x+" не являеется простым");
        }
    }
}
