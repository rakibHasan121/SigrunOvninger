package sprint2.övning2;

import javax.swing.*;

public class CarCalculator {
    protected double mätarställningNu;
    protected double mätarställningFörraÅret;
    protected double bensinFörbrukatsUnderÅret;
    protected double bensinFörbrukatsFörraÅret;
    protected double gasUsedLastYear;

    public double calculateDistanceDrivenDuringLastYear() {
        return mätarställningNu - mätarställningFörraÅret;
    }
    public void run(){
        mätarställningNu= Double.parseDouble(JOptionPane.showInputDialog(null,"Ange mätarställning: ").trim());
        mätarställningFörraÅret= Double.parseDouble(JOptionPane.showInputDialog(null,"Ange mätarställning förra året: ").trim());
        gasUsedLastYear = Double.parseDouble(JOptionPane.showInputDialog("Ange bensinförbrukning under året: ").trim());
    }

    public static void main(String[] args) {
        CarCalculator cc = new CarCalculator();
        cc.run();
    }
}
