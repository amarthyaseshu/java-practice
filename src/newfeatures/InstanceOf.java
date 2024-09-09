package newfeatures;

import java8.Employee;

//previwed in java 14 & finalized in java16
public class InstanceOf {

    public static void main(String[] args) {
//        Object strObj="abcd";
//        if(strObj instanceof String str){
//            str.toUpperCase();
//        }

        Object npe=null;

        if(npe instanceof Employee n && n.getName().equals("abc")){
            System.out.println("a");
        }else{
            System.out.println("b");
        }
    }




}
