package Inlämningsuppgift.Inlämningsuppgift_2;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by rakib
 * Date: 2020-10-12
 * Time: 18:36
 * Projekt: SigrunOvninger
 * Copyright: MIT
 */
public class GymManagement {

    protected static void run() {
        List<Medlemmar> giltigMedlemmarList = läsMedlemmarFrånFil();
        giltigMedlemmar(giltigMedlemmarList);
    }

    protected static List<Medlemmar> läsMedlemmarFrånFil() {
        List<Medlemmar> medlemmarList = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get("src/Inlämningsuppgift/Inlämningsuppgift_2/allaFiler/customers.txt"))) {
            Scanner läsFil = new Scanner(br);
            while (läsFil.hasNextLine()) {
                Medlemmar medlemmar = new Medlemmar();
                String[] split = läsFil.nextLine().split(",");
                medlemmar.setPersonNr(split[0]);
                medlemmar.setKundNamn(split[1].trim());
                String betaltDatum = läsFil.nextLine();
                medlemmar.setSenasteBetalning(LocalDate.parse(betaltDatum));
                medlemmarList.add(medlemmar);
                br.close();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Inläsning fel\n" + e.getMessage());
        }
        return medlemmarList;
    }

    protected static void giltigMedlemmar(List<Medlemmar> giltigMedlemmarList) {
        String input = JOptionPane.showInputDialog(null, "Vänligen ange namn eller personnummer (10 siffror)", "Valkömmen till Best Gym Ever", JOptionPane.PLAIN_MESSAGE);


        try {
            boolean medlemHittade = false;
            for (Medlemmar medlemmar : giltigMedlemmarList) {
                if ((medlemmar.getKundNamn().equalsIgnoreCase(input.trim()) || medlemmar.getPersonNr().equals(input.trim())) && medlemmar.getSenasteBetalning().isAfter(LocalDate.now().minusYears(1))) {
                    medlemHittade = true;
                    JOptionPane.showMessageDialog(null, String.format("Status: Aktiv\nNamn: %s\nPersonnummer: %s\nAvgift betald: %s", medlemmar.getKundNamn(), medlemmar.personNrFormat(), medlemmar.getSenasteBetalning()));

                    Path logPath = Paths.get("src/Inlämningsuppgift/Inlämningsuppgift_2/allaFiler/" + LocalDate.now() + ".txt");
                    Path logPathPT = Paths.get("src/Inlämningsuppgift/Inlämningsuppgift_2/allaFiler/" + medlemmar.getKundNamn() + ".txt");

                    skrivLog(medlemmar, logPath);//Om det är en gilltig kund så sparar kunden's info till dagens inlognning fil
                    skrivLogFörPT(medlemmar, logPathPT);//Om det är en gilltig kund så sparar kunden's info til en annan fil med kundens namn för PT

                } else if ((medlemmar.getKundNamn().equalsIgnoreCase(input.trim()) || medlemmar.getPersonNr().equals(input.trim())) && medlemmar.getSenasteBetalning().isBefore(LocalDate.now().minusYears(1))) {
                    medlemHittade = true;
                    JOptionPane.showMessageDialog(null, String.format("Status: Ej aktiv\nNamn: %s\nPersonnummer: %s\nAvgift betald: %s", medlemmar.getKundNamn(), medlemmar.personNrFormat(), medlemmar.getSenasteBetalning()));

                } else if (input.isEmpty() || input.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Inget angivet i dialogrutan.\nVänligen testa igen");
                    break;
                }

            }
            if (!medlemHittade) {
                JOptionPane.showMessageDialog(null, "Personen finns inte i systemet");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Avslutar programmet");
            System.exit(0);
        }
    }

    protected static void skrivLog(Medlemmar medlemmar, Path logPath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(logPath), true))) {
            writer.write(medlemmar.skrivAllaMedlemmerInfo());
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param medlemmar Varje medelem objekt med attribut
     * @param logPathPT Vart i systemet filen ska sparas
     */
    protected static void skrivLogFörPT(Medlemmar medlemmar, Path logPathPT) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(String.valueOf(logPathPT), true))) {
            br.write(medlemmar.skrivMedlemInfoFörPT());
            br.newLine();
            br.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}