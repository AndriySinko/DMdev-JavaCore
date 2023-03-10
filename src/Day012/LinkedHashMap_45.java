package Day012;

import java.util.Map;

public class LinkedHashMap_45 {
    /**
     * LinkedHashMap - являеется наследником HashMap, но он может хранить онформацию о порядке добавления, или о порядке
     * использования. Производительность немного ниже как у HashMap. Это работает защет тго что у нодах есть ссылки на
     * предыдущий элемент, если голова и хвост
     */
    public static void main(String[] args) {
        Map<Integer, Animal> animalMap = new java.util.LinkedHashMap<>();
        Animal animal1 = new Animal(15,"Lion");
        Animal animal2 = new Animal(9,"Elephant");
        Animal animal3 = new Animal(7,"Dog");
        Animal animal4 = new Animal(6,"Cat");
        animalMap.put(animal1.getYear(), animal1);
        animalMap.put(animal2.getYear(), animal2);
        animalMap.put(animal3.getYear(), animal3);
        animalMap.put(animal4.getYear(),animal4);
        for (Map.Entry<Integer,Animal> animal:animalMap.entrySet()){
            System.out.println(animal.getKey()+"    "+animal.getValue());
        }
    }
}

