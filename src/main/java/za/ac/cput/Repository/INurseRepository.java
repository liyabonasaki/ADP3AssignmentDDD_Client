package za.ac.cput.Repository;

import za.ac.cput.Entity.Nurse;
import java.util.Set;

public interface INurseRepository extends IRepository<Nurse, String>
{
    public Set<Nurse> getAllNurse();
}
