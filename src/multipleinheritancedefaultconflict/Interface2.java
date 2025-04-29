package multipleinheritancedefaultconflict;

interface Interface2 {

    void generateReports();

    default void show() {
        System.out.println("Interface2 show");
    }
}