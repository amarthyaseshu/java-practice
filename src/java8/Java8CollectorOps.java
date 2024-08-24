package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
    }
}
