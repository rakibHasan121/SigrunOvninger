package Inlämningsuppgift_1;

/**
 * Created by rakib
 * Date: 2020-09-28
 * Time: 07:56
 * Copyright: MIT
 */
public abstract class Djur {

    protected double vikt;//Djuren vikt (i gram)

    public abstract matTyp djurenMatTyp();

    enum matTyp {
        HUNDFODER,
        KATTFODER,
        ORMPELLETS
    }

    public Djur(double vikt) {
        this.vikt = vikt;
    }

    public double getVikt() {
        return vikt;
    }

}
