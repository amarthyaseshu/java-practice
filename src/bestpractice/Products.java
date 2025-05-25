package bestpractice;

public enum Products {

    ECHO_DOT(49.99,"sMART DEVICE");

    private final double price;
    private final String description;


    Products(double price, String description) {
        this.price = price;
        this.description = description;
    }


}
