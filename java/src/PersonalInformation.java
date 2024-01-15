public class PersonalInformation {

    private String fName;
    private String lName;
    private int idNum;

    public PersonalInformation(String firstName, String lastName, int identificationNumber) {

        this.fName = firstName;
        this.lName = lastName;
        this.idNum = identificationNumber;

    }

    @Override
    public String toString() {

        return this.fName + " " + this.lName;

    }

}
