package _998serverclient.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket serverSocket;

    public Server() {           // port (1-1024-65000+)

        try {
            serverSocket = new ServerSocket(8080);

            System.out.println("Waiting for client...");
            Socket clientSocket = serverSocket.accept();        // блокирующий метод, ждёт подключения клиента
            System.out.println("Client is connected!");

            InputStream inputStream = clientSocket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String message = bufferedReader.readLine();
            System.out.println(message);

            OutputStream outputStream =  clientSocket.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            outputStreamWriter.write("Message received: " + message +  "\n" );
            outputStreamWriter.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
