package Inlämningsuppgift.Inlämningsuppgift_2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by rakib
 * Date: 2020-10-12
 * Time: 19:51
 * Projekt: SigrunOvninger
 * Copyright: MIT
 */

public class Medlemmar {
    private String personNr;//Kunden's personnummer
    private String kundNamn;//Kunden's fullständiga namn
    private LocalDate senasteBetalning;//Kunden's senast betalade årsavgiften till gymmet

    public Medlemmar() {
    }

    public Medlemmar(String personNr, String kundNamn, LocalDate senastBetalning) {
        this.personNr = personNr;
        this.kundNamn = kundNamn;
        this.senasteBetalning = senastBetalning;
    }

    public void setPersonNr(String personNr) {
        this.personNr = personNr;
    }

    public void setKundNamn(String kundNamn) {
        this.kundNamn = kundNamn;
    }

    public void setSenasteBetalning(LocalDate senasteBetalning) {
        this.senasteBetalning = senasteBetalning;
    }

    public String getPersonNr() {
        return personNr;
    }

    public String getKundNamn() {
        return kundNamn;
    }

    public LocalDate getSenasteBetalning() {
        return senasteBetalning;
    }

    public String personNrFormat() {
        return personNr.substring(0, 6) + "-" + personNr.substring(6, 10);
    }

    /**
     * Methoden sparar tid och detum när en betalande kund loggar in till gymmet
     * @return Kunden's namn, personnummer och besökte tid
     */
    public String skrivAllaMedlemmerInfo() {
        return String.format("Namn: %s Personnummer: %s Besökte: %s",getKundNamn(),personNrFormat(),LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    /**
     * Methoden sparar hur ofta betalande klienterna tränar för personlige tränaren
     * @return Datum och tid när en betalde kund registrera sig vid inloggning
     */
    public String skrivMedlemInfoFörPT() {
        return String.format("%s  %s", LocalDate.now(), LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}