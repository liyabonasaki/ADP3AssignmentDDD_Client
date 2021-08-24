package za.ac.cput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

class Main {

    @SpringBootApplication
    @ComponentScan
    public static class ADP3AssignmentDDD {

        public static void main(String[] args) {
            SpringApplication.run(ADP3AssignmentDDD.class, args);

        }
    }
}
