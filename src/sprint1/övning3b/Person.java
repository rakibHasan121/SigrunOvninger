package sprint1.övning3b;

abstract class Person {
    private String namn;
    private String personNummer;

    public Person(String namn, String personNummer) {
        this.namn = namn;
        this.personNummer = personNummer;
    }

    public String getNamn() {
        return namn;
    }
}
