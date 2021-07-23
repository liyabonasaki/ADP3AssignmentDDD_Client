/* PatientRepositoryTest.java
 Class for the PatientFactoryTest
 Author: Bilqees Saban (219090866)
  Date: 24 July 2021
*/

package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Patient;
import za.ac.cput.Factory.PatientFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

public class PatientRepositoryTest
{
    private static PatientRepository repository = PatientRepository.getRepository();
    private static Patient patient = PatientFactory.createPatient
            (
                    "P01",
                    "Bilqees",
                    "Saban",
                    "Female",
                    "1 Cape Town",
                    "20",
                    "0579845671",
                    "O",
                    "Negative"
            );
    private static Patient patient2 = PatientFactory.createPatient
            (
                    "P02",
                    "Rick",
                    "Allen",
                    "Female",
                    "2 Cape Town",
                    "25",
                    "0579985671",
                    "A",
                    "Positive"
            );

    @Test
    void a_createPatient()
    {
        Patient created = repository.create(patient);
        Patient created2 = repository.create(patient2);
        assertEquals(created.getPatID(), patient.getPatID());
        System.out.println("Create: " + created);
    }

    @Test
    void b_readPatient()
    {
        Patient read = repository.read(patient.getPatID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_updatePatient()
    {
        Patient updated = new Patient.Builder().copy(patient).setPatFirstName("Jeff").build();
        assertNotNull(repository.update(updated));
        System.out.println("Update:" + updated);
    }

    @Test
    void d_deletePatient()
    {
        boolean success = repository.delete(patient.getPatID());
        assertTrue (success);
        System.out.println("Delete:" + success);
    }

    @Test
    void e_getAllPatient()

    {
        System.out.println("Show All:");
        System.out.println(repository.getAllPatient());
    }

}