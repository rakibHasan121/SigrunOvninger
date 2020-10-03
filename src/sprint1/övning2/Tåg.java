package sprint1.övning2;

public class Tåg extends Fordon {
    private int antalVagnar;

    public Tåg(double hastighet, double vikt, int antalVagnar) {
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;
    }

    public void kopplaVagn() {
    }

    @Override
    public void printMe() {
        System.out.println("Tåg hastighet är: " + getHastighet() + " km/h, " + "vikt " + getVikt() + ", antal vagnar " + antalVagnar);
    }
}
