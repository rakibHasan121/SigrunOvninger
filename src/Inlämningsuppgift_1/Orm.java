package Inlämningsuppgift_1;

/**
 * Created by rakib
 * Date: 2020-09-28
 * Time: 07:56
 * Copyright: MIT
 */
public class Orm extends Djur implements IPortioner {

    public Orm(String djurNamn, double vikt) {
        super(djurNamn, vikt);
    }

    @Override
    public MatTyp djurenMatTyp() {
        return MatTyp.ORMPELLETS;
    }

    @Override
    public double räknaPortioner() {
        return 20;//Enligt dietcoach formler av varje portion foder för en Orm
    }
}
