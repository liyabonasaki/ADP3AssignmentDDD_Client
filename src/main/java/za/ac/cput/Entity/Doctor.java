/*
Doctor.java
Entity for doctor
Author : Liyabona Saki (217120830)
Date : 03 June 2021
 */

package za.ac.cput.Entity;

public class Doctor {

    private int id;
    private String name;
    private String lastname;
    private int age;
    private String gender;
    private String phone_number;
    private String address;
    private String username;
    private String password;

    private Doctor(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.lastname = builder.lastname;
        this.age = builder.age;
        this.gender = builder.gender;
        this.phone_number = builder.phone_number;
        this.address = builder.address;
        this.username = builder.username;
        this.password = builder.password;

    }

    public static class Builder{

        private int id;
        private String name;
        private String lastname;
        private int age;
        private String gender;
        private String phone_number;
        private String address;
        private String username;
        private String password;

        public Builder setid(int id){
            this.id = id;
            return this;
        }

        public Builder setname(String name){
            this.name = name;
            return this;
        }

        public Builder setlastname(String lastname){
            this.lastname = lastname;
            return this;
        }
        public Builder setage(int age){
            this.age = age;
            return this;
        }
        public Builder setgender(String gender){
            this.gender = gender;
            return this;
        }

        public Builder setphone_number(String phone_number){
            this.phone_number = phone_number;
            return this;
        }
        public Builder setaddres(String address){
            this.address = address;
            return this;
        }
        public Builder setusername(String username){
            this.username = username;
            return this;
        }

        public Builder setpassword(String password){
            this.password = password;
            return this;
        }
        public Doctor build(){
            return new Doctor(this);
        }

        private Builder copy(Doctor d){

            this.id = d.id;
            this.name = d.name;
            this.lastname = d.lastname;
            this.age = d.age;
            this.gender = d.gender;
            this.phone_number = d.phone_number;
            this.address = d.address;
            this.username = d.username;
            this.password = d.password;

            return this;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    ", phone_number='" + phone_number + '\'' +
                    ", address='" + address + '\'' +
                    ", username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }

}
