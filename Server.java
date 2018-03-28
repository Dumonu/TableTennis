//Server Class
public class Server{
    public static void main(String[] args) {
        try ( 
        ServerSocket serverSocket = new ServerSocket(37802);
        Socket clientSocket = serverSocket.accept();
        PrintWriter out =
        new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(
        new InputStreamReader(clientSocket.getInputStream()));
        ) {
            while ((inputLine = in.readLine()) != null) {
                
                if (outputLine.equals("ping"))
                outputLine = kkp.processInput(inputLine);
                System.out.println(outputLine);
                System.out.println("pong");
                break;
            }
        }
    }
}