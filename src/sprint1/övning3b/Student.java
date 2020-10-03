package sprint1.övning3b;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Kurs> deltarI;

    public Student(String namn, String personNummer) {
        super(namn, personNummer);
        deltarI = new ArrayList<>();
    }

    public void läggTillKurs(Kurs kurs){
        deltarI.add(kurs);
    }
    public void taBortKurs(Kurs kurs){
        deltarI.remove(kurs);
    }
    public List<Kurs> getAllaKurser(){
        return deltarI;
    }
}
