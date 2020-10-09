package sprint2.övning8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rakib
 * Date: 2020-10-08
 * Time: 14:27
 * Projekt: SigrunÖvninger
 * Copyright: MIT
 */
public class Övning8A {
    String tempLine;
    final String tempPath = "src/sprint2/övning8/temp.txt";


    public Double parseDoubleValue(String val){
        Double temp;
        val.trim();
        String replaced = val.replaceAll(",", ".");
        temp = Double.parseDouble(replaced);
        return temp;
    }

    public List<Double> generateListFromFile(String tempPath){
        List<Double> allMeasurements = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(
                new FileReader(tempPath))) {

            while ((tempLine = reader.readLine()) != null) {

                Double temp = parseDoubleValue(tempLine);
                allMeasurements.add(temp);
            }
        }
        catch (Exception e){
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.exit(0);
        }
        return allMeasurements;
    }

    public Double calculateMin(List<Double> allMeasurements){
        double minTemp = Double.MAX_VALUE;
        for (int i = 0; i < allMeasurements.size(); i++) {
            Double d = allMeasurements.get(i);
            if (d < minTemp) {
                minTemp = d;
            }
        }
        return minTemp;
    }

    public Double calculateMax(List<Double> allMeasurements){
        double maxTemp = -Double.MAX_VALUE;
        for (int i = 0; i < allMeasurements.size(); i++) {
            Double d = allMeasurements.get(i);
            if (d > maxTemp) {
                maxTemp = d;
            }
        }
        return maxTemp;
    }

    public Double calculateAvg(List<Double> allMeasurements){
        double sum = 0;
        for (int i = 0; i < allMeasurements.size(); i++) {
            Double d = allMeasurements.get(i);
            sum += d;
        }
        return sum / allMeasurements.size();
    }


    public void result() {
        List<Double> allMeasurements = generateListFromFile(tempPath);
        System.out.printf("Maxtemp är %.1f\nMintemp är %.1f\n"
                        + "Medelvärdet är %.1f (beräknat över %d dagar)\n",
                calculateMax(allMeasurements), calculateMin(allMeasurements),
                calculateAvg(allMeasurements), allMeasurements.size());
    }

    public static void main(String[] args){
        Övning8A ö = new Övning8A();
        ö.result();
    }
}
