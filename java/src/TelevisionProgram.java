public class TelevisionProgram {

    // instance variables
    private String name;
    private int duration;

    // constructor
    public TelevisionProgram(String name, int duration) {

        this.name = name;
        this.duration = duration;

    }

    // overridden toString method
    @Override
    public String toString() {

        return this.name + ", " + this.duration + " minutes";

    }

    // getter
    public int getDuration() {

        return this.duration;

    }

}
