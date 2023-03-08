package Day10;

public class Collection_38 {
    /**
     * Колекции это классы и интерфейсы. интерфейс Collection происходит от его родителя Iterable. От интерфейсва Collection
     * имплементируются другие колецкции как: List Queue Set and Map.
     *
     * List это последовательность обьектов которая
     * может хранить дубликаты и null. Каждый элемент имеет индекс, начинается с 0. В эту колекцию входит:
     * -ArrayList
     * -LinkedList
     * Vector -> Stack
     *
     *
     * Map - это коллекция которая состоит из пар(ключей(Обьектов), и значений(Обьектов)). Эта коллекция очень
     * быстра но не запоминает порядок доьавленных обьектов. Как и коючи так и значения могут содержать null, НО
     * КАЖДЫЙ КЛЮЧ ДОЛЖЕН БЫТЬ РАЗНЫЙ ибо при добавлении какого-то элемента с тем самым ключом который уже существует, то этот
     * ключ переопредилится и возьмет в себя другие заданные нами данными.
     *
     * Map делится на:
     * 1. HashMap и его наследника LinkedHashMap
     * 2. Интерфейсы SortedMap и NavigableMap и класс который их имплементирует TreeMap
     * 3. HashTable
     *
     *
     * Set - коллекция хрянящяе уникальные обьекты( не повторяющтеся), методы являются очень быстрыми.
     *
     * У интерфейса Set есть:
     * 1. Класс который его имплеминтирует HashSet и наследник этого класса - LinkedHashSet
     * 2. Интерфейсы SortedSet и NavigableSet и класс который их имплементирует TreeSet
     *
     * В основе самого интерфейса Set лежит Map, но он не содержит пары ключ и значения, а содержит только значения.
     * - Тогда и в основе HashSet лежит HashMap и получается так что обычный элемент HashSet является ключом HashMap
     * а значения HashMap будет какой-то константой(заглушкой)
     * - И тогда Set содержит в себе то что и Map,но не может содержать дубликаты, и так же не запоминает порядок добавления.
     *
     *
     * Queue - коллекция которая работает как очередь(хранит последовательность элементов. Элементы всегда добавляются
     * в конец очереди, работа с элементами всегда происходит в начале очереди по принципе FIFO(First input, first output)
     *
     * У интерфейса Queue есть:
     * 1. Интерфейс Deque который имплементируется классами LinkedList и ArrayDeque
     * LinkedList имплементирует не только List но и Deque и само собой Queue
     * 2. Интерфейс AbstractQueue который имплементируется классом PriorityQueue
     *
     * Колекция сама по себе это в принципе есть то самое что и группа какаято которую вы имеете. Наприклад у вас есть
     * колекция машин (у которых есть дубликаты) или друзей (у которых нету дубликатов так как они все разные) домов,
     * телефонов и т.д.
     */
}
