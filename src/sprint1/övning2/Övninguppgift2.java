package sprint1.övning2;

/**
 * Name: rakib
 * Date: 2020-09-21
 * Time: 15:13
 * Projekt: SigrunÖvninger
 * Copyright: MIT
 */
public class Övninguppgift2 {
    public void printMEWEE(Fordon fordon) {
        fordon.printMe();
    }

    public static void main(String[] args) {

        Bil bil = new Bil(90, 2000, 6, 6);
        Bil bil2 = new Bil(30, 1000, 5, 2);
        bil.printMe();
        Tåg tåg = new Tåg(100, 5000, 5);
        tåg.printMe();
        Fordon f = new Tåg(500, 10000, 3);
        f.printMe();
        Fordon f1 = new Bil(70, 1500, 5, 2);
        Fordon f2 = new Cykel(20, 34, 21, 17);
        Fordon f3 = new Båt(10, 50, 10);
        //f3.printMe();
        //f2.printMe();
        //f1.printMe();
        bil2.printMe();
        Övninguppgift2 öv = new Övninguppgift2();
        öv.printMEWEE(f2);
        öv.printMEWEE(bil);
    }
}