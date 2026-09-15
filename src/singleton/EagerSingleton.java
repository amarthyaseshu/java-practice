package singleton;

public class EagerSingleton {

    // As it is static, it will be initialized only once when the class is loaded.
    // Thread safe
    // Object is created even before getInstance() method is called
private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton () {
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    // Disadvantage: If the instance is not used, it will still be created and occupy memory.
}