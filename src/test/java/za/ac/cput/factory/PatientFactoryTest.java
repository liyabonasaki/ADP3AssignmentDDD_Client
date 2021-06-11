/* PatientFactoryTest.java
 Test Class for the PatientFactory
 Author: Bilqees Saban (219090866)
  Date: 11 June 2021
*/

package za.ac.cput.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.Patient;
import za.ac.cput.Factory.PatientFactory;

import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

class PatientFactoryTest
{
    Patient patient1;
    Patient patient2;
    Patient patient3;


    @BeforeEach
    void setUp()
    {
        patient1 = PatientFactory.createPatient("P01", "Bilqees", "Saban", "Female", "1 Cape Town", "20", "0579845671", "O", "Negative");
        patient2 = patient1;
        patient3 = PatientFactory.createPatient("P02", "Billie", "Bear", "Male", "235 Unicorntopia", "23", "0248794548", "O", "Negative");

    }

    @Test
    void testIdentity()
    {
        assertSame (patient1, patient2);

    }

    @Test
    void testEquality()
    {
        assertEquals(patient1, patient2);
        assertNotEquals(patient1, patient3);
    }

    @Timeout(value = 23, unit = TimeUnit.MILLISECONDS)
    @Test
    void timeouts()
    {
        assertEquals(patient1, patient2);
    }

    @Disabled
    @Test
    void disablingTest()
    {
        assertNotEquals(patient1.getPatAge(), patient3.getPatAge());
        System.out.println("Diabled by Bilqees Saban");
    }
}