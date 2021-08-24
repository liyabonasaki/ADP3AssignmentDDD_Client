/* IPatientRepository.java
 Class for the IPatientRepository
 Author: Bilqees Saban (219090866)
  Date: 24 July 2021
*/

package za.ac.cput.Repository;

import za.ac.cput.Entity.Patient;
import java.util.HashSet;
import java.util.Set;

public interface IPatientRepository extends IRepository<Patient,String>
{
    public Patient create(Patient patient);
    public Patient read(String id);
    public Patient update(Patient patient);
    public boolean delete(String id);
}

