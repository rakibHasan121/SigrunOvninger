package sprint1.övning2;

public class Bil extends Fordon {
    private int antalVäxlar;
    private int växelJustNu;

    public Bil(double hastighet, double vikt, int antalVäxlar, int växelJustNu) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
    }

    public void växla() {
    }

    @Override
    public void printMe() {
        System.out.println("Bil med hastighet " + getHastighet() + " km/h" +
                ",vikt " + getVikt() + " har " + antalVäxlar + " st växel");
    }
}
