package Inlämningsuppgift_1;

/**
 * Created by rakib
 * Date: 2020-09-28
 * Time: 07:56
 * Copyright: MIT
 */
public class Hund extends Djur implements IPortioner {

    public Hund(String djurNamn, double vikt) {
        super(djurNamn, vikt);
    }

    @Override//Implementering interface metod
    public double räknaPortioner() {
        return getVikt() / 100;//Enligt dietcoach formler av varje portion foder för en Hund
    }

    @Override
    public MatTyp djurenMatTyp() {
        return MatTyp.HUNDFODER;
    }
}
