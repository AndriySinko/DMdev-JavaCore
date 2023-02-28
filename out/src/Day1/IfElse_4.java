package Day1;

public class IfElse_4 {
    /**
     * if - else так скзать фунция которая принимает значение true/false, и в зависимости ккое это значения выполняет
     * какие-то действия.
     */
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        if(x>y){
            System.out.println(x+" > "+y);
        } else if (x<y) {
            System.out.println(x+" < "+y);
        } else {
            System.out.println(x+" = "+y);
        }
    }
}
