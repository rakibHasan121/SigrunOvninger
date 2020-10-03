package sprint1.övning3;

/**
 * Created by rakib
 * Date: 2020-09-26
 * Time: 19:50
 * Projekt: SigrunÖvninger
 * Copyright: MIT
 */
abstract class Person {

    private String namn;
    private String personnummer;

    Person() {
    }

    Person(String namn, String personnummer) {
        this.namn = namn;
        this.personnummer = personnummer;
    }

    public String getNamn() {
        return namn;
    }

}
