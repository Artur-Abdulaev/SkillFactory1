package skillFactoryTasks.module_13.JavaServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        // ������� ��������� ����� �� ����� 1234
        ServerSocket server = new ServerSocket(1234);
        while(true) {
            System.out.println("Waiting...");
            // ���� ������� �� ����
            Socket socket = server.accept();
            System.out.println("Client connected!");
            // ������� ������� �� ����� �������
            Client client = new Client(socket);
            // ��������� �����
            Thread thread = new Thread(client);
            thread.start();

//            new Thread (new Client(s)).start()
        }
    }
}
