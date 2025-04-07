import java.io.*;
import java.net.*;

public class SocketServer {
    public static void main(String[] args) {
        int port = 1234;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started, waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = input.readLine();
            System.out.println("Message from client: " + message);

            input.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
