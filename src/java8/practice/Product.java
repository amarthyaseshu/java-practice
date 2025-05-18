package java8.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private String productId;

    private String name;

    private String category;

    private int quantity;

    private boolean inStock;

    private double price;

    public Product(String productId, String category, int quantity, boolean inStock) {
        this.productId = productId;
        this.category = category;
        this.quantity = quantity;
        this.inStock = inStock;
    }
}
