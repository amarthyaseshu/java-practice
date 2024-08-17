import java.util.HashSet;
import java.util.Set;

// final because it should'nt be overridden
public final class ImmutableClass {

    private final int num;

    private final String s;

    private final Set<String> set;

    public int getNum() {
        return num;
    }

    public String getS() {
        return s;
    }
    // for set doing deep copy & returning because its immutable & can be modified
    public Set<String> getSet() {
        return new HashSet<>(set);
    }

    public ImmutableClass(int  num,String s,Set<String> set) {
        this.num=num;
        this.set=new HashSet<>(set);
        this.s=s;
    }
}
