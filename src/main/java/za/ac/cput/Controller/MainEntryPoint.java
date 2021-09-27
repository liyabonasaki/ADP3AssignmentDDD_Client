/* MainEntryPoint.java
   Class for the MainEntryPoint
   Author: Joshua Retief (214234169)
   Date: 15 August 2021
 */

package za.ac.cput.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "za")
public class MainEntryPoint
{
    public static void MainEntryPoint(String[] args)
    {
       SpringApplication.run(MainEntryPoint.class, args);
    }
}
