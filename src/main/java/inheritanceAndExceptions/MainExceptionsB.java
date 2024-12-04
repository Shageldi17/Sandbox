package inheritanceAndExceptions;

import java.io.*;

public class MainExceptionsB {


    public static void main(String[] args) {


          try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Admin\\IdeaProjects\\Sandbox\\src\\main\\java\\inheritanceAndExceptions\\MyFile.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Bye!");      // записать на черовике
            bufferedWriter.flush();                      // отправить результат в файл
              bufferedWriter.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found!");
        } catch (IOException e){
            System.out.println("Failed to write file! ");
        }
    }
}
