package Day013.CollectionTasks_49;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task3 {
    /**
     * Создать метод isUnique который принимает в параметры Map<String,String>, и возвращает true если у каждого ключа есть
     * уникальное значение и false если нет
     */
    public static void main(String[] args) {
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("1","Anton");
        stringMap.put("2","Vika");
        stringMap.put("3","Tanya");
        stringMap.put("4","Artem");
        stringMap.put("5","Viktor");
        System.out.println(isUnique(stringMap));
    }
    public static boolean isUnique(Map<String,String> map){
        Set<String> stringSet = new HashSet<>(map.values());
        return stringSet.size() == map.size();
    }
}
