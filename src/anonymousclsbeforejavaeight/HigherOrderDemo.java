package anonymousclsbeforejavaeight;

public class HigherOrderDemo {

    // Higher-order function: takes a StringFunction as a parameter
    static String transform(String input, StringFunction fn) {
        return fn.apply(input);
    }

    public static void main(String[] args) {

        // Pass behavior #1: uppercase
        String upper = transform("hello", new StringFunction() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        });

        // Pass behavior #2: reverse
        String reversed = transform("hello", new StringFunction() {
            @Override
            public String apply(String s) {
                return new StringBuilder(s).reverse().toString();
            }
        });

        // Pass behavior #3: exclaim
        String exclaimed = transform("hello", new StringFunction() {
            @Override
            public String apply(String s) {
                return s + "!!!";
            }
        });

        System.out.println(upper);      // HELLO
        System.out.println(reversed);   // olleh
        System.out.println(exclaimed);  // hello!!!

       // Each new StringFunction() { ... } is an anonymous class —
        // a value representing a behavior. This is exactly what a lambda does today:


// Java 8 equivalent
        String upper1     = transform("hello", s -> s.toUpperCase());
        String reversed1  = transform("hello", s -> new StringBuilder(s).reverse().toString());
        String exclaimed1 = transform("hello", s -> s + "!!!");
    }
}