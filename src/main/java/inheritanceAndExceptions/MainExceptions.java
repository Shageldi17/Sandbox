package inheritanceAndExceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainExceptions {

    public static void main(String[] args) {
        // checked vs non-checked exceptions
        try {
            FileReader fileReader = new FileReader("C:\\Users\\Admin\\IdeaProjects\\Sandbox\\src\\main\\java\\inheritanceAndExceptions\\MyFile.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);



            String text = bufferedReader.readLine();
            System.out.println(text);

            fileReader.close();

        } catch (FileNotFoundException e){
            System.out.println("File not found!");
        } catch (IOException e){
            System.out.println("Failed to read from file!");
        }
    }
}
