package sprint1.övning1;

public class ÄgarByte {
    public static void visaBilinfo(Bil bil) {
        if (bil.getBilägare() == null) {
            System.out.println("Fordon med registreringsnummer " + bil.getRegistreringsnummer() + " har ingen ägare.");
        } else {
            System.out.println("Bilen med registreringsnummer " + bil.getRegistreringsnummer() + ", " + bil.getMärke() + bil.getModell() + "," + " ägs av " + bil.getBilägare().getNamn());
        }
    }

    public static void main(String[] args) {
        Bil bil = new Bil("XYZ 123", "A3", "Audi");
        Bil bil1 = new Bil("BCA 123", "A4", "Audi");
        Bil bil2 = new Bil("PEX 123", "X1", "BMW");
        Bil bil3 = new Bil("GPT 123", "X2", "BMW");
        Bil bil4 = new Bil("XCT 123", "V60", "Volvo");
        Bil bil5 = new Bil("NRT 123", "V90", "Volvo");
        Bilägare ägare1 = new Bilägare("Peter", "Stockholm", 75);
        Bilägare ägare2 = new Bilägare("Maria", "Umeå", 35);
        Bilägare ägare3 = new Bilägare("Lisa", "Malmå", 45);
        Bilägare ägare4 = new Bilägare("Erik", "Luleå", 25);
        bil.setBilägare(ägare1);
        bil1.setBilägare(ägare2);
        bil2.setBilägare(ägare3);
        bil3.setBilägare(ägare4);
        System.out.println(bil.getMärke() + " " + bil.getModell() + " ägs av " + bil.getBilägare().getNamn());
        bil.såld();
        System.out.println(bil.getMärke() + " " + bil.getModell() + " ägs av " + bil.getBilägare());
        visaBilinfo(bil);
        visaBilinfo(bil1);
        visaBilinfo(bil2);
        visaBilinfo(bil3);
        visaBilinfo(bil4);
        visaBilinfo(bil5);



    }
}
