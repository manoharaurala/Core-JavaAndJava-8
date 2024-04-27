import java.util.Arrays;

public class ParallelProcessing {
    public static void main(String[] args) {
        int[] num = {1,2,3,6,60,72};
        int number = Arrays.stream(num).parallel().filter(n ->
                n%6==0).findFirst().orElse(-1);
        System.out.println(number);
    }
}
