/*INurseRepository.java
   Interface for the NurseRepository
   Author: Joshua Retief (214234169)
   Date: 15 August 2021
 */

package za.ac.cput.Repository;

import za.ac.cput.Entity.Nurse;
import java.util.Set;

public interface INurseRepository extends IRepository<Nurse, String>
{
    public Set<Nurse> getAllNurse();
}
