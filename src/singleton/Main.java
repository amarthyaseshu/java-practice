package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        EagerSingleton obj1 =
                EagerSingleton.getInstance();
        EagerSingleton obj2 =
        EagerSingleton.getInstance();
        System.out.println(obj1 == obj2); // true

        //Break Singleton using Reflection
        Constructor<EagerSingleton> constructor = EagerSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        EagerSingleton instance = constructor.newInstance();
        System.out.println(instance == obj2);

        EnumSingleton obj3 =
                EnumSingleton.INSTANCE;

        EnumSingleton obj4 =
                EnumSingleton.INSTANCE;

        System.out.println(obj3 == obj4); // true
    }
}
