package java8.practice;

import java8.practice.Order;
import java8.practice.Product;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class ReportGenerations {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(Arrays.asList(
                        new Product("iPhone", "Electronics", 2, true),
                        new Product("USB Cable", "Electronics", 5, true),
                        new Product("Headphones", "Electronics", 1, false) // out of stock
                ), 1500, LocalDateTime.now().minusHours(3)),// included

                new Order(Arrays.asList(
                        new Product("T-shirt", "Clothing", 3, true),
                        new Product("Jeans", "Clothing", 2, true)
                ), 600, LocalDateTime.now().minusHours(5)), // included

                new Order(Arrays.asList(
                        new Product("Sandals", "Footwear", 1, true),
                        new Product("Sneakers", "Footwear", 1, false) // out of stock
                ), 400, LocalDateTime.now().minusHours(2)), // excluded (value <= 500)

                new Order(Arrays.asList(
                        new Product("Cookware Set", "Home & Kitchen", 1, true),
                        new Product("Knife", "Home & Kitchen", 2, true)
                ), 1000, LocalDateTime.now().minusHours(26)), // excluded (too old)

                new Order(Arrays.asList(
                        new Product("iPhone", "Electronics", 1, true),
                        new Product("T-shirt", "Clothing", 1, false) // out of stock
                ), 700, LocalDateTime.now().minusHours(1)) // included
        );
/*
              Generate a report:
•              For each product category,
                  From orders in the last 24 hours with total value> *500
•               Exclude products that are marked "out of stock",
•               Group by category,
•                Sum up total quantity sold per category,
•             Sort by total quantity descending.
*/

        Map<String, Integer> filteredProducts = orders.stream()
                .filter(of -> (of.getOrderTime().isAfter(LocalDateTime.now().minusHours(24))) && of.getTotalValue() > 500)
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> product.isInStock())
                .collect(Collectors.groupingBy(Product::getCategory,Collectors.summingInt(Product::getQuantity)))
                .entrySet().stream()
.sorted (Map.Entry. <String, Integer>comparingByValue (Comparator.reverseOrder()))
                .collect (Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));
        //3rd parameter is to check what if  there's a duplicate key/collisions
        //4th parameter is deifining map, as to preserve order using LinkedHashMap






    }
    }