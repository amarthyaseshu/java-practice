package shallowdeepcopy;

public class PersonShallowCopy {

    String name;
    Address address;

    PersonShallowCopy(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow — address reference is shared!
    }
}
