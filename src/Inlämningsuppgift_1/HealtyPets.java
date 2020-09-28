package Inlämningsuppgift_1;

import javax.swing.*;

/**
 * Created by rakib
 * Date: 2020-09-28
 * Time: 07:56
 * Copyright: MIT
 */
public class HealtyPets {
    public HealtyPets() {
        Hund Sixten = new Hund(5000);
        Hund Dogge = new Hund(10_000);
        Katt Venus = new Katt(5000);
        Katt Ove = new Katt(3000);
        Orm Hypno = new Orm(1000);

        String input = JOptionPane.showInputDialog(null, "Vilket djur ska få mat?", "Healthy Pets", JOptionPane.PLAIN_MESSAGE);
        if (input == null || input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Uttrycket får inte vara tomt", "Healthy Pets", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }

        switch (input.toLowerCase()) {
            case "sixten" -> JOptionPane.showMessageDialog(null, "Hunden Sixten ska få " + String.format("%.1f", Sixten.räknaPortioner()) + " gm av " + Sixten.djurenMatTyp(), "Healthy Pets", JOptionPane.PLAIN_MESSAGE);
            case "dogge" -> JOptionPane.showMessageDialog(null, "Hunden Dogge ska få " + String.format("%.1f", Dogge.räknaPortioner()) + " gm av " + Dogge.djurenMatTyp(), "Healthy Pets", JOptionPane.PLAIN_MESSAGE);
            case "venus" -> JOptionPane.showMessageDialog(null, "Katten Venus ska få " + String.format("%.1f", Venus.räknaPortioner()) + " gm av " + Venus.djurenMatTyp(), "Healthy Pets", JOptionPane.PLAIN_MESSAGE);
            case "ove" -> JOptionPane.showMessageDialog(null, "Katten Ove ska få " + String.format("%.1f", Ove.räknaPortioner()) + " gm av " + Ove.djurenMatTyp(), "Healthy Pets", JOptionPane.PLAIN_MESSAGE);
            case "hypno" -> JOptionPane.showMessageDialog(null, "Ormen Hypno ska få " + String.format("%.1f", Hypno.räknaPortioner()) + " gm av " + Hypno.djurenMatTyp(), "Healthy Pets", JOptionPane.PLAIN_MESSAGE);
            default -> JOptionPane.showMessageDialog(null, "Matat in felaktiga värden", "Healthy Pets", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void main(String[] args) {
        HealtyPets hp = new HealtyPets();
    }
}
