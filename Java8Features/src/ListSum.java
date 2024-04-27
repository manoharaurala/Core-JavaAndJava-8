import java.util.Arrays;
import java.util.List;

public class ListSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int ans=numbers.stream()
                .filter(i->i%2==0)
                .map(i->i*2)
                .reduce(Integer::sum)       // Sum all elements
                .orElse(0);

        System.out.println("ans = " + ans);


    }
}
