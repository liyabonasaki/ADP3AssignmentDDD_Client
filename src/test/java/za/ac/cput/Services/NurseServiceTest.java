package za.ac.cput.Services;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Nurse;
import za.ac.cput.Factory.NurseFactory;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
class NurseServiceTest {
    private static NurseService service = NurseService.getService();
    private static Nurse nurse = NurseFactory.createNurse
            (
                    "950501",
                    "joshluke95",
                    "jl95_1878",
                    "Joshua Retief",
                    "Male",
                    "212 CWI 7654",
                    "0645432156",
                    26
            );

    @Test
    void create() {
        Nurse created = service.create(nurse);
        assertNotNull(created);
        //assertEquals(created.getClass(), nurse.nurseID);
        System.out.println("Create: " + created);
    }

    @Test
    void read() {
        Nurse read = service.read(nurse.nurseID);
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void getAllNurse() {
    }
}