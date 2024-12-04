package equals;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEquals2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("apple");
        words.add("apple");
        words.add("pineapple");

        // Заданное слово для поиска
        String wordToFind = "apple";

        // Переменная-счетчик
        int count = 0;

        // используем цикл for  для проверки каждого элемента в списке

//        for (int i = 0; i < words.size(); i++)     как вариант

        for (String word : words){
            if(wordToFind.equals(word)) {
                // увеличиваем счетчик на 1 , если совподает
                count++;

            }
        }
        System.out.println("Слово: "  + wordToFind + " " + count);
    }

}

