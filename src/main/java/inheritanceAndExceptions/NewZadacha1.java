package inheritanceAndExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NewZadacha1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        double num1 = 0;
        double num2 = 0;

        while (!validInput){
            try {
                System.out.println("Введите первое число: ");
                num1 = scanner.nextDouble(); // Считываем первое число
                System.out.println("Введите второе число: ");
                num2 = scanner.nextDouble(); // Считываем второе число
                if (num2 == 0){
                    throw new ArithmeticException("На ноль делить нельзя!");
                }
                double result = num1 / num2;
                System.out.println("Резельтат  " + num1 + " деление на  " + num2 + "  равен  " + result );
                validInput = true ; // Если все прошло успешно, выходим из цикла
            } catch (InputMismatchException e){
                    System.out.println("\"Ошибка: Введено некорректное значение. Пожалуйста, введите числовое значение. ");
                    scanner.next(); // Очищаем некорректный ввод
        } catch (ArithmeticException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    scanner.close();
}
}
