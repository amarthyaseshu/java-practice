package parentchild;

public class StaticChild extends StaticParent{

    public static void commonStaticMtd(){
        System.out.println("StaticChild commonMtd");
    }

    public void normalMtd(){
        System.out.println("StaticChild normalMtd");
    }
}
