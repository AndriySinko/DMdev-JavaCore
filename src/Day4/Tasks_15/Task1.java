package Day4.Tasks_15;

public class Task1 {
    /**
     * Написать программу которая печатает массив сначала в обычном порядку, потом в обратном
     */
    public static void main(String[] args) {
        aVoid();
    }
    public static void aVoid(){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();
        for(int i:array){
            System.out.print(i+" ");
        }

        System.out.println();
        for(int i=9;i<=array.length && i!=-1;i--){
            System.out.print(array[i]+" ");
        }
    }
}
