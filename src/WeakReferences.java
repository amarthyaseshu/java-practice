import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class WeakReferences {

    public static void main(String[] args) {
        //weak reference map
        WeakHashMap<Object, String> weakMap = new WeakHashMap<>();
        Object key = new Object();
        weakMap.put(key, "WeakReferenceValue");

        System.out.println("Before GC: " + weakMap.size());  // Output: 1

        key = null;  // Remove strong reference to key
        System.gc();  // Suggest garbage collection

        System.out.println("After GC: " + weakMap.size());  // Output: 0 (if GC runs)




        // Create a strong reference
        Object strongRef = new Object();

        // Create a weak reference to the object
        WeakReference<Object> weakRef = new WeakReference<>(strongRef);

        // Check if the object is still reachable through the weak reference
        System.out.println("Before GC: Weak reference holds: " + weakRef.get());

        // Remove the strong reference, making the object eligible for GC
        strongRef = null;

        // Suggest garbage collection
        System.gc();

        // After GC, the weak reference should be cleared
        System.out.println("After GC: Weak reference holds: " + weakRef.get());
    }
}
