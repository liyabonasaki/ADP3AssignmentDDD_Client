/*
Author Liyabona Saki (217120830)
 */

package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Entity.Doctor;
import za.ac.cput.Factory.DoctorFactory;
import za.ac.cput.Service.Impl.DoctorServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorServiceImpl doctorService;

    //Create
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public Doctor create(@RequestBody Doctor doctor){
        Doctor newDoctor = DoctorFactory.createDoctor(doctor.getId(),
                doctor.getName(),
                doctor.getLastname(),
                doctor.getAge(),
                doctor.getPhone_number(),
                doctor.getAddress(),
                doctor.getGender(),
                doctor.getUsername(),
                doctor.getPassword());
        return doctorService.create(newDoctor);
    }

//    Read
    @GetMapping("/read")
    public Doctor read(@RequestBody Doctor doctor){
        return doctorService.read(doctor.getId());
    }

    //Update
    @PostMapping("/update")
    public Doctor update(@RequestBody Doctor doctor){
        return this.doctorService.update(doctor);
    }

    @DeleteMapping("/delete")
    public boolean delete(@RequestBody Doctor doctor){
        return doctorService.delete(doctor.getId());
    }

    //List all
    @GetMapping("/getAll")
    public Set<Doctor> getAllDoctors(){
        return doctorService.getAllDoctor();
    }

}
