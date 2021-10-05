/*
Doctor.java
Entity for doctor
Author : Liyabona Saki (217120830)
 */

package za.ac.cput.Service.Impl;

import za.ac.cput.Entity.Doctor;
import za.ac.cput.Service.IService;

import java.util.Set;

public interface IDoctorService extends IService <Doctor,String> {
    abstract Doctor create(Doctor doctor);
    abstract Doctor read(String id);
    abstract Doctor update(Doctor doctor);
    abstract boolean delete(String id);

    Set<Doctor> getAllDoctor();


}
