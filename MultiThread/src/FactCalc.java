import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

import static java.util.stream.Collectors.toList;

public class FactCalc {
    public static void main(String[] args) {
        int[] numbers = {15, 52, 80, 60, 70, 60, 80, 24, 40, 30,
                40, 50, 60};

        ArrayList<BigInteger> ret=new ArrayList<BigInteger>();



        //sequential
        long startTime = System.nanoTime();
        for(int num:numbers){

            BigInteger ans=factorial(BigInteger.valueOf(num));
            ret.add(ans);
        }

        System.out.println(ret);
        long endTime = System.nanoTime();
        System.out.println("Sequential Time: " + (endTime - startTime) / 1_000_000 + " ms");



        startTime=System.nanoTime();
        //using parallel stream
        List<BigInteger> ans = Arrays.stream(numbers)
                .mapToObj(BigInteger::valueOf)
                .map(FactCalc::factorial)
                .collect(toList());
        System.out.println(ans);
        endTime=System.nanoTime();
        System.out.println("Parallel Stream Time: " + (endTime - startTime) / 1_000_000 + " ms");

        //using multi thread
        startTime=System.nanoTime();
        for(int num:numbers){
           Thread t= new Thread(()->{

                BigInteger result = factorial(BigInteger.valueOf(num));
                System.out.println(num + "! = " + result);
            });
           t.start();

        }
        endTime=System.nanoTime();
        System.out.println("Multithreading Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }





    public static BigInteger factorial(BigInteger n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n.intValue(); i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
