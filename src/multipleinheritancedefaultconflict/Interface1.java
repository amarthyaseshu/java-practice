package multipleinheritancedefaultconflict;

interface Interface1 {
    default void show() {
        System.out.println("Interface1 show");
    }
}