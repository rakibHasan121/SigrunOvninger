package sprint1.övning7;

public abstract class Figur {

    protected Punkt startpunkt;

    public Figur(Punkt p){
        startpunkt=p;
    }

    public abstract double area();
}
