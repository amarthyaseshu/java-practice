package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8TerminalOps {

    public static void main(String[] args) {

        // Collectors.toSet(); To collect only distinct

        // reduce - reduce into single element, takes 2 args & returns a single value

        List<Integer> intList= Arrays.asList(1,2,3,4,5);
      Integer reducedVal=  intList.stream().reduce((a,b)->a*b).get();
      System.out.println(reducedVal);

      // All Match - Returns boolean, whether all elements match the condition
        // Short circuiting operation - Stops once a single non matching condition is found

        List<Integer> integerList=Arrays.asList(1,2,3,4,5);

        boolean val=integerList.stream().allMatch(i->i>0);
        System.out.println(val);

        // Any Match - Returns boolean, whether any elements match the condition

        // None Match - Returns boolean, whether any elements match the condition

        // findFirst - Returns 1st element (Optional) that matches the filter

        List<Integer> integerListFF=Arrays.asList(1,2,3,4,5);

        Optional<Integer> element=integerListFF.stream().filter(i->i>0).findFirst();

        // findAny - Returns any element (Optional) that matches the filter

        Optional<Integer> element2=integerListFF.stream().filter(i->i>0).findAny();

        // max - find the max val from int

        List<Integer> maxNos=Arrays.asList(1,2,3,4,5);

        Optional<Integer> max = maxNos.stream().max(Integer::compareTo);

        // max - find the min val from int

        //toArray - Convert list of string to array

        List<String> arrayStr=new ArrayList<>();
      String[] strA=  arrayStr.stream().toArray(String[]::new);


    }
}
