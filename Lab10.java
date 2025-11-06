import java.io.*;
import java.net.*;

public class ChatServer {
public static void main(String[] args) {
try {
ServerSocket serverSocket = new ServerSocket(5000);
System.out.println("Server started. Waiting for client...");
Socket socket = serverSocket.accept();
System.out.println("Client connected!");

BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

String msgIn, msgOut;

while (true) {
msgIn = in.readLine();
if (msgIn.equalsIgnoreCase("exit")) {
System.out.println("Client left the chat.");
break;
}
System.out.println("Client: " + msgIn);
System.out.print("You: ");
msgOut = keyboard.readLine();
out.println(msgOut);
if (msgOut.equalsIgnoreCase("exit")) {
break;
}
}

socket.close();
serverSocket.close();
} catch (Exception e) {
System.out.println(e);
}
}
}
