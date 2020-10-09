package Inlämningsuppgift.Inlämningsuppgift_1;

/**
 * Created by rakib
 * Date: 2020-09-28
 * Time: 07:56
 * Copyright: MIT
 */
public class Katt extends Djur implements IPortioner {

    public Katt(String djurNamn, double vikt) {
        super(djurNamn, vikt);
    }

    @Override
    public double räknaPortioner() {
        return getVikt() / 150; //Enligt dietcoach formler av varje portion foder för en Katt
    }

    @Override
    public MatTyp djurenMatTyp() {
        return MatTyp.KATTFODER;
    }
}
