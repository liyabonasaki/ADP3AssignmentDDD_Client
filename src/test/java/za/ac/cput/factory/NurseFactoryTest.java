/* Nurse.java
   za.ac.cput.Entity for the Nurse
   @ author: Joshua Luke Retief (214234169)
   Date: 10 June 2021
 */

package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Nurse;
import za.ac.cput.Factory.NurseFactory;

import static org.junit.jupiter.api.Assertions.*;

class NurseFactoryTest {
    @Test
    public void createNurse(){
        Nurse nurse = NurseFactory.createNurse(
                "joshluke95",
                "jl95_1878",
                "Joshua Retief",
                "Male",
                "212 CWI 7654",
                "0645432156",
                26);

        System.out.println(nurse);
    }

}