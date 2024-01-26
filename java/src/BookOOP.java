/**
 * Create a "Book" class that describes a book. Each book has an author, title, and page count.
 *
 * Make the class a:
 *
 * Constructor public Book(String author, String name, int pages)
 * Method public String getAuthor() that returns the book's author's name.
 * Method public String getName() that returns the name of the book.
 * Method public int getPages() that returns the number of pages in the book.
 * In addition, make a public String toString() method for the book that will
 * be used to print the book object. For example, the method call should produce
 * the following output:
 *
 * J. K. Rowling, Harry Potter and the Sorcerer's Stone, 223 pages
 */

public class BookOOP {

    private String author;
    private String name;
    private int pages;

    public BookOOP(String author, String name, int pages) {

        this.author = author;
        this.name = name;
        this.pages = pages;

    }

    public String getAuthor() {

        return this.author;

    }

    public String getName() {

        return this.name;

    }

    public int getPages() {

        return this.pages;

    }

    @Override
    public String toString() {

        return this.author + ", " + this.name + ", " + this.pages + " pages";

    }

}
