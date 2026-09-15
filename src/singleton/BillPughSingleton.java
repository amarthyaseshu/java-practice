package singleton;

//Best because synchronized also not used
public class BillPughSingleton {
    private BillPughSingleton() {
    }

    private static class SingletonHolder {
        private static final BillPughSingleton INSTANCE =new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}