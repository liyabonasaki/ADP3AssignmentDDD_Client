package za.ac.cput.Services;

import za.ac.cput.Entity.Nurse;
import za.ac.cput.Repository.IRepository;

import java.util.Set;

public interface INurseService extends IRepository<Nurse, String>
{
    public Set<Nurse> getAllNurse();
}
