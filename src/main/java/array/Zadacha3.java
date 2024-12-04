package array;

import java.util.ArrayList;

// Создай ArrayList из целых чисел и напиши код, который находит и считает количество четных чисел в этом списке.

public class Zadacha3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(7);
        numbers.add(10);
        numbers.add(12);
        numbers.add(15);

        // Переменная-счетчик для подсчета количества четных чисел
        int evenCount = 0;

        // Проходим по каждому элементу списка
        for (int number : numbers) {
            // Проверяем, является ли число четное
            if (number % 2 == 0) {
                evenCount++;

            }
        }
        System.out.println(evenCount);
    }
}


