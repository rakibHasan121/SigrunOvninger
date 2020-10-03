package sprint1.övning2;

public abstract class Fordon {
    private double hastighet;
    private double vikt;
    public abstract void printMe();

    public Fordon(double hastighet, double vikt) {
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    public double getHastighet() {
        return hastighet;
    }

    public double getVikt() {
        return vikt;
    }

    public void ändraHastighet(double nyHastighet) {
        this.hastighet = nyHastighet;
    }


}
