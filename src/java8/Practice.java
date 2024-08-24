package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {

    public static void main(String[] args) {
        // find 2nd highest element

        List<Integer> intList= Arrays.asList(9,3,1,6,9,8);
       Optional<Integer> first = intList.stream().distinct().sorted().skip(1).findFirst();
       System.out.println(first.get());

       // Stream.iterate() - Give infinite Stream, we generate sequence of numbers

        Stream.iterate(0,n->n+1).limit(5).collect(Collectors.toSet());

        //Collectors.collectingAndThen() -> Do some operation like round up after collecting

        //take while & drop while - same like filter

        List<Integer> intListT= Arrays.asList(9,3,1,6,9,8);

        List<Integer> collect = intListT.stream().takeWhile(n -> n > 5).collect(Collectors.toList());

        // Collectors.teeing - To map 2 collectors

        // Stream.concat() - Concat 2 streams

        Stream<Integer> intStream1=Stream.of(1,2,3);
        Stream<Integer> intStream2=Stream.of(4,5,6);

        Stream<Integer> concatStream=Stream.concat(intStream1,intStream2);
        concatStream.forEach(System.out::println);

        // Collectors.partitionBy - partition based on condition for eg partitioning even & odd

        Map<Boolean, List<Integer>> collect1 = concatStream.collect(Collectors.partitioningBy(n -> n % 2 == 0));

        // IntStream.range or range closed, generate numbers of a particular range
        // range dont include last
        List<Integer> range= IntStream.range(1,10).boxed().collect(Collectors.toList());
        // rangeClosed  include last
        List<Integer> rangeClosed= IntStream.range(1,10).boxed().collect(Collectors.toList());

    }
}
