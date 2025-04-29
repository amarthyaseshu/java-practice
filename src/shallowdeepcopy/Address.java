package shallowdeepcopy;

class Address implements Cloneable {
    String city;

    Address(String city) {
        this.city = city;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow — fine here because city is immutable
    }
}