package za.ac.cput.Entity;

public class main {

    public static void main(String[] args) {
        System.out.println("ADP3 DDD: Implementing Hospital Management System UML class ");
    }

    /*za.ac.cput.Entity.main.Consultation.java
        Entity for Consultation
        Author: Kanya Ramncwana (218297521)
        Date: 24 May 2021
         */
    public static class Consultation {

        private String consultDate, consultReport, nurID, docID, patID;

            public Consultation(Builder builder) {

                this.consultDate = builder.consultDate;
                this.consultReport = builder.consultReport;
                this.nurID = builder.nurID;
                this.docID = builder.docID;
                this.patID = builder.patID;

            }

        @Override
        public String toString() {
            return "za.ac.cput.Entity.main.Consultation{" +
                    "consultDate='" + consultDate + '\'' +
                    ", consultReport='" + consultReport + '\'' +
                    ", nurID='" + nurID + '\'' +
                    ", docID='" + docID + '\'' +
                    ", patID='" + patID + '\'' +
                    '}';
        }

        public static class Builder {

                private String consultDate, consultReport, nurID, docID, patID;

                public Builder setConsultDate(String consultDate) {

                    this.consultDate = consultDate;

                    return this;
                }

                public Builder setConsultReport(String consultReport) {

                    this.consultReport = consultReport;

                    return this;
                }

                public Builder setNurID(String nurID) {
                    this.nurID = nurID;

                    return this;
                }

                public Builder setDocID(String docID) {

                    this.docID = docID;

                    return this;

                }

                public Builder setPatID(String patID) {

                    this.patID = patID;

                    return this;
                }

                public Consultation build() {

                    return new Consultation(this);

                }
                public Builder copy(Consultation consult) {

                    this.consultDate = consult.consultDate;
                    this.consultReport = consult.consultReport;
                    this.nurID = consult.nurID;
                    this.docID = consult.docID;
                    this.patID = consult.patID;

                    return this;

                }

            }
        }
}
