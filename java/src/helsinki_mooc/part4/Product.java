package helsinki_mooc.part4;

/**
 * Create a class Product that represents a store product.
 * The product should have a price (double), a quantity (int)
 * and a name (String).
 *
 * The class should have:
 *
 * the constructor
 * public Product (String initialName, double initialPrice, int initialQuantity)
 *
 * a method
 * public void printProduct()
 * that prints product information in the following format:
 * Banana, price 1.1, 13 pcs
 */
public class Product {

    // class variables
    private double price;
    private int quantity;
    private String name;

    // constructor
    public Product(String initialName, double initialPrice, int initialQuanity) {

        this.price = initialPrice;
        this.quantity = initialQuanity;
        this.name = initialName;

    }

    // method to specifically print
    public void printProduct() {

        System.out.println(name + ", price " + price + ", " + quantity + " pcs");

    }

}
