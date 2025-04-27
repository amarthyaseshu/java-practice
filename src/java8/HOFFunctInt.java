package java8;

public class HOFFunctInt {
    public static void main(String[] args) {
        String s="";
        FunctInt fi=s1->s1.toUpperCase();
        String secretCode = fi.returnSecretCode(s);

        FunctIntComplex functIntComplex=(s2,i1,l1)->{
            s2="abcd";
            return s2+String.valueOf(i1)+String.valueOf(l1);
        };


    }
}
