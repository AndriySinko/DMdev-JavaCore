package Day4.Tasks_15;

public class Task2 {
    /**
     * Написать программу которая заносит в массив первые 100 целых чисел делящихся на 13 или 17 и печатающих его
     */
    public static void main(String[] args) {
        aVoid();
    }
    public static void aVoid(){
        int[] array = new int[100];
        int counter = 0;
        for(int i=0;counter < array.length;i++){
            if(i%13==0 || i%17==0){
                array[counter] = i;
                System.out.println(counter+" : "+array[counter]);
                counter++;
            }
        }
    }
}
