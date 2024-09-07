package java8;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Java8CollectorOps {

    public static void main(String[] args) {
        //joining- Concat the elements of stream to a single string with optional delimiters, prefixes & suffixes
        List<String> strList=new ArrayList<>();
        strList.stream().collect(Collectors.joining());
        strList.stream().collect(Collectors.joining(" "));
        strList.stream().collect(Collectors.joining(" ","[","]"));

        //groupBy - Convert list objets to map

        List<Employee> employeeDataList= Arrays.asList(
              new Employee("Amar","hyderabad"),
                new Employee("Venkat","banglore"),
                new Employee("Ravi","chennai") ,
                new Employee("Kiran","hyderabad"),
                new Employee("Venu","chennai")
        );

        Map<String, List<Employee>> collect = employeeDataList.stream().collect(Collectors.groupingBy(e -> e.getCity()));
        System.out.println(collect);

        Map<String, List<String>> collectNames = employeeDataList.stream().collect(Collectors.groupingBy(e -> e.getCity(),Collectors.mapping(e->e.getName(),Collectors.toList())));
        System.out.println(collectNames);

       // partiotionBy
        //Eg: Even & Odd numbers

        List<Integer> nums=List.of(1,2,3,4,5);

        Set<Map.Entry<Boolean, List<Integer>>> entries = nums.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0)).entrySet();

        System.out.println(entries);

        // summarizingint

        // To get the count,min,max,sum & avg of integers

        List<Integer> nums1=List.of(1,2,3,4,5);

        IntSummaryStatistics summaryInt=nums1.stream().collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println(summaryInt);

        //mapping
        // Eg: Collect list of email ids from orders list

        List<Orders> ordersList=List.of(new Orders("abc","amar@gmail.com",null),new Orders("cba","seshu@gmail.com",null));
        List<String> emails = ordersList.stream().collect(Collectors.mapping(o -> o.getEmailId(), Collectors.toList()));
        System.out.println(emails);

        //joining
        // To convert list of String to String

        List<String> strList1=List.of("apple","mango","banana");
        String joiningStr = strList1.stream().collect(Collectors.joining(" ", "[", "]"));
        System.out.println(joiningStr);

        //groupingby with down stream collector
        //groupingby size & count them
        List<String> strList2=List.of("apple","mango","banana","grapes");

        Map<Integer, Long> sizeCounting = strList2.stream().collect(Collectors.groupingBy(l -> l.length(), Collectors.counting()));
        System.out.println(sizeCounting);

        // filtering

        List<String> strList3=List.of("apple","mango","banana","grapes");

        strList3.stream().collect(Collectors.filtering(a->a.length()>3,Collectors.toList()));

        //collectingAndThen

        List<String> strList4=List.of("banana","apple","mango","banana","grapes");

        Integer sizeOfUnique = strList4.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), a -> a.size()));

        //toMap

        //Collect orders based on orderId & amount
        List<Orders> ordersList1=List.of(new Orders("abc","amar@gmail.com",null),new Orders("cba","seshu@gmail.com",null));

        Map<String, BigDecimal> collect1 = ordersList1.stream().collect(Collectors.toMap(o -> o.getOrderNum(), o -> o.getAmount()));
        // for thread safety use toConcurrentMap

        //reducing

        List<Integer> nums2=List.of(1,2,3,4,5);

        Optional<Integer> sum = nums2.stream().collect(Collectors.reducing((l1, l2) -> l1 + l2));


    }
}
