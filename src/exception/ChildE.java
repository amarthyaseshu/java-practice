package exception;


import java.io.IOException;

public class ChildE extends ParentE {


    public void throwParentException(){

    }

    // Give compilation error because Parent mtd is not throwing & child throwing Checked Exception
    public void childThrowsException() /* throws IOException */ {
    }

    public void childThrowsRunTimeException() throws NullPointerException{

    }

    public void bothThrowsCheckedException() throws IOException{

    }
}
