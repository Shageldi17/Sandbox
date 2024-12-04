package array;

import java.util.ArrayList;

public class Zadacha2 {
    public static void main(String[] args) {

        Zadacha1();
        Zadacha2();

        Zadacha3();
        Zadacha4();
    }

    public static void Zadacha2() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("pineaplle");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("apple");
        // Определяем слова , которое нужно найти
        String word = "apple";
        // Переменная count - это счетчик,  который используется  для подчета количества вхождений
        // искомого слова в список строк.
        int count = 0; // Переменная count инициализируется нулем
        // Проходим по каждому элементу списка
        for (String fruit : fruits) {
            // Если текущий элемент совпадает с искомым  словом
            if (fruit.equals(word)) {
                count++;
                // Увеличиваем счетчик на 1
            }
        }
        System.out.println(word + " " + count + " раза ");
        System.out.println();
    }

    public static void Zadacha3() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(7);
        numbers.add(10);
        numbers.add(12);
        numbers.add(15);

        int evenCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;

            }
        }
        System.out.println(evenCount);
    }

    public static void Zadacha4(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);
        numbers.add(11);
        int oddCount = 0;
        int oddSum = 0;
        for (int number : numbers){
            if (number % 2 !=0 ){
                oddCount ++;
                oddSum = oddSum + number;

            }
        }
        System.out.println(oddSum);

    }

    public static void Zadacha1(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(9);
        numbers.add(7);
        numbers.add(2);
        numbers.add(13);

        int oddCount = 0;
        int oddSum = 0;
        for (int number : numbers){
            if (number % 2 !=0){
                oddCount ++ ;
                oddSum = oddSum + number; // oddSum += number

            }
        }

        System.out.println(oddCount);
        System.out.println(oddSum);
        System.out.println();


    }
}

