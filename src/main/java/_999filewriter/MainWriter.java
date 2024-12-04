package _999filewriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainWriter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String filename = "myfile.txt";         //  диапазон переменной, по-английски scope


        try (FileWriter fileWriter = new FileWriter(filename, true)) {

            while (true) {
                System.out.println("Введите текст: ");
                String text1 = scanner.nextLine();      //  блокирующий метод
                fileWriter.write(text1);
                fileWriter.flush();         // !!!


                // todo add бесконечный цикл (while(true) со сканером который записывает то, что мы пишем в консоли в файл


            }

        } catch (IOException e) {
            System.out.println("File does not exist");
        }

    }

}
