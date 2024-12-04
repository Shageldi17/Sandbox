package switchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {


            System.out.println("Введите число: ");
            int days = scanner.nextInt();
//            if (days == 1){
//                System.out.println("Monday");
//            }else if (days == 2){
//                System.out.println("Tuesday");
//            }else if (days == 3){
//                System.out.println("Wednesday");
//            }else if (days == 4){
//                System.out.println("Thursday");
//            }else if (days == 5 ){
//                System.out.println("Friday");
//            }else if (days == 6){
//                System.out.println("Saturday");
//            }else if (days == 7){
//                System.out.println("Sunday");
//            }else if (days > 7){
//                System.out.println("Unknown");
//            } else if (days < 1){
//                System.out.println("Unknown");
//            }




            switch (days) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Unknown");
            }

        }
    }
}
