package passbyvaluereference;

public class MyObject {
    int value = 5;
    int data =5;

   static void modifyObject(MyObject obj) {
        obj.value = 10;  // Modifies the object the reference points to
    }

    static void reassignReference(MyObject obj) {
        obj = new MyObject();  // This affects only the local copy of the reference
        obj.data = 15;
    }

    public static void main(String[] args) {
        MyObject obj = new MyObject();
        modifyObject(obj);
        System.out.println(obj.value);  // Output: 10 (modified)
        reassignReference(obj);
        System.out.println(obj.data);  // Output: 5 (unchanged)
    }
}
