package superkeyword;

public class Child extends Parent{

    public Child(){
        super();
        String s="hello";
        //Call to 'super()' must be first statement in constructor body
        // Before Java23
       // super();
    }

    public void accessParent(){
        //Call to 'super()' only allowed in constructor body
       // super();
        String mobile1 = super.mobile;

    }
}
