package sprint1.övning2;

public class Båt extends Fordon{
    private double dödvikt;

    private void sväng() {}

    public Båt(double hastighet, double vikt, double dödvikt) {
        super(hastighet, vikt);
        this.dödvikt = dödvikt;
    }

    @Override
    public void printMe() {
        System.out.println("Båt med hastighet "+getHastighet()+"km/h, vikt"+getVikt()+" dödvikt "+dödvikt);
    }
}
