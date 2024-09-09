package gc.alternatives;

public class Main {
    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            // Use the resource
        } // Resource is automatically closed here
    }
}