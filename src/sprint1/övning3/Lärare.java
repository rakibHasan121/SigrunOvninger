package sprint1.övning3;

/**
 * Created by rakib
 * Date: 2020-09-26
 * Time: 19:51
 * Projekt: SigrunÖvninger
 * Copyright: MIT
 */
public class Lärare extends Person {

    private Kurs[] undervisar;
    private int kursCounter = 0;

    public Lärare(String namn, String personnummer) {
        super(namn, personnummer);
    }

/*    public String getNamn() {
        return namn;
    }*/

    public void läggTillUndervisadKurs(Kurs kurs) {
        undervisar[kursCounter++] = kurs;
    }

}