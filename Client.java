import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client
{
    public static void Main(String[] args)
    {
        if(args.length < 2)
            throw new RuntimeException("Invalid arguments, please add hostname and Port");

        try
        {
            Socket tcpS = new Socket(args[0], Integer.parseInt(args[1]));
            BufferedReader tcpIn = new BufferedReader(new InputStreamReader(tcpS.getInputStream()));
            PrintWriter tcpOut = new PrintWriter(tcpS.getOutputStream(), true);

            tcpOut.println("Ping!");
            System.out.println(tcpIn.readLine());

            tcpS.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}