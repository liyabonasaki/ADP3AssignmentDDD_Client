package za.ac.cput.Factory;

import za.ac.cput.Entity.Nurse;
import za.ac.cput.Util.GenericHelper;

public class NurseFactory {
    public static Nurse createNurse(String nurseUsername, String nursePassword, String nurseName,
                                    String nurseGender, String nurseAddress, int nurseAge,
                                    int nurseContactNumber){

        String nurseId = GenericHelper.generateID();
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
