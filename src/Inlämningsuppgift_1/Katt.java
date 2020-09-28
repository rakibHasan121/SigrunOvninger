package Inlämningsuppgift_1;

/**
 * Created by rakib
 * Date: 2020-09-28
 * Time: 07:56
 * Copyright: MIT
 */
public class Katt extends Djur implements IPortioner {
    public Katt(double vikt) {
        super(vikt);
    }

    @Override
    public double räknaPortioner() {
        return getVikt() / 150;
    }

    @Override
    public matTyp djurenMatTyp() {
        return matTyp.Kattfoder;
    }
}
