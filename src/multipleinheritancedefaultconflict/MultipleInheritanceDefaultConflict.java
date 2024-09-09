package multipleinheritancedefaultconflict;

public class MultipleInheritanceDefaultConflict implements Interface1, Interface2{

    @Override
    public void show() {
        // Must override to resolve the conflict
        Interface1.super.show();  // We can choose which interface's method to call
    }
}
