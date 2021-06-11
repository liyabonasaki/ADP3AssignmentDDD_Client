/* PatientFactory.java
 Class for the PatientFactory
 Author: Bilqees Saban (219090866)
  Date: 11 June 2021
*/

package za.ac.cput.Factory;
import za.ac.cput.Entity.Patient;

public class PatientFactory
{
    public static Patient createPatient (String patID, String patFirstName, String patLastName, String patGender, String patAddress, String patAge, String patContactNumber, String patBloodType, String patCovidStatus)
    {
        Patient patient = new Patient.Builder()
                .setPatID(patID)
                .setPatFirstName(patFirstName)
                .setPatLastName(patLastName)
                .setPatGender(patGender)
                .setPatAddress(patAddress)
                .setPatAge(patAge)
                .setPatContactNumber(patContactNumber)
                .setPatBloodType(patBloodType)
                .setPatCovidStatus(patCovidStatus)
                .build();
        return patient;
    }
}
