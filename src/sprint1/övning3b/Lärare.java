package sprint1.övning3b;

import java.util.List;

public class Lärare extends Person {
    private List<Kurs> underVisar;

    public Lärare(String namn, String personNummer) {
        super(namn, personNummer);
    }

    public void läggTillUndervisadKurs(Kurs kurs){
        underVisar.add(kurs);
    }
    public void taBortUndervisadKurs(Kurs kurs){
        underVisar.remove(kurs);
    }
}
