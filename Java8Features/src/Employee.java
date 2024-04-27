import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

    private String name;
    private String city;

    public Employee(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Smith", "New York"));
        employees.add(new Employee("Jane Doe", "Chicago"));
        employees.add(new Employee("Bob Johnson", "Pune"));
        employees.add(new Employee("Sarah Lee", "Pune"));

        List<Employee>ans=employees.stream()
                .filter(employee->employee.getCity().equals("Pune"))
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());


        ans.stream()
                .map(Employee::getName)
                .forEach(System.out::println);




    }

}
