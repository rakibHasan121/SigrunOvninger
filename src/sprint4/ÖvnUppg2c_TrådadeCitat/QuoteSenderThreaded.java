package sprint4.ÖvnUppg2c_TrådadeCitat;

/**
 * Created by rakib
 * Date: 2020-11-03
 * Time: 11:15
 * Projekt: SigrunOvninger
 * Copyright: MIT
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class QuoteSenderThreaded  implements Runnable {
    final static String quote1 = "Dreams and deception is a powerful combination";
    final static String quote2 = "Whatever your're thinking, think bigger.";
    final static String quote3 = "Maybe swearing will help?";


    public void run() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<String> quoteList = new ArrayList<>();
        quoteList.add(quote1);
        quoteList.add(quote2);
        quoteList.add(quote3);
        int listCounter = 0;
        int toPort = 55555;

        try (DatagramSocket socket = new DatagramSocket()) {
            InetAddress toAdr = InetAddress.getLocalHost();
            while (true) {
                byte[] data = quoteList.get(listCounter).getBytes();
                DatagramPacket packet = new DatagramPacket(data, data.length, toAdr, toPort);
                socket.send(packet);
                listCounter = (listCounter + 1) % quoteList.size();
                Thread.sleep(3000);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
