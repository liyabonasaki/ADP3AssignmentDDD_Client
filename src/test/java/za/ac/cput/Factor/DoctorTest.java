package za.ac.cput.Factor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

import za.ac.cput.Entity.Doctor;

import java.util.concurrent.TimeUnit;

class DoctorTest {

    private Doctor.Builder build1;
    private Doctor.Builder build2;

    @BeforeEach
    void setUp() {
        build1 = new Doctor.Builder();
        build2 = new Doctor.Builder();
        build1 = build2;
    }
    @Test
    void testEquality(){

    }

    @Test
    void testIdentity(){
        assertSame(build1 , build2);

    }

    @Test
    void fail(){

    }

    @Test
    @Timeout(5)
    void TimeoutTest() throws  InterruptedException{
        TimeUnit.SECONDS.sleep(4);
        /*
        TODO
         */
    }

}