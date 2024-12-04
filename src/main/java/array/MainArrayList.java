package array;

import objects.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class MainArrayList {
    public static void main(String[] args) {

        // arraylist НЕ может хранить примитивы
        ArrayList<Integer> integers = new ArrayList<>();

        Integer number = new Integer(2);
        integers.add(number);

        System.out.println(integers);


//        int    --> Integer
//        boolean--> Boolean
//        double --> Double
//        char   --> Character


//                listTheory2();
    }

    public static void arrayVsArrayList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово: ");
        String word1 = scanner.next();
        System.out.println("Введите второе слово");
        String word2 = scanner.next();
        System.out.println("Введите третье слово");
        String word3 = scanner.next();

//        ArrayList<String> wordsList = new ArrayList<>();
//        wordsList.add(word1);
//        wordsList.add(word2);
//        wordsList.add(word3);
//        System.out.println("Ваши слова: " + wordsList);

        String[] words = {word1, word2, word3};
        System.out.println(words);
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
    }

    public static void listTheory2() {
        ArrayList<Vehicle> garage = new ArrayList<>();

        Vehicle vehicle1 = new Vehicle("Skada", 2024, 50);
        Vehicle vehicle2 = new Vehicle("Honda", 2022, 0);
        Vehicle vehicle3 = new Vehicle("Toyota", 2024, 200);

        System.out.println(garage);

        garage.add(vehicle1);
        garage.add(vehicle2);
        garage.add(vehicle3);
        System.out.println(garage);
        System.out.println(garage.size());

    }

    public static void listTheory() {
        ArrayList<String> days = new ArrayList<>();     //

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Wednesday");
        System.out.println(days);
        System.out.println(days.get(1));
        days.remove(2);
        System.out.println(days);
        days.clear();
        System.out.println(days);
    }
}
