import java.util.Arrays;
import java.util.List;

public class StreamOperation {
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(1,2,3,4,5,6,7,8,9);

        //map transform value
        //filter filter value
        double d=arr.stream()
                .filter(e->e%2==0)
                .map(e->e*2.0)
                .reduce(0.0,(carry,sum)->Double.sum(carry,sum));

        System.out.println(d);
    }
}
