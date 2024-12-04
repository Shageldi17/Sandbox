package inheritanceAndExceptions;

import objects.Bus;
import objects.Truck;
import objects.Vehicle;

import java.util.Scanner;

public class MainInheritanceAndExceptions {

    public static void main(String[] args) {

        // ДЗ СДЕЛАНО: ПОЛУЧИТЬ ИНФУ ИЗ КОНСОЛИ ЧЕРЕЗ СКАННЕР

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите модель: ");
        String word1 = scanner.next();


        int year;
        int probeg;
        while (true) {
//            try {
                System.out.println("Введите год: ");
                year = Integer.parseInt(scanner.next());

                System.out.println("Введите минимальный пробег: ");
                probeg = Integer.parseInt(scanner.next());
                break;
//            } catch (NumberFormatException e) {
//                System.out.println("Введите пожалуйста цифру!");
//            }
        }

        Vehicle vehicle = new Vehicle(word1, year, probeg);
        System.out.println(vehicle);


//        System.out.println("This is a : " + word1 + " " + year + " " + probeg );



        Vehicle truck = new Truck("Volvo", 2023, 100," wood");

        System.out.println(truck);

        System.out.println(truck.getModel() + " " + truck.getProbeg());

        Vehicle bus = new Bus("Mercedes-Benz ", 2022, 300, 90);
        System.out.println(bus);

    }
}
