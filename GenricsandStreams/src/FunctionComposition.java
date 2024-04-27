import java.util.Arrays;
import java.util.List;

public class FunctionComposition {

    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(1,2,3,4,5,6,7,8,9);

        //double even value and total

        System.out.println(arr.stream()
                .filter((e)->e%2==0)
                .map((e)->e*2)
                .reduce(0,Integer::sum));

        Timeit.code(()->

            System.out.println(arr.parallelStream()
                    .filter(e -> e % 2 == 0)
                    .mapToInt(FunctionComposition::compute)
                    .sum()));

    }

    static int compute(int a){

        try{
            Thread.sleep(1000);
        }
        catch (Exception e) {

        }
        return a*2;
    }


}
