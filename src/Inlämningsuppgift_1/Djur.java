package Inlämningsuppgift_1;

/**
 * Created by rakib
 * Date: 2020-09-28
 * Time: 07:56
 * Copyright: MIT
 */


public abstract class Djur {

    protected double vikt;//Djuren vikt (i gram)

    /* En abstract method som ska hämta vilken sorts mat för särskilda djuren
    från en uppräkningstyp */
    public abstract MatTyp djurenMatTyp();

    enum MatTyp {
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
