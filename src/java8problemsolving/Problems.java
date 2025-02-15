package java8problemsolving;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problems {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Engineering", 7500, LocalDate.of(2020, 1, 15)),
                new Employee("Bob", "Sales", 4500, LocalDate.of(2019, 5, 20)),
                new Employee("Charlie", "Engineering", 8000, LocalDate.of(2021, 3, 10)),
                new Employee("David", "HR", 6000, LocalDate.of(2018, 11, 5))
        );


        /*
        1. Filter Employees by Department
        Use a Stream to filter employees in the "Engineering" department and print their names.
         */

        List<String> empByDeptName=employees.stream().filter(emp-> "Engineering".equalsIgnoreCase(emp.getDepartment())).map(e->e.getName())
                .collect(Collectors.toList());

        System.out.println(empByDeptName);

        /*
        2. Calculate Average Salary Compute the average salary of employees in the "Sales" department using DoubleStream.
         */

       Double averageSalary = employees.stream().filter(emp-> "Sales".equalsIgnoreCase(emp.getDepartment()))
               .mapToDouble(e -> e.getSalary()).average().orElse(0.0);
        System.out.println(averageSalary);

        /*

        3. Find Employee with Highest Salary Use Optional and a custom Comparator to find the employee with the highest salary.

         */

        Optional<Employee> highestSalary = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
        highestSalary.ifPresent(employee -> System.out.println(employee.getName()));

        /*

        4.Group Employees by Department Group all employees by department using Collectors.groupingBy.

         */

        Map<String, List<Employee>> employeeByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(employeeByDept);

        /*

        5. Sort Employees by Hire Date Sort employees by their hire date (oldest first) using Comparator and method references.

         */

        List<Employee> empByHireDate = employees.stream().sorted(Comparator.comparing(Employee::getHireDate)).collect(Collectors.toList());
        System.out.println(empByHireDate);

        /*

        6. Calculate Bonus with Functional Interface Define a functional interface BonusCalculator with a calculateBonus method.
         Use a lambda to apply a 10% bonus to salaries ≥ 5000.

         */

        BonusCalculator bonusCalc = salary -> salary >= 5000 ? salary * 0.1 : salary;
        employees.forEach(e ->
                System.out.println(STR."\{e.getName()} Bonus: \{bonusCalc.calculateBonus(e.getSalary())}")
        );

        /*
       7. Parallel Stream Processing Convert a Stream to a parallel stream to count employees in the "HR" department.
         */

        long hr = employees.parallelStream().filter(e -> "HR".equalsIgnoreCase(e.getDepartment())).count();
        System.out.println(hr);
    }
}
