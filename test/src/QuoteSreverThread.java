import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import static java.lang.System.in;

/**
 * @program:test
 * @author: Nine_odes
 * @description:
 * @create:2019-12-15 20:34
 */
public class QuoteSreverThread extends Thread {

    public QuoteSreverThread(String name)throws IOException{
        super(name);
        DatagramSocket socket = new DatagramSocket(4445);
        in = new BufferedReader(new FileReader("one.text"));

        System.out.println("Could not open quote file.Serving time instead.");
    }
    public void run(){
        while(moreQuotes){
            try {
                byte[] buf = new byte[256];
                DatagramPacket packet = new DatagramPacket(buf, buf.length);

                socket receive (packet);
                String dString = null;
                if (in == null) {
                    dString = new Data() toString();
                } else {
                    dString = getNextQuotes;
                }
                buf = dString.getBytes();

                InetAddress address = packet.getAddress();
                int port = packet.getPort();
                packet = new DatagramPacket(buf, buf.length, address, port);
            }catch(IOException e){
                e.printStackTrace();
                moreQuotus = false;
            }
        }
        socket.close();
    }
    
    protected String getNextQuotes(){
        String returnValue = null;
        try{
            if((returnValue = in.readLine()) == null){
                in.close();
                moreQuotes = false;
                returnValue = "No more quotes.Goodbye.";
            }
        }catch (IOException e){
        returnValue = "IOException occurred in server";
    }
    return returnValue;
}
