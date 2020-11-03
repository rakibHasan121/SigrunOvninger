package sprint4.ÖvnUppg2c_TrådadeCitat;

/**
 * Created by rakib
 * Date: 2020-11-03
 * Time: 11:15
 * Projekt: SigrunOvninger
 * Copyright: MIT
 */
public class ThreadedMain {

    public static void main(String[] args ){
        Thread t1 = new Thread(new QuoteSenderThreaded());
        Thread t2 = new Thread(new QuoteSenderThreaded());
        Thread t3 = new Thread(new QuoteSenderThreaded());
        Thread t4 = new Thread(new QuoteReceiverThreaded());

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }


}