package sprint1.övning3;

/**
 * Created by rakib
 * Date: 2020-09-26
 * Time: 19:51
 * Projekt: SigrunÖvninger
 * Copyright: MIT
 */
public class Student extends Person {
    private Kurs[] deltarI;
    private int kursCounter = 0;

    public Student(String namn, String personnummer) {
        super(namn, personnummer);
        deltarI = new Kurs[10];
    }

    public void läggTillKurs(Kurs kurs) {
        deltarI[kursCounter++] = kurs;
    }

    public Kurs[] getAllaKurser() {
        return deltarI;
    }
}
