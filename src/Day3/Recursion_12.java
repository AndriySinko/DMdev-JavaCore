package Day3;

public class Recursion_12 {
    public static void main(String[] args) {
        int value = 5;
        int x = factorial(value);
        System.out.println();
        int y = sum(value);
        System.out.println("\n"+x+"\n"+y);
    }
    public static int factorial(int i){
        if(i==1){
            return 1;
        }else {
            //5*(4*(3*(2*1))))
            System.out.print(i+" ");
            return i*factorial(i-1);
        }
    }

    public static int sum(int i){
        if(i==0){
            return 0;
        }else {
            //5+(4+(3+(2+(1+0))))
            System.out.print(""+i+" ");
            return i+sum(i-1);
        }
    }
}
