import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindEmployeeCountByDepartment {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList( new Employee("Alice", "Engineering"), new Employee("Bob", "Sales"), new Employee("Carol", "Engineering"), new Employee("Dave", "Marketing"), new Employee("Eve", "Sales") );
        Stream<Employee> employeeStream=employees.stream();

        Map<String,Long>map=employeeStream
                .collect(Collectors.groupingBy(
                        Employee::getName,Collectors.counting()
                ));

        System.out.println("map = " + map);


    }
}
