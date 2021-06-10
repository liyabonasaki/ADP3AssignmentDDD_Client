/* Nurse.java
   za.ac.cput.Entity for the Nurse
   @ author: Joshua Luke Retief (214234169)
   Date: 10 June 2021
 */

package za.ac.cput.Util;

import java.util.UUID;

public class GenericHelper {
    public static String generateID()
    {
        return UUID.randomUUID().toString();
    }
}
