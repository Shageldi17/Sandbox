package equals;

import java.util.Scanner;

public class MainEquals {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Введите два слова по очереди");
        String word1 = s.next();
        String word2 = s.next();

        if (word1.equals(word2)) {
            System.out.println("it is the same word");
        } else {
            System.out.println("these are different words");
        }



        while (true){
        System.out.println("Введите два числа по очереди");
        int a = s.nextInt();
        int b = s.nextInt();

        if (a > b) {
            System.out.println("a is bigger than b");
        } else if (a < b) {
            System.out.println("a is smaller than b");
        } else if (a == b) {
            System.out.println(" a is equal to b ");
        }
        }
    }
}
