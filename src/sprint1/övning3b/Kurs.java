package sprint1.övning3b;

import java.util.ArrayList;
import java.util.List;

public class Kurs {
    private String kursNamn;
    private Lärare lärare;
    private List<Student> student;

    public Kurs(String kursNamn) {
        this.kursNamn = kursNamn;
        student = new ArrayList<>();//Generally the practice is to declare before the constructor (as a field) ,
        // and initialize in the constructor.
    }

    public String getKursNamn() {
        return kursNamn;
    }

    public Lärare getLärare() {
        return lärare;
    }

    public List<Student> getStudent() {
        return student;
    }
    public void läggTillStudent(Student stud){
        student.add(stud);
    }

    public void taBortStudent(Student stud){
        student.remove(stud);
    }

    public void läggTillLärare(Lärare lärare){
        this.lärare = lärare;
    }

    public void taBortLärare(){
        this.lärare = null;
    }
}
