package _998serverclient;

import java.util.HashSet;
import java.util.Scanner;

public class TaskMain {
    static Task task1 = new Task("zadacha1","opisania1");
    static Task task2 = new Task("zadacha2","opisania2");
    static Task task3 = new Task("zadacha3","opisania3");
    static Task task4 = new Task("zadacha1","opisania1");// Task с теми же полями



    public static void main (String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите название задачи: ");
//        String zadacha = scanner.nextLine();
//
//        System.out.println("Введите описаниа задачи: ");
//        String opisania = scanner.nextLine();
//
//        scanner.close();

        task1.setOpisanie("decided 1");
        task2.setOpisanie("decided 2");
        task3.setOpisanie("decided 3");


        System.out.println("Task 1 : " + task1.getOpisanie());
        System.out.println("Task 2 : " + task2.getOpisanie());
        System.out.println("Task 3 : " + task3.getOpisanie());

        HashSet<Task> hashSet = new HashSet<>();
        hashSet.add(task1);
        hashSet.add(task2);
        hashSet.add(task3);
        hashSet.add(task4);

        System.out.println(hashSet);

        hashSet.clear();
        System.out.println();
        System.out.println( "после очистки : " + hashSet);

        System.out.println(task1.equals(task2));
        System.out.println(task1.equals(task3));
        System.out.println(task1.equals(task4));

        System.out.println();

        System.out.println(task1.hashCode());
        System.out.println(task2.hashCode());
        System.out.println(task3.hashCode());
        System.out.println(task4.hashCode());

        HashSet<Task> hashSet1 = new HashSet<>();
        hashSet1.add(task1);
        hashSet1.add(task2);
        hashSet1.add(task3);
        hashSet1.add(task4);

        System.out.println(hashSet1);


    }
}
