package multipleinheritancedefaultconflict;

interface Interface1 {

    void generateReports();

    default void show() {
        System.out.println("Interface1 show");
    }
}