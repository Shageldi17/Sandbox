package _998serverclient.client;

import java.io.*;
import java.net.Socket;

public class Client {


    // todo ЕСЛИ ПОЛУЧИТСЯ создать Socket так же, как на сервере (not ServerSocket!), но кроме порта, нужно ещё указать адрес, String "localhost" (можешь почитать)
    // todo почитать про Set, LinkedList, [Stack, Queue]

    private Socket socket;
    public Client() {
        try {
            System.out.println("Connecting to server...");
            socket = new Socket("localhost",8080);
            System.out.println("Connected to server!");
            OutputStream outputStream = socket.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            outputStreamWriter.write("Hello ! \n");
            outputStreamWriter.flush();

            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String message = bufferedReader.readLine();
            System.out.println(message);


            // todo inputstream

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
