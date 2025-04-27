package parentchild;

public class TestStaticParentChild {

    public static void main(String[] args) {

        StaticParent.commonStaticMtd();
        StaticChild.commonStaticMtd();

        StaticParent sp=new StaticParent();
        sp.commonStaticMtd();

        StaticParent sp1=new StaticChild();
        sp1.commonStaticMtd();

        StaticChild sc=new StaticChild();
        sc.commonStaticMtd();

    }
}
