package java8.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private String orderId;

    private List<Product> products;

    private double totalValue;

    private LocalDateTime orderTime;

    public Order(List<Product> products, double totalValue, LocalDateTime orderTime) {
        this.orderTime = orderTime;
        this.totalValue = totalValue;
        this.products = products;
    }
}