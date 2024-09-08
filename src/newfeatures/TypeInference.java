package newfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TypeInference {

    public static void main(String[] args) {

        //1. Generics and Diamond Operator

        List<String> list = new ArrayList<>();

        //2. Local Variable Type Inference (var)

        var message = "Hello, World!";  // Inferred as String
        var number = 42;                // Inferred as int
        var list1 = new ArrayList<String>();  // Inferred as ArrayList<String>

        //3. Type Inference in Lambda Expressions

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // The type of 'n' is inferred from the context (Integer)
        numbers.forEach(n -> System.out.println(n * 2));

        //4. Type Inference in Method Arguments

            print("Hello");  // Type T inferred as String
            print(123);      // Type T inferred as Integer



    }

    public static <T> void print(T value) {
        System.out.println(value);
    }


}
