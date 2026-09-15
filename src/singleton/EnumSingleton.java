package singleton;

// Enum automatically Singleton in Java
// Disadvantage: Eager Loading
public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("Singleton method called");
    }
}