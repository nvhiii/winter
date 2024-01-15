// toString Agent class
public class Agent {

    // instance variables
    private String fName;
    private String lName;

    // constructor
    public Agent(String firstName, String lastName) {

        this.fName = firstName;
        this.lName = lastName;

    }

    public String toString() {

        return this.fName + " " + this.lName;

    }

}
