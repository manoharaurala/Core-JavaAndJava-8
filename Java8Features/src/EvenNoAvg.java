import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class EvenNoAvg {

    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9,10};

        List<Integer>list=Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toList());

        double ans=list.stream()
                .filter(e->e%2==0)
                .mapToDouble(n->n)
                .average().orElse(0.0);

        System.out.println("ans = " + ans);


    }
}
