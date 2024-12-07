package _996collections;

import java.util.ArrayList;

public class MainCollections {

    // hashmap      key-value       key не могут повторяться, а value могут
//                    например    номер машины - модель

    // hashset      value           1) нет повторений       2) нет индексов (0,1,2,...), поэтому нет метода get()


    public static void main(String[] args) {

        int a = 3;
            //    Car bmw = new Car();
        ArrayList<String> names = new ArrayList<>();
        names.add("Honda");
        names.add("Skoda");
        names.add("Toyota");
        String name = names.get(2);

        System.out.println(name);
    }
}
