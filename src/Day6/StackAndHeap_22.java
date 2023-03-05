package Day6;

public class StackAndHeap_22 {
    /**
     * При создании любых типов будь примитивных, или создание обьектов классов, под них должна выделятся память.
     * Но как куда и где? Мы сейчас обсудим.
     * Есть такое понятие как Stack и Heap
     * Если коротко то Heap это куда в которой хранятся данные, а Stack это гурппа мест в памяти в которой тоже
     * харнятся данные, но она рабоаеь по принципу тарелок, если мы сейчас находимся напрмер в одной функции, то наша
     * основная функция main уходит вниз под нашу тарелку, и что обратно получить доступ к main нам нужно выйти с той
     * функции в которой находимся. По сути Stack работает по принципу first int first out.
     * Различия зарнения данных сейчас рассмотрим.
     *
     * Все прмитивные типы данных которые иницилизируются в нашем потоке main то все эти данные опадают в Stack
     * В случае создания дургих типов данных(ссылочных, или обьектов классов) в пример возьмем Human human = new Human(17)
     * то наша ссылка Human human попадает в Stack и начинает хранить в себе адрес на Heap в котором будет находится
     * new Human(17) как тоолько мы с помощью методы public void setAge(int age) назначим обьекту human другое значение -
     * human.setAge(22), то наша ссылка Human human срзу переопределится и будет в себе иметь адрес уже на new Human(22).
     * А new Human(17) так и останется в памяти.
     *
     * Когда наш поток main закончит свое действия то все данные в Stack исчезают, но в Heap они отсаются, а что делать
     * с ними и как их удалять мы незнаем, поэтому в джаве есть свой уборщик мксора который через какое-то время
     * удалит эти лишние данные.
     *
     * Про уборщик мусора подробно мы поговорим в дургой раз.
     */
}