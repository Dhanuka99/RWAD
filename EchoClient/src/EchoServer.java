import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(1234);
        Socket acceptedSocket = serverSocket.accept();

        BufferedReader inputStream = new BufferedReader(new InputStreamReader(acceptedSocket.getInputStream()));

        DataOutputStream dataOutputStream = new DataOutputStream(acceptedSocket.getOutputStream());


        String s = inputStream.readLine();
        String sendData = s.toUpperCase();

        dataOutputStream.writeBytes(sendData);


    }
}
