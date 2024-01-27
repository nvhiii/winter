/**
 * Create a Cube class that represents a cube (i.e., a standard hexahedron).
 * Create a public Cube (int edgeLength) constructor for the class, that
 * takes the length of the cube's edge as its parameter.
 *
 * Make a public int volume() method for the cube, which calculates and returns
 * the cube's volume. The volume of the cube is calculated with the formula edgeLength
 * * edgeLength * edgeLength. Moreover, make a public String toString() method for the cube,
 * which returns a string representation of it. The string representation should take the for
 * m "The length of the edge is l and the volume v", where l is the length and v the volume
 * - both the length and volume must be represented as integers.
 *
 */

public class CubeOOP {

    // instance variable
    private int edgeLength;

    // constructor
    public CubeOOP(int edgeLength) {

        this.edgeLength = edgeLength;

    }

    public int volume() {

        // multiply edge val 3 times bc formula is v = s^3
        return this.edgeLength * this.edgeLength * this.edgeLength;

    }

    public String toString() {

        return "The length of the edge is " + this.edgeLength + " and the volume " + volume();

    }

}
