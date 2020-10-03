package sprint1.övning1;

/**
 * Created by rakib
 * Date: 2020-09-20
 * Time: 19:56
 * Projekt: SigrunÖvninger
 * Copyright: MIT
 */
public class Bil {
    private String registreringsnummer;
    private String modell;
    private String märke;
    private Bilägare bilägare;

    public Bil(String registreringsnummer, String modell, String märke) {
        this.registreringsnummer = registreringsnummer;
        this.modell = modell;
        this.märke = märke;
    }

    public String getRegistreringsnummer() {
        return registreringsnummer;
    }

    public String getModell() {
        return modell;
    }

    public String getMärke() {
        return märke;
    }

    public Bilägare getBilägare() {
        return bilägare;
    }

    public void setBilägare(Bilägare bilägare) {
        this.bilägare = bilägare;
    }

    public void såld() {
        bilägare = null;
    }
}
