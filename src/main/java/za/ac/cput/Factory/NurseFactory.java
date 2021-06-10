package za.ac.cput.Factory;

import za.ac.cput.Entity.Nurse;

public class NurseFactory {
    public static Nurse createNurse(String nurseID, String nurseUsername, String nursePassword, String nurseName,
                                    String nurseGender, String nurseAddress, int nurseAge,
                                    int nurseContactNumber){

        Nurse nurse = new Nurse.Builder()
                .setNurseID(nurseID)
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
