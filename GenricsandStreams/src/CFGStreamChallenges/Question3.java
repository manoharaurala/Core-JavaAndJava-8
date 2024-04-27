package CFGStreamChallenges;

import java.util.Arrays;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        List<String> city= Arrays.asList("Udupi","Kota","Ooti","Aanekal");
        String ans=city.stream()
                .reduce("",(carry,str)->carry+str);

        System.out.println(ans);

    }
}
