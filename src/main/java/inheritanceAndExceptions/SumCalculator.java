package inheritanceAndExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumCalculator {
    public static void main (String[] args){

        try (Scanner scanner = new Scanner(System.in)) {            // try-with-resources всегда вызывает close()
            System.out.println("Введите первое число: ");
            double firstnumber = scanner.nextDouble();

            System.out.println("Введите второе число: ");
            double secondNumber = scanner.nextDouble();

            double sum = firstnumber + secondNumber;
            System.out.println("сумма двух чисел: " + sum);
        } catch (InputMismatchException e){
            System.out.println("Ошибка: введено не число. Введите корректные числовые значения ");




//        } finally {
//            scanner.close();

        }
    }
}
