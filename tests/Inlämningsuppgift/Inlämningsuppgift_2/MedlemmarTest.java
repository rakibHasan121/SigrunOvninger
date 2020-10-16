package Inlämningsuppgift.Inlämningsuppgift_2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by rakib
 * Date: 2020-10-16
 * Time: 02:14
 * Projekt: SigrunOvninger
 * Copyright: MIT
 */
class MedlemmarTest {
    @Test
    void checkSocialSecurityNumberFormat() {
        List<Medlemmar> medlemmarList = GymManagement.läsMedlemmarFrånFil();
        assertNotNull(medlemmarList.get(0).getPersonNr());
        assertEquals(medlemmarList.get(0).getPersonNr(), "7603021234");
        assertNotNull(medlemmarList.get(0).personNrFormat());
        assertEquals(medlemmarList.get(0).personNrFormat(), "760302-1234");
    }
    @Test
    void checkMembersName() {
        List<Medlemmar> medlemmarList = GymManagement.läsMedlemmarFrånFil();
        assertNotNull(medlemmarList.get(0).getKundNamn());
        assertEquals(medlemmarList.get(0).getKundNamn(), "Alhambra Aromes");
        assertNotEquals(medlemmarList.get(0).getKundNamn(), " Alhambra Aromes");
    }
    @Test
    void checkDateFormat() {
        List<Medlemmar> medlemmarList = GymManagement.läsMedlemmarFrånFil();
        assertEquals(medlemmarList.get(0).getSenasteBetalning().getYear(),2019);
        assertNotNull(medlemmarList.get(0).getSenasteBetalning());
        assertNotEquals(LocalDate.now().getYear(), medlemmarList.get(0).getSenasteBetalning().getYear());
        assertTrue(medlemmarList.get(3).getSenasteBetalning().isLeapYear());

    }
}