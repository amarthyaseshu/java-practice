package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {

    public static void main(String[] args) {


        // 2nd highest number from a given array

        int[] arr={1,5,2,9,7,7,1};

        Integer secHighest=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        // Longest string in a given array

        String[] str={"abc","asdf","aqwsda","a"};

     String longestSrtring=   Arrays.stream(str).sorted(Comparator.comparing(s->s.length())).skip(str.length-1).findFirst().get();
        System.out.println(longestSrtring);

        String longestSrtring2= Arrays.stream(str).reduce((s1,s2)->s1.length()>s2.length()?s1:s2).get();
        System.out.println(longestSrtring2);

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

       // Map<Boolean, List<Integer>> collect1 = concatStream.collect(Collectors.partitioningBy(n -> n % 2 == 0));

        // IntStream.range or range closed, generate numbers of a particular range
        // range dont include last
        List<Integer> range= IntStream.range(1,10).boxed().collect(Collectors.toList());
        // rangeClosed  include last
        List<Integer> rangeClosed= IntStream.rangeClosed(1,10).boxed().collect(Collectors.toList());

        // Convert list of words to individual Characters

        List<String> words=List.of("hungry","coders");
        // To collect as list of String
        List<String> collect2 = words.stream().flatMap(word ->Stream.of(word.split(""))).toList();
        // To collect as list of Characters
        List<Character> collect3 = words.stream().flatMap(word ->Stream.of(word.split(""))).map(s->s.charAt(0)).toList();

        System.out.println(collect2);

        List<User> users=List.of(new User("a","p"),new User("b","p1")
        ,new User("a","p2"));

        // (existing,duplicate)->existing is useful because if key is same get exception,
        //so tells which one to pick
        Map<String,String> userMap=users.stream().collect(Collectors.toMap(user->user.getUserName(),user->user.getPassword(),

                (existing,duplicate)->existing));

        System.out.println(userMap);




    }
}
