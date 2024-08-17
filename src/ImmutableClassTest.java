import java.util.HashSet;
import java.util.Set;

public class ImmutableClassTest {

    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("a");
        ImmutableClass ic=new ImmutableClass(1,"hi",set);
        // Trying to break immutability with below egs
      int num=  ic.getNum();
      num=2;
     String s= ic.getS();
     s="hello";
     set.add("b");
    Set<String> set1= ic.getSet();
    set1.add("c");
    System.out.println(ic.getNum());
    System.out.println(ic.getS());
    System.out.println(ic.getSet());
    }

}
