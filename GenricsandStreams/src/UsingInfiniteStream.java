import java.util.stream.Stream;

public class UsingInfiniteStream {

    public static int compute(int k, int n) {

        return Stream.iterate(k,e->e+1)
                .filter(e->e%2==0)
                .filter(e->Math.sqrt(e)>20)
                .mapToInt(e->e*2)
                .limit(n)
                .sum();
    }


    public static void main(String[] args) {
        //Given a number k, and a count n, find the total of double of n
        //even numbers starting with k, where sqrt of each number is > 20

        int k = 121;
        int n = 51;
        System.out.println(compute(k, n));
    }
}
