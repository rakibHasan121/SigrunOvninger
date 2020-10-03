package sprint1.övning2;

public class Cykel extends Fordon {
    private int antalVäxlar;
    private int växelJustNu;

    public Cykel(double hastighet, double vikt, int antalVäxlar, int växelJustNu) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
    }

    public void växla() {

    }

    @Override
    public void printMe() {
        System.out.println("Cykel med hastighet "+getHastighet()+"vikt"+getVikt()
        +"antalVäxlar"+antalVäxlar+"växeljustnu"+växelJustNu);
    }
}
