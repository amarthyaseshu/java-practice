package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListToArrayArrToList {

    public static void main(String[] args) {

        //toArray - Convert list of string to array

        List<String> list=new ArrayList<>();

        String[] arr=  list.stream().toArray(String[]::new);

        // Convert array to list of string

        List<String> list1 = Arrays.asList(arr);


    }
}
