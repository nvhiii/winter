import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a program that reads names of
 * items from the user. If the name is
 * empty, the program stops reading. Otherwise,
 * the given name is used to create a new item,
 * which you will then add to the items list.
 *
 * Having read all the names, print all the
 * items by using the toString method of the
 * Item class. The implementation of the Item
 * class keeps track of the time of creation,
 * in addition to the name of the item.
 */
public class Item {

    // instance variable(s)
    private String name;
    private Date creationDate = new Date();

    // constructor
    public Item(String name) {

        this.name = name;


    }

    // getter method
    public Date getCreationDate() {

        return new Date(creationDate.getTime());

    }

    @Override
    public String toString() {

        return this.name + " (created at: " + getCreationDate() + ")"; // will add local date / time to main

    }


}
