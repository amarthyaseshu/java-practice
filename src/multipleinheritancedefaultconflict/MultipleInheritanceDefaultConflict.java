package multipleinheritancedefaultconflict;

public class MultipleInheritanceDefaultConflict implements Interface1, Interface2{

    // Though both interfaces have same abstract mtd, overriding once will be sufficient
    @Override
    public void generateReports() {

    }

    // forced to override default mtds because there's an ambiguity
    @Override
    public void show() {
        // Must override to resolve the conflict
        Interface1.super.show();  // We can choose which interface's method to call
    }
}
