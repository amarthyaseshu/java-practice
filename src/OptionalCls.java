import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalCls {

    public static void main(String[] args) {
        // Get usernames from db if data available print in uppercase

        Optional.ofNullable(getUserName()).map(String::toUpperCase).ifPresent(System.out::println);
    }

    private static String getUserName() {

        return "hi";
    }
}
