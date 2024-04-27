package CFGStreamChallenges;

import java.util.Arrays;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        List<Integer> arr=Arrays.asList(1,2,3,4,5,6,7,8);

        int ans=arr.stream()
                .filter(e->e%2==0)
                .mapToInt(e->e*e)
                .sum();

        System.out.println(ans);
    }
}
