package exception;

import java.io.IOException;
/*
Parent can have multiple implmentations, so it's not forced for child to implement parent exceptions
 */
public class ParentE {

    public void parentThrowsException() throws IOException {

    }

    public void childThrowsException(){

    }

    public void childThrowsRunTimeException(){

    }

    public void bothThrowsCheckedException() throws IOException{

    }
}
