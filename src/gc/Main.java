package gc;

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj = null;  // Eligible for garbage collection

        // Requesting JVM to run garbage collector
        System.gc();  // finalize() might be called
    }
}