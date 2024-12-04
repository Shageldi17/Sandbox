package switchCase;
// Напишите программу которая принимает на вход номер месяца (от 1 до 12) и выводит количество дней в этом
//  месяце.Учитывайте что февраль (месяц номер 2 ) может иметь 28 или 29 дней в зависимости от  того является
//  ли год висококосным. Ваша программа должна принимать на вход также и год для определения високосности.

import java.util.Scanner;

public class SwitchCase1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер месяца: ");
            int month = scanner.nextInt();
            System.out.println("Введите год: ");
            int year = scanner.nextInt();
            int days;
            switch (month) {
                case 1,3,5,7,8,10,12:
                    days = 31;
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                default:
                    System.out.println("Неверный номер месяца.");
                    return;
            }
            System.out.println("Месяц " + month + " в году" + year + "имеет " + days + " дней.");
        }
    }



    public static boolean isLeapYear (int year){
        if (year % 4 == 0) {
            if (year % 100 == 0) {
//                return year % 400 == 0;
                //  то же, что
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        return false;

    }
}
