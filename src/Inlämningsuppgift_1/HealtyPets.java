package Inlämningsuppgift_1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rakib
 * Date: 2020-09-28
 * Time: 07:56
 * Copyright: MIT
 */
public class HealtyPets {
    public HealtyPets() {
        /*
        //Det hur jag gjort

        //Här lagrar djuren till listor så i framtiden man kan lagra ny djuren
        List<Katt> katt = new ArrayList<>();
        katt.add(0, new Katt("Venus", 5_000));
        katt.add(1, new Katt("Ove", 3_000));

        List<Hund> hund = new ArrayList<>();
        hund.add(0, new Hund("Sixten", 5_000));
        hund.add(1, new Hund("Dogge", 10_000));

        List<Orm> orm = new ArrayList<>();
        orm.add(0, new Orm("Hypno", 1_000));


        String input = JOptionPane.showInputDialog(null, "Vilket djur ska få mat?", "Healthy Pets", JOptionPane.PLAIN_MESSAGE);
        if (input == null || input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Uttrycket får inte vara tomt", "Healthy Pets", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }

        switch (input.toLowerCase().trim()) {
            case "sixten" -> JOptionPane.showMessageDialog(null, "Hunden Sixten ska få " + String.format("%.1f", hund.get(0).räknaPortioner()) + " gm av " + hund.get(0).djurenMatTyp(), "Healthy Pets", JOptionPane.PLAIN_MESSAGE);
            case "dogge" -> JOptionPane.showMessageDialog(null, "Hunden Dogge ska få " + String.format("%.1f", hund.get(1).räknaPortioner()) + " gm av " + hund.get(1).djurenMatTyp(), "Healthy Pets", JOptionPane.PLAIN_MESSAGE);
            case "venus" -> JOptionPane.showMessageDialog(null, "Katten Venus ska få " + String.format("%.1f", katt.get(0).räknaPortioner()) + " gm av " + katt.get(0).djurenMatTyp(), "Healthy Pets", JOptionPane.PLAIN_MESSAGE);
            case "ove" -> JOptionPane.showMessageDialog(null, "Katten Ove ska få " + String.format("%.1f", katt.get(1).räknaPortioner()) + " gm av " + katt.get(1).djurenMatTyp(), "Healthy Pets", JOptionPane.PLAIN_MESSAGE);
            case "hypno" -> JOptionPane.showMessageDialog(null, "Ormen Hypno ska få " + String.format("%.1f", orm.get(0).räknaPortioner()) + " gm av " + orm.get(0).djurenMatTyp(), "Healthy Pets", JOptionPane.PLAIN_MESSAGE);
            default -> JOptionPane.showMessageDialog(null, "Matat in felaktiga värden", "Healthy Pets", JOptionPane.PLAIN_MESSAGE);
        }
        */

        //After Sigrun's recommendation

        List<Djur> djurList = new ArrayList<>();
        djurList.add(new Hund("Sixten", 5_000));
        djurList.add(new Hund("Dogge", 10_000));
        djurList.add(new Katt("Venus", 5_000));
        djurList.add(new Katt("Ove", 3_000));
        djurList.add(new Orm("Hypno", 1_000));

        String input = JOptionPane.showInputDialog(null, "Vilket djur ska få mat?");
        if (input == null || input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Uttrycket får inte vara tomt");
            System.exit(0);
        }
        boolean isFound = false;
        for (Djur djur : djurList) {
            if (djur.getDjurNamn().equalsIgnoreCase(input.trim())) {
                JOptionPane.showMessageDialog(null, djur.getDjurNamn() + " ska få " + String.format("%.1f", djur.räknaPortioner()) + " gm av " + djur.djurenMatTyp().toString().toLowerCase());
                isFound = true;
                break;
            }
        }
        if (!isFound)
            JOptionPane.showMessageDialog(null, "Matat in felaktiga värden");
    }

    public static void main(String[] args) {
        HealtyPets hp = new HealtyPets();
    }
}