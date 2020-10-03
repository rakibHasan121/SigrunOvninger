package sprint1.övning4a;

abstract class Person {
    protected String namn;
    protected String personNummer;

    public Person(String namn, String personNummer) {
        this.namn = namn;
        this.personNummer = personNummer;
    }

    public String getNamn() {
        return namn;
    }
}
