package array;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListZadacha {
    public static void main(String[] args) {
        // Исходный список с дубликатами
        ArrayList <String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("grapes");
        // Удаление дубликатов
        ArrayList <String> listWithoutDuplicates = removeDuplicates(list);
        System.out.println("Список без дупликатов: " + listWithoutDuplicates );
    }
    public static ArrayList<String>removeDuplicates(ArrayList<String>list){
        //создаем HashSet для удаление дубликатов
        HashSet<String> set = new HashSet<>(list);
        //Создаем новый ArrayList из HeshSet
        return new ArrayList<>(set);
    }
}
