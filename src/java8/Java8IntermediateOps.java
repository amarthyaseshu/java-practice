package java8;

import java.util.*;
import java.util.stream.Collectors;

public class Java8IntermediateOps {

    // Intermediate ops will only work if there's a terminal op at the end or else they are lazy

    public static void main(String[] args) {
        //FlatMap
        // flatmap->List<List<Integer>> can be converted to List<Integer>
        List<List<Integer>> listedInts=new ArrayList<>();
        List<Integer> intList=new ArrayList<>();
        intList.add(1);
        listedInts.add(intList);

        Set<Integer> collect = listedInts.stream().flatMap(intListM -> intListM.stream()).map(intM -> intM * 5).collect(Collectors.toSet());
        System.out.println(collect);

        // Distinct - Remove duplicates from List<Integer>
        List<Integer> duplicateList= Arrays.asList(1,2,2,3,4,5);
        List<Integer> distinctList=duplicateList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);

        // Sorted - To sort string in alphabetical order or reverse order
        List<String> names=Arrays.asList("Ravi","Kanchan","Prabhu");
       List<String> sortedNames=  names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNames);
        List<String> reverseSortedNames=  names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedNames);

        //peek - for debugging, without modifying original stream

        List<String> namesSmallCase=Arrays.asList("ravi","kanchan","prabhu");
        namesSmallCase.stream().peek(n->System.out.println(n)).map(n1->n1.toUpperCase()).collect(Collectors.toList());

        //limit - Fetch only to that limit only, like fetching 1st 3

        List<Integer> limitList=Arrays.asList(1,2,3,4,5,6);

        List<Integer> limit=limitList.stream().limit(2).collect(Collectors.toList());
        System.out.println(limit);

        //Skip - Skip few elements and fetch remaining

        List<Integer> skipList=Arrays.asList(1,2,3,4,5,6);

        List<Integer> skip=skipList.stream().skip(2).collect(Collectors.toList());
        System.out.println(skip);



    }
}
