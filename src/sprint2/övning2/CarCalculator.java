package sprint2.övning2;

import javax.swing.*;

public class CarCalculator {
    protected double mätarställningNu;
    protected double mätarställningFörraÅret;
    protected double bensinFörbrukatsUnderÅret;

    public double calculateDistanceDrivenDuringLastYear() {
        return mätarställningNu - mätarställningFörraÅret;
    }
    public double calculateAverageGasUsage(){
        return bensinFörbrukatsUnderÅret / calculateDistanceDrivenDuringLastYear();
    }
    public void run(){
        mätarställningNu= Double.parseDouble(JOptionPane.showInputDialog(null,"Ange mätarställning: ").trim());
        mätarställningFörraÅret= Double.parseDouble(JOptionPane.showInputDialog(null,"Ange mätarställning förra året: ").trim());
        bensinFörbrukatsUnderÅret = Double.parseDouble(JOptionPane.showInputDialog("Ange bensinförbrukning under året: ").trim());
        System.out.println("Antal körda mil: "+calculateDistanceDrivenDuringLastYear());
        System.out.println("Antal liter bensin: "+bensinFörbrukatsUnderÅret);
        System.out.println("Förbrukning per mil: "+ calculateAverageGasUsage());
    }

    public static void main(String[] args) {
        CarCalculator cc = new CarCalculator();
        cc.run();
    }
}
