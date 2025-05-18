package exception;


import java.io.IOException;

public class ChildE extends ParentE {


    public void throwParentException(){

    }

    // Give compilation error because Parent mtd is not throwing & child throwing Checked Exception
    public void childThrowsException() /* throws IOException */ {
    }

    /*
    It's not forced because it can happen any time as its not checked
     */
    public void childThrowsRunTimeException() throws NullPointerException{

    }

    public void bothThrowsCheckedException() throws IOException{

    }
}
