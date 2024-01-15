/**
 * Create a class called Song.
 * The song has the instance variables
 * name (string) and length in seconds (integer).
 * Both are set in the
 * public Song(String name, int length) constructor.
 * Also, add to the object the methods
 * public String name(),
 * which returns the name of the song, and
 * public int length(),
 * which returns the length of the song.
 *
 */
public class Song {

    // class variables
    private String name;
    private int seconds;

    // constructor
    public Song(String initialName, int initialSeconds) {

        this.name = initialName;
        this.seconds = initialSeconds;

    }

    public String name() {

        return this.name;

    }

    public int length() {

        return this.seconds; // returns length in seconds

    }

}
