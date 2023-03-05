package Day7;

public class StringBuilderAndStringBuffer_25 {
    /**
     * StringBuilder - это класс который в отличии от String является Utble
     * Utble - может изменяться
     * UnUtble неможет изменяться
     * <p>
     * Так вот класс String являеется UnUtble и его изменить никак нельзя, даже если изменить его с помощью toUpperCase
     * то наша ссыока будет ссылатся уже на новый обьект, на новую строку которая находится в верхнем регистре
     * <p>
     * Класс StringBuilder отличается тем что он яаляется Utble и может изменяться, додавать какие-то строки к себе или \
     * удалять
     */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("");
        System.out.println("stringBuilder : \n"+stringBuilder);
        for (int i = 0; i <= 1000; i++){
            if(i%30==0){
                stringBuilder.append(i+"\n");
            }else {
                stringBuilder.append(i + " ");
            }
        }
        System.out.println("stringBuilder : \n"+stringBuilder);
    }
}