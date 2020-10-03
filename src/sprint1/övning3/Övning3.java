package sprint1.övning3;

/**
 * Created by rakib
 * Date: 2020-09-26
 * Time: 20:14
 * Projekt: SigrunÖvninger
 * Copyright: MIT
 */
public class Övning3 {
    Övning3() {
        Student Anna = new Student("Anna", "800101");
        Student Kiran = new Student("Kiran", "880501");
        Student Bon = new Student("Bob", "900918");

        Lärare Sigrun = new Lärare("Sigrun", "");
        Kurs Java = new Kurs("Objektorientering och Java");
        Java.läggTillStudent(Anna);
        Java.läggTillStudent(Kiran);
        Java.läggTillStudent(Bon);
        Java.läggTillLärare(Sigrun);

        printKurs(Java);

    }

    public void printKurs(Kurs kursNamn) {
        System.out.println("Kurs: " + kursNamn.getkursNamn());
        System.out.println("Lärare: " + kursNamn.getLärare().getNamn());

        for (Student s : kursNamn.getStudenter()) {
            if (s != null) {
                System.out.println("Student: " + s.getNamn());
            }
        }
    }

    public static void main(String[] args) {
        Övning3 övn3 = new Övning3();

    }
}
