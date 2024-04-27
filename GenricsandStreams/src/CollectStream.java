import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

public class CollectStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
        //double the even value and put into lits

        List<Integer> ret=new ArrayList<Integer>();

        //wrong way
   numbers.stream()
                .filter(e->e%2==0)
                .map(e->e*2)
                .forEach(e->ret.add(e));


        System.out.println(ret);
        List<Integer> ret2=numbers.stream()
                .filter(e->e%2==0)
                .map(e->e*2)
                .collect(toList());

        System.out.println(ret2);

        Set<Integer> ret3= numbers.stream()
                .filter(e->e%2==0)
                .map(e->e*2)
                .collect(toSet());

        System.out.println(ret3);


    }
}
