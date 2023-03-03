package Day4.Tasks_15;

public class Task3 {
    /**
     * Написать метод equals который определяет равны ли между собой соответствуищие жлементы двух 2-мерных массива
     */
    public static void main(String[] args) {
        int[][] array1 = new int[3][3];
        int[][] array2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int x=1;
        for(int i =0;i< array1.length;i++){
            for(int j=0;j<array1[i].length;j++){
                array1[i][j]=x;
                x++;
            }
        }

        System.out.println(equals(array1,array2));
    }
    public static boolean equals(int[][] values1, int[][] values2) {
        if(values1.length!= values2.length){
            return false;
        }
            for (int i = 0; i < values1.length; i++) {
                int[] row1 = values1[i];
                int[] row2 = values2[i];
                if (row1 != row2) {
                    return false;
                }
                for (int j = 0; j < row1.length; j++) {
                    if (row1[j] != row2[j]) {
                        return false;
                    }
                }
            }
        return true;
    }
}