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
                new Employee("David", "HR", 6000, LocalDate.of(2018, 11, 5)),
                new Employee("Anil", "HR", 6900, LocalDate.of(2018, 11, 5))
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

        /*
        8. Find the highest-paid employee in each department.
         */

        Map<String, Optional<Employee>> highestPaidByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(highestPaidByDept);

        /*
        9. Avg Salary
         */
        Double avgSalary = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(avgSalary);

        /*
        10. Get a list of employees whose names start with 'A', sorted by salary in descending order.
         */

        List<Employee> empASalaryDesc = employees.stream().filter(e -> e.getName().startsWith("A")).sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(empASalaryDesc);

        /*
        11. Create a map where the key is the department name, and the value is the number of employees in that department.
         */

        Map<String, Long> noOfEmpByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(noOfEmpByDept);

        /*
        12.Given a list of transactions (Transaction{id, type, amount}), write a Java 8 program to:
            Group transactions by type .
             Calculate the total amount for each transaction type.
         */

        List<Transaction> transactions = List.of(
                new Transaction("Food", 50),
                new Transaction("Grocery", 30),
                new Transaction("Food", 100),
                new Transaction("Transport", 20)
        );

        Map<String, List<Transaction>> transactionsByType = transactions.stream().collect(Collectors.groupingBy(Transaction::getType));
        System.out.println(transactionsByType);

        Map<String, Double> totalAmtForTransactionType = transactions.stream().collect(Collectors.groupingBy(Transaction::getType, Collectors.summingDouble(Transaction::getAmount)));

        System.out.println(totalAmtForTransactionType);

        /*
        13. find the second-highest salary
         */

        Optional<Employee> secondHighest = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
        System.out.println(secondHighest.get());


    }
}
