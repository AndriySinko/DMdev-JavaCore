package Day012;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class HashMap_44 {
    /**
     * HashMap - это коллекция которая состоит из пар(ключей(Обьектов), и значений(Обьектов)). Эта коллекция очень
     * быстра но не запоминает порядок доьавленных обьектов. Как и коючи так и значения могут содержать null, НО
     * КАЖДЫЙ КЛЮЧ ДОЛЖЕН БЫТЬ РАЗНЫЙ ибо при добавлении како-то элемента с тем самым ключом который уже существует, то этот
     * ключ переопредилится и возьмет в себя другие заданные нами данными.
     *
     * HashMap - свм по себе это как массив в котором есть LinkedList's, структура линкедлиста состоит из данных которые
     * мы вводим в HashMap. Работает это так что в массиве на какоц-то позиции создаетя ссылка на линкедлсит который
     * состоит из node а в этот node входит HashCode, key and value.
     *
     * Изза того что HashMap не запоминает порядок ввода данных, по специальнр формуле данные попадают на какую-то из
     * позиций, потом они помещаются в node и туда попадают данные HashCode, key and value но есть еще один тип next,
     * который пока-то по умолчанию = null, Потом созадется еще один файл с дургим хэш-еодом и он тоже
     * по формуле помещается на ту самую позицию и просходит сравнение хэш-кодов, если они оказываются разными то создается
     * цепочка и next вмещает в себя ссылку уже на этот 2 файлю. Потом создается 3 элемент и он тоже по формуле попал на
     * ту самую позицию, сравниваютсяя хэш коды и они оказываются равны и в ход вступает Equals который сравнивает
     * данные и если они оказались разными то опять уже у 2 обьекта значение next принимает в себя ссылку уже на этот 3
     * файлл. Создается 3 элемент снова на ту позицию, хэш код одинаковый но уже и данные тоже одинаковые, тогда
     * происходит коллизия и сейчас вмещенный нами жлемент заменяет место старого элемента у которого оказался
     * тот самы хэш код и те самые данные.
     *
     * y HashMap езе есть аткое понятие как - Initial capacity(начельный размер массива) и LoadFactor(кооефициент какой
     * обозначает, при какой заполнености массива о должен увелтчтьься вдвое). Если создать большой Initial capacity
     * то мы жертвуем памятю но приобретает лучшую скорость, если создать большой LoadFactor мы жертвуем скоростью но
     * приобретем память.
     */
    public static void main(String[] args) {
        Map<Integer, Animal> animalMap = new java.util.HashMap<>();
        Animal animal1 = new Animal(15,"Lion");
        Animal animal2 = new Animal(6,"Elephant");
        Animal animal3 = new Animal(7,"Dog");
        animalMap.put(animal1.getYear(), animal1);
        animalMap.put(animal2.getYear(), animal2);
        animalMap.put(animal3.getYear(), animal3);
        for (Map.Entry<Integer,Animal> animal:animalMap.entrySet()){
            System.out.println(animal.getKey()+"    "+animal.getValue());
        }
        System.out.println();
        Animal animal4 = new Animal(6,"Cat");
        animalMap.put(animal4.getYear(),animal4);
        for (Map.Entry<Integer,Animal> animal:animalMap.entrySet()){
            System.out.println(animal.getKey()+"    "+animal.getValue());
        }
        System.out.println();
        Iterator iterator = animalMap.values().iterator();
        while (iterator.hasNext()){
            System.out.println(animalMap);
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(animalMap);
    }
}
class Animal{
    private int year;
    private String name;

    public Animal(int year, String name) {
        this.year = year;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return year == animal.year && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }
}