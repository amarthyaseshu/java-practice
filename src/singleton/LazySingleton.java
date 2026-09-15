package singleton;

public class LazySingleton {
    // Cant keep the instance variable as final because it is initialized later in the getInstance() method
    // same causes thread safety issues
    private static LazySingleton instance;

    private LazySingleton () {
    }

    public static LazySingleton getInstance() {

        if (instance == null) {
            // If 2 threads come here at the same time, both will create a new instance and return it
            instance = new LazySingleton();
        }
        return instance;
    }
}