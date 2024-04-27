package CustomSorting;

import java.util.*;

public class Person implements Comparable<Person>{

    private int id;
    private int salary;
    private String name;

    public Person(int id, String name,int salary) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        if(this.salary>person.salary) return 1;
        else if (this.salary<person.salary) return -1;

        return 0;
    }

    public static void main(String[] args) {
        Person p1=new Person(1,"Ruby",10023412);
        Person p2=new Person(2,"Annayya",4200000);
        Person p3=new Person(3,"Putani",4500000);
        Person p4=new Person(4,"Subba",1600000);

        List<Person>list=new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        Collections.sort(list);

        System.out.println("list = " + list);

        list.stream()
                .sorted().forEach(System.out::println);

        System.out.println("");



        list.stream()
                .sorted(Comparator.comparing(Person::getSalary).reversed())
                .forEach(System.out::println);

        Optional<Person> ans=list.stream()
                .max(Comparator.comparing((Person::getSalary)));

        System.out.println("ans = " + ans.get().getSalary());


        int ans1=list.stream()
                .max(Comparator.comparing((Person::getSalary)))
                .get().getSalary();

    }
}
