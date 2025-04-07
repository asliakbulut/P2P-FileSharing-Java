import java.io.*;
import java.net.*;

public class SocketClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 1234;

        try (Socket socket = new Socket(host, port)) {
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            output.println("Hello server!");

            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
