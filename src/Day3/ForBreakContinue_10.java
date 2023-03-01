package Day3;

public class ForBreakContinue_10 {
    /**
     * Цикл For почти ничем не отличается от цикла while, только чинтаксисом. Если в цикле while сначала нужно
     * инициализировать переменную, в другом поле создать while с условием, в теле цикла while изменять переменную чтобы
     * цикл не был бесконечным, и выполнять какие-то действия, то в цикле For, это делается сразу.
     *
     * Break - команда которая прекращает выполениния команды
     * Continue - команда которая пропускает все команды, которые идут посое нее
     */
    public static void main(String[] args) {

        for (int i = 0; i < 15 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("Цикл for закончен\n");

        int value = 15;
        for(;;value++){
            System.out.print(value+" ");
            if(value==50){
                break;
            }
        }
        System.out.println("Бесконечный цикл for закончен с помощью break;\n");

        for (int i=0;i<20;i++){
            if(i>10 && i<15){
                System.out.println("  Continue - возвращаемся в начало цикла");
                continue;
            }
            System.out.println(i+" Continue небыл использован");
        }
    }
}
