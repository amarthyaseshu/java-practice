package multipleinheritancedefaultconflict;

interface Interface2 {
    default void show() {
        System.out.println("Interface2 show");
    }
}