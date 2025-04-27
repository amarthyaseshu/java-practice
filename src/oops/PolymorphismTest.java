package oops;

public class PolymorphismTest {

    public static void main(String[] args) {
        Polymorphism polymorphism=new PolymorphismChild();
        String value = polymorphism.value();
        System.out.println(value);
    }
}
