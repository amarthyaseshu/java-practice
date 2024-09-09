package passbyvaluereference;

public class Test {

    public static void main(String[] args) {
        int value = 5;
        modifyValue(value);
        String str="abcd";
        modifyString(str);
        System.out.println(value);  // Output: 5 (unchanged)
        System.out.println(str);  // Output: abcd (unchanged)
        String strObj=new String("strObj");
        modifyStringObj(strObj);
        System.out.println(strObj); // Output: abcd (unchanged)
    }

    private static void modifyStringObj(String strObj) {
        strObj=new String("asdf");
    }

    private static void modifyString(String str) {
        str="efg";
    }

    static void modifyValue(int x) {
        x = 10;  // Modifies only the copy of the variable
    }
}
