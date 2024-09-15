package java8;

import java.util.Optional;

public class OptionalCls {

    public static void main(String[] args) {
        // Get usernames from db if data available print in uppercase

        Optional.ofNullable(getUserName()).map(String::toUpperCase).ifPresent(System.out::println);
        // Causes NPE if null is passed in Optional.of
       // Optional<Object> o = Optional.of(null);
        // To avoid it use Optional.nullable()
    }

    private static String getUserName() {

        return "hi";
    }
}
