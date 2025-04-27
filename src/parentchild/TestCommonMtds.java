package parentchild;

public class TestCommonMtds {

    public static void main(String[] args) {
        StaticParent sp=new StaticParent();
        sp.normalMtd();

        StaticParent sp1=new StaticChild();
        sp1.normalMtd();

        StaticChild sc=new StaticChild();
        sc.normalMtd();
    }
}
