package Inlämningsuppgift_1;

/**
 * Created by rakib
 * Date: 2020-09-28
 * Time: 07:56
 * Copyright: MIT
 */
public class Hund extends Djur implements IPortioner {
    public Hund(double vikt) {
        super(vikt);
    }

    @Override
    public double räknaPortioner() {
        return getVikt() / 100;
    }

    @Override
    public matTyp djurenMatTyp() {
        return matTyp.Hundfoder;
    }
}
