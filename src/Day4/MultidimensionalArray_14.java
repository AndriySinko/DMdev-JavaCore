package Day4;

public class MultidimensionalArray_14 {
    /**
     * Кроме массивов существуют еще многомерные массивы, так сказать массив, в котором находится другой массив.
     * Чтобы было проще то создается массив int[4], у этого массива есть 5 значений
     * 0 1 2 3 4 5
     * Еще массив в этом массиве то это начнет выгнядеть так
     * 0  0 0 0 0 0
     * 1  0 0 0 0 0
     * 2  0 0 0 0 0
     * 3  0 0 0 0 0
     * 4  0 0 0 0 0
     * 5  0 0 0 0 0
     * Под каждый индекс массив создается свой масиив
     *
     * Чтобы создать 2-мерный, 3-мерный и т.д нужно написать следущее
     * int[5][7] где 5 это размер массива, а 7 это размер наших вложенных массив - мы создали 5 массивов с размером 7
     * int[][][] - это уже 3-мерный
     */
    public static void main(String[] args) {
        int[][] values = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(values[0][2]);
        System.out.println(values[1][0]);
        System.out.println(values[2][1]);
        System.out.println();

        for(int i=0;i<values.length;i++){
            System.out.print(i+" : ");
            for(int j = 0;j<values[i].length;j++ ){
                System.out.print(values[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] values2 = new int[5][];
        for(int i=0,x=1;i<values2.length;i++,x++){
            values2[i] = new int[x];
        }

        for(int i=0;i<values2.length;i++){
            System.out.print(i+" : ");
            for(int j =0;j<values2[i].length;j++){
                System.out.print(values2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
