package Inlämningsuppgift.Inlämningsuppgift_2;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by rakib
 * Date: 2020-10-15
 * Time: 13:43
 * Projekt: SigrunOvninger
 * Copyright: MIT
 */
class GymManagementTest {
    @Test
    void readCustomerFromFile() {
        List<Medlemmar> medlemmars = GymManagement.läsMedlemmarFrånFil();
        assertNotNull(medlemmars);
        for (Medlemmar medlemmar : medlemmars) {
            /*Testar om värje objekt i listen har fått sina attribut efter splittring*/
            assertNotNull(medlemmar.getKundNamn());
            assertNotNull(medlemmar.getSenasteBetalning());
        }
    }

    @Test
    void newCustomerVisitTest() throws IOException {
        /*Tester om kan skap nya kunder och ha åtkomst till deras attribut*/
        Path logPath = Paths.get("src/Inlämningsuppgift/Inlämningsuppgift_2/allaFiler/"+ LocalDate.now()+"TEST.txt");//Ny testfil
        BufferedWriter br = new BufferedWriter(new FileWriter(String.valueOf(logPath), true));
        List<Medlemmar> medlemmarList = new ArrayList<>();
        Medlemmar m1 = new Medlemmar("Robart J", "8001017788", LocalDate.of(2020, 7, 30));
        Medlemmar m2 = new Medlemmar("Herbert K", "8009091495", LocalDate.of(2020, 5, 13));
        Medlemmar m3 = new Medlemmar("Lambart T", "8011015588", LocalDate.of(2020, 5, 23));
        medlemmarList.add(m1);
        medlemmarList.add(m2);
        medlemmarList.add(m3);

        GymManagement.skrivLog(m1, logPath);//Här provar inloggning för en ny kund
        GymManagement.skrivLog(m2, logPath);

        assertNotNull(medlemmarList);
        for (Medlemmar medlemmar : medlemmarList) {
            assertTrue(medlemmar.getSenasteBetalning().isAfter(LocalDate.now().minusYears(1)));
        }//Testar om alla nya kunderna betalades för mindre än ett år sedan
    }

}