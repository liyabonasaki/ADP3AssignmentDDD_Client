/* Nurse.java
   Factory for the Nurse
   @ author: Joshua Luke Retief (214234169)
   Date: 10 June 2021
 */

package za.ac.cput.Factory;

import za.ac.cput.Entity.Nurse;


public class NurseFactory {
    public static Nurse createNurse(String nurseId, String nurseUsername, String nursePassword, String nurseName,
                                    String nurseGender, String nurseAddress, String nurseContactNumber, int nurseAge )
    {


        Nurse nurse = new Nurse.BuilderNurse()
                .setNurseID(nurseId)
                .setNurseUsername(nurseUsername)
                .setNursePassword(nursePassword)
                .setNurseName(nurseName)
                .setNurseGender(nurseGender)
                .setNurseAddress(nurseAddress)
                .setNurseAge(nurseAge)
                .setNurseContactNumber(nurseContactNumber)
                .build();

        return nurse;
    }
}
