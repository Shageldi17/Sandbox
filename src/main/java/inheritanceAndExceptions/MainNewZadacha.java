package inheritanceAndExceptions;
import java.util.Scanner;
import java.util.InputMismatchException;
public class MainNewZadacha {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите число: ");
                int userInput = scanner.nextInt(); // Считываем число

            // проверяем, не равно ли число нулю
            if (userInput == 0) {
                throw new ArithmeticException("на ноль делить нельзя!");
            }
            // выполняем деление
            int result = 10 / userInput;
            System.out.println("Результат деление на " + userInput + " равен: " + result);
        } catch (InputMismatchException e){
            System.out.println("Ошибка : " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Ошибка : " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

}
