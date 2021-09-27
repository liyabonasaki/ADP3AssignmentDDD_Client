package za.ac.cput.Repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

import za.ac.cput.Entity.Nurse;
import za.ac.cput.Factory.NurseFactory;


import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class NurseRepositoryTest {
    private static NurseRepository repository = NurseRepository.getRepository();
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
    void create()
    {
        Nurse created = repository.create(nurse);
        assertNotNull(created);
        //assertEquals(created.getClass(), nurse.nurseID);
        System.out.println("Create: " + created);
    }

    @Test
    void read()
    {
        Nurse read = repository.read(nurse.nurseID);
        assertNotNull(read);
        //assertEquals(read.getClass(), nurse.nurseID);
        System.out.println("Read: " + read);
    }

    @Test
    void update()
    {
        Nurse updated = new Nurse.BuilderNurse().copy(nurse).setNurseName("Wesley").build();
        assertNotNull(repository.update(updated));
        System.out.println("Update: " + updated);
    }

    @Test
    void delete()
    {
        boolean success = repository.delete(nurse.nurseID);
        assertTrue(success);
        System.out.println("Delete: " + success);
    }

    @Test
    void getAllNurse()
    {
        System.out.println("Show All:");
        System.out.println(repository.getAllNurse());
    }
}