import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class PortScanner {
    
    public static void main(String[] args) throws Exception {
        String host = "localhost";
        InetAddress inetAddress = InetAddress.getByName(host);
        String hostName = inetAddress.getHostName();
        for(int port = 0; port <= 80; port ++) {
            try{
                Socket socket = new Socket(hostName, port);
                String text = hostName + "is listening on port" + port;
                System.out.println(text);
                socket.close();
            } catch (IOException e) {
                String s = hostName + "is note lestening on port" + port;
                System.out.println(s);
            }
        }
    }
}