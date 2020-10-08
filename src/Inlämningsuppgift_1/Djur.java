package Inlämningsuppgift_1;

/**
 * Created by rakib
 * Date: 2020-09-28
 * Time: 07:56
 * Copyright: MIT
 */


public abstract class Djur implements IPortioner {
    //Instansvariabler och inkapsling av instansvariabler
    protected double vikt;//Djuren vikt (i gram)
    protected String djurNamn;

    /* En abstract method som ska returera en värde från en enum,
    pekar till vilken sorts mat ska få en särskilda djur */
    public abstract MatTyp djurenMatTyp();

    //Lagrade olika typ djuren mat i en enum
    enum MatTyp {
        HUNDFODER,
        KATTFODER,
        ORMPELLETS
    }

    //Djur constructor
    public Djur(String djurNamn, double vikt) {
        this.vikt = vikt;
        this.djurNamn = djurNamn;
    }

    @Override
    public double räknaPortioner() {
        return 0;
    }

    public String getDjurNamn() {
        return djurNamn;
    }

    public double getVikt() {
        return vikt;
    }

}
