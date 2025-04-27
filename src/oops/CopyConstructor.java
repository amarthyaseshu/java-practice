package oops;

public class CopyConstructor {
    private String name;
    private int age;

    // Regular constructor
    public CopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public CopyConstructor(CopyConstructor original) {
        this.name = original.name;
        this.age = original.age;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public static void main(String[] args) {
        // Create original person
        CopyConstructor original = new CopyConstructor("Alice", 30);
        
        // Create copy using copy constructor
        CopyConstructor copy = new CopyConstructor(original);

        // Print both objects
        System.out.println("Original: " + original.getName() + ", " + original.getAge());
        System.out.println("Copy:     " + copy.getName() + ", " + copy.getAge());

        // Modify original
        original.setName("Bob");
        original.setAge(25);

        // Show copy remains unchanged
        System.out.println("\nAfter modification:");
        System.out.println("Original: " + original.getName() + ", " + original.getAge());
        System.out.println("Copy:     " + copy.getName() + ", " + copy.getAge());
    }
}