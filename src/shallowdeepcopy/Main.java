package shallowdeepcopy;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //shallow copy
        PersonShallowCopy p1 = new PersonShallowCopy("Alice", new Address("NYC"));
        PersonShallowCopy shallow = (PersonShallowCopy) p1.clone();

        shallow.address.city = "Boston";
        System.out.println(p1.address.city); // Boston —  shared object

        //deep copy

        PersonDeepCopy pd = new PersonDeepCopy("Alice", new Address("NYC"));
        PersonDeepCopy deep = (PersonDeepCopy) pd.clone();

        deep.address.city = "Chicago";
        System.out.println(pd.address.city); // NYC — deep copy
    }
}