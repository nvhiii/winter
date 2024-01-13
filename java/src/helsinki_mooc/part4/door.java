package helsinki_mooc.part4;

/**
 * Create a class named Door.
 * The door does not have any variables.
 * Create for it a constructor with no parameters
 * (or use the default constructor). After that,
 * create a public void knock() method for the
 * door that prints the message "Who's there?"
 * when called.
 *
 * The door should work as follows.
 */
public class door {

    // specified no class variables

    // using default constructor, since no param for instantiation

    public void knock() {

        System.out.println("Who's there?");

    }

    // main method
    public static void main(String[] args) {

        door alexDoor = new door();
        alexDoor.knock();

    }


}
