package Inlämningsuppgift_1;

/**
 * Created by rakib
 * Date: 2020-09-28
 * Time: 07:56
 * Copyright: MIT
 */
public class Orm extends Djur implements IPortioner {
    public Orm(double vikt) {
        super(vikt);
    }

    @Override
    public matTyp djurenMatTyp() {
        return matTyp.Ormpellets;
    }

    @Override
    public double räknaPortioner() {
        return 20;
    }
}
