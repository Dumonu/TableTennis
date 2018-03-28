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
            TennisProtol ten = new TennisProtcol();
            String outputLine = ten.processInput(null);
            System.out.println(outputLine);
            while ((inputLine = in.readLine()) != null) {
                
                outputLine = kkp.processInput(inputLine);
                System.out.println(outputLine);
                if (outputLine.equals("Bye!"));
                break;
            }
        }
    }
}