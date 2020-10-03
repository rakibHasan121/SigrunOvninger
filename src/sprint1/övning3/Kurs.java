package sprint1.övning3;

/**
 * Created by rakib
 * Date: 2020-09-26
 * Time: 19:51
 * Projekt: SigrunÖvninger
 * Copyright: MIT
 */
public class Kurs {
    private String kursNamn;
    private Lärare lärare;
    private Student[] studenter;
    private int studentCounter = 0;

    Kurs(String kursNamn) {
        this.kursNamn = kursNamn;
        studenter = new Student[10];
    }
    public String getkursNamn(){
        return kursNamn;
    }

    public Lärare getLärare(){
        return lärare;
    }

    public Student[] getStudenter(){
        return studenter;
    }

    public void läggTillStudent(Student student){
        studenter[studentCounter++] = student;
    }

    public void läggTillLärare(Lärare lärare){
        this.lärare = lärare;
    }

    public void taBortLärare(){
        this.lärare = null;
    }
}
