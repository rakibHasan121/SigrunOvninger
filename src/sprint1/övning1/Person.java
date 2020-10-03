package sprint1.övning1;

/**
 * Created by rakib
 * Date: 2020-09-20
 * Time: 19:56
 * Projekt: SigrunÖvninger
 * Copyright: MIT
 */
public class Person {
    private String namn;
    private String adress;
    private int ålder;

    public Person(String namn, String adress, int ålder) {
        this.namn = namn;
        this.adress = adress;
        this.ålder = ålder;
    }

    public String getNamn() {
        return namn;
    }

    public String getAdress() {
        return adress;
    }

    public int getÅlder() {
        return ålder;
    }
}
