import java.util.Arrays;
import java.util.List;

public class LazyEvalutaion {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        //given an ordered list find the double of the first even number greater than 3.

        int a= numbers.stream()
                .filter(LazyEvalutaion::isEven)
                .filter(LazyEvalutaion::isGt3)
                .map(LazyEvalutaion::doubleit)
                .findFirst().get();

        System.out.println(a);


    }

    private static boolean isGt3(int a) {
        System.out.println("isGt3 function: "+a);
        if(a>3) return true;
        return false;
    }

    public static int doubleit(int a){
        System.out.println("doubleit function: "+a);
        return a*2;
    }
    public static boolean isEven(int a){
        System.out.println("isEven function: "+a);
        if(a%2==0) return true;

        return false;

    }
}
