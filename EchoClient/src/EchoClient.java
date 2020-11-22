import java.io.*;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) throws IOException {

        System.out.println("waiting for client");
        Socket socket = new Socket("localhost", 1234);


        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Text Here :");
        String str = userInput.readLine();
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        out.println(str);

        BufferedReader in  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(in.readLine());


    }
}
