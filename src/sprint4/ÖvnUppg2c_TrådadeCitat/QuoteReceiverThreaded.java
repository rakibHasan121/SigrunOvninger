package sprint4.ÖvnUppg2c_TrådadeCitat;

/**
 * Created by rakib
 * Date: 2020-11-03
 * Time: 11:15
 * Projekt: SigrunOvninger
 * Copyright: MIT
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class QuoteReceiverThreaded implements Runnable {

    public void run(){
        int minPort = 55555;
        try (DatagramSocket socket = new DatagramSocket(minPort);) {
            byte[] data = new byte[256];
            while (true) {
                DatagramPacket packet = new DatagramPacket(data, data.length);
                socket.receive(packet);
                String message = new String(packet.getData(), 0, packet.getLength());
                System.out.println(message);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
