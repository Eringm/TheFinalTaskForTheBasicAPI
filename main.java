import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Z1{
       // Метод, который добавляет номера в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    // Метод, который печатает список контактов
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = «»;
            for(int el: item.getValue()){
                phones = phones + el + «, «;
            }
            System.out.printf(«%s: %s \n», item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber(«Ivanov», 789, bookPhone);
        addNumber(«Ivanov», 12534, bookPhone);
        addNumber(«Petrov», 546585, bookPhone);
        addNumber(«Sidorov», 895645577, bookPhone);
        addNumber(«Ivanov», 123456233, bookPhone);
        addNumber(«Petrov», 7872897, bookPhone);
        printBook(bookPhone);
       }
}
