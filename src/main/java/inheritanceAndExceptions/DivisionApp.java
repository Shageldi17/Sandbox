package inheritanceAndExceptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class DivisionApp {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите первое число: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.println("Введите второе число: ");
            double num2 = Double.parseDouble(scanner.nextLine());
            if (num2 == 0){
                throw new ArithmeticException("Деление на ноль невозможно! ");
            }
            double result = num1/num2 ;
            System.out.println("Результат: " + result );


        } catch (NumberFormatException e ){
            System.out.println("Ошибка");
        } catch (ArithmeticException e){
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Программа завершена.");
        }
       scanner.close();

        throw new IndexOutOfBoundsException();
    }
}
