/* Nurse.java
   Entity for the Nurse
   @ author: Joshua Luke Retief (214234169)
   Date: 10 June 20121
 */

package za.ac.cput.Entity;


public class Nurse {
    private String nurseID, nurseUsername, nursePassword, nurseName, nurseGender, nurseAddress;
    private int nurseAge, nurseContactNumber;

    private Nurse(Builder builder) {
        this.nurseID = builder.nurseID;
        this.nurseUsername = builder.nurseUsername;
        this.nursePassword = builder.nursePassword;
        this.nurseName = builder.nurseName;
        this.nurseGender = builder.nurseGender;
        this.nurseAddress = builder.nurseAddress;
        this.nurseAge = builder.nurseAge;
        this.nurseContactNumber = builder.nurseContactNumber;


    }

    @Override
    public String toString() {
        return "Nurse{" +
                "nurseID='" + nurseID + '\'' +
                ", nurseUsername='" + nurseUsername + '\'' +
                ", nursePassword='" + nursePassword + '\'' +
                ", nurseName='" + nurseName + '\'' +
                ", nurseGender='" + nurseGender + '\'' +
                ", nurseAddress='" + nurseAddress + '\'' +
                ", nurseAge=" + nurseAge + '\'' +
                ", nurseContactNumber=" + nurseContactNumber +
                '}';
    }

    public static class Builder
    {
        private String nurseID, nurseUsername, nursePassword, nurseName, nurseGender, nurseAddress;
        private int nurseAge, nurseContactNumber;

        public Builder setNurseID(String nurseID) {
            this.nurseID = nurseID;
            return this;
        }

        public Builder setNurseUsername(String nurseUsername) {
            this.nurseUsername = nurseUsername;
            return this;
        }

        public Builder setNursePassword(String nursePassword) {
            this.nursePassword = nursePassword;
            return this;
        }

        public Builder setNurseName(String nurseName) {
            this.nurseName = nurseName;
            return this;
        }

        public Builder setNurseGender(String nurseGender) {
            this.nurseGender = nurseGender;
            return this;
        }

        public Builder setNurseAddress(String nurseAddress) {
            this.nurseAddress = nurseAddress;
            return this;
        }

        public Builder setNurseAge(int nurseAge) {
            this.nurseAge = nurseAge;
            return this;
        }

        public Builder setNurseContactNumber(int nurseContactNumber) {
            this.nurseContactNumber = nurseContactNumber;
            return this;
        }

        public Nurse build(){
            return new Nurse(this);
        }

        public Builder copy(Nurse nurse){
            this.nurseID = nurse.nurseID;
            this.nurseUsername = nurse.nurseUsername;
            this.nursePassword = nurse.nursePassword;
            this.nurseName = nurse.nurseName;
            this.nurseGender = nurse.nurseGender;
            this.nurseAddress = nurse.nurseAddress;
            this.nurseAge = nurse.nurseAge;
            this.nurseContactNumber = nurse.nurseContactNumber;

            return this;
        }


    }
}
