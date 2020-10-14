package Inlämningsuppgift.Inlämningsuppgift_2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

/**
 * Created by rakib
 * Date: 2020-10-12
 * Time: 19:51
 * Projekt: SigrunOvninger
 * Copyright: MIT
 */
public class Medlemmar {
    protected String personNummer;
    protected String kundFörnamn;
    protected String kundEfternamn;
    protected LocalDate senastBetaldeÅrsavgiften;

    public Medlemmar(String personNummer, String kundFörnamn, String kundEfternamn, LocalDate senastBetaldeÅrsavgiften) {
        this.personNummer = personNummer;
        this.kundFörnamn = kundFörnamn;
        this.kundEfternamn = kundEfternamn;
        this.senastBetaldeÅrsavgiften = senastBetaldeÅrsavgiften;
    }

    public long senasteBetalningIDags() {
        LocalDate nuTid = LocalDate.now();
        LocalDate dåTid = senastBetaldeÅrsavgiften;
        Duration skillnad = Duration.between(dåTid.atStartOfDay(), nuTid.atStartOfDay());
        return skillnad.toDays();
    }

    public String getPersonNummer() {
        return personNummer;
    }

    public String getKundNamn() {
        return kundFörnamn.concat(" ").concat(kundEfternamn);
    }

    public LocalDate getSenastBetaldeÅrsavgiften() {
        return senastBetaldeÅrsavgiften;
    }

}
