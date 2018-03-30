import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//Server Class
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(37802);
            Socket clientSocket = serverSocket.accept();
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            TennisProtocol ten = new TennisProtocol();
            String outputLine = ten.processInput(in.readLine());
            String inputLine;
            out.println(outputLine);
            while ((inputLine = in.readLine()) != null) {

                outputLine = ten.processInput(inputLine);
                out.println(outputLine);
                if (outputLine.equals("Bye!"))
                    break;
            }

            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}