package sprint1.övning3b;

public class Övning3b {
    public Övning3b() {
        Student Anna = new Student("Anna", "8003021234");
        Student Tolvan = new Student("Tolvan", "1212121212");
        Student Pelle = new Student("Pelle", "8512159876");
        Lärare Sigrun = new Lärare ("Sigrun", "");
        Kurs OOPJava = new Kurs("Objektorientering och Java");
        OOPJava.läggTillStudent(Anna);
        OOPJava.läggTillStudent(Tolvan);
        OOPJava.läggTillStudent(Pelle);
        OOPJava.läggTillLärare(Sigrun);
        printKurs(OOPJava);
    }
    public void printKurs(Kurs kurs){

        System.out.println("Kurs: " + kurs.getKursNamn());
        System.out.println("Lärare: " + kurs.getLärare().getNamn());

        for (Student s : kurs.getStudent()){
            System.out.println("Student: " + s.getNamn());
        }
    }

    public static void main(String[] args) {
        Övning3b öv3b = new Övning3b();
    }
}
