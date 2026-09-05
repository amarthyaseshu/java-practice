package trickyqns;

public class PassByValueOrReference {

    static void main() {

        integers();
        objects();
        objects2();

    }

    private static void objects2() {
        // Java is always pass by value
        var a = new StringBuilder("hello");
        fo2(a);
        System.out.println("1st obj2 "+a);
    }

    private static void  fo2(StringBuilder b) {
        b = new StringBuilder("world");
        System.out.println("2nd obj2 "+b);
    }

    private static void objects() {
        var a = new StringBuilder("hello");
        fo(a);
        System.out.println("1st obj "+a);
    }

    static void fo(StringBuilder b) {
        b.append(" world");
                System.out.println("2nd obj "+b);
    }

    private static void integers() {
        // is Java pass by value or reference
        var a = 5;
        f(a);
        System.out.println("1st: "+a);
    }

    static void f(int b) {
        b = 99;
        System.out.println("2nd: "+b);
    }
}
