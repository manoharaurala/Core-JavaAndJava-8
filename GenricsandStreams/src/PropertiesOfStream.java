import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PropertiesOfStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
        //ordered non sorted non distrinct
        /*numbers.stream()
                .filter(e->e%2==0)
                .forEach(i->System.out.println(i));*/

        //ordered sorted decesding distrinct
        numbers.stream()
                .filter(e->e%2==0)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(i->System.out.println(i));
    }
}
