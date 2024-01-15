public class Book {

    // instance variables w/ encapsulation
    private String title;
    private int pages;
    private int pubYear;

    // constructor
    public Book(String title, int pages, int publicationYear) {

        this.title = title;
        this.pages = pages;
        this.pubYear = publicationYear;

    }

    @Override
    public String toString() {

        return this.title + ", " + this.pages + " pages, " + this.pubYear;

    }

    // getter methods
    public String getTitle() {

        return this.title;

    }

    public int getPages() {

        return this.pages;

    }

    public int getPubYear() {

        return this.pubYear;

    }

}
