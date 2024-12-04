package array;

import java.util.ArrayList;

public class Zadacha4 {
    // Создай ArrayList из целых чисел и напиши код, который находит и суммирует все нечетные числа в этом списка
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);
        numbers.add(11);
        // Переменная-счетчик для подсчета количества нечетных чисел
        int oddCount = 0;


        //Переменная для накопления суммы нечетных чисел
        int oddSum = 0;
        for(int number : numbers){
            if (number % 2 != 0 ){
                oddCount ++ ;

                //добавляем нечетное число к сумме , oddSum = oddSum + number , += (это оператор)
                oddSum += number;


            }
        }
        System.out.println("Количество нечетных чисел: " + oddCount);
        System.out.println(" Сумма нечетных чисел: " + oddSum);

    }
}
