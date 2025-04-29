package shallowdeepcopy;

public class PersonDeepCopy {

    String name;
    Address address;

    PersonDeepCopy(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        PersonDeepCopy cloned = (PersonDeepCopy) super.clone();
        cloned.address = (Address) address.clone(); // now deep
        return cloned;
    }
}
