package CFGStreamChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {
        List<String> city= Arrays.asList("Udupi","Kota","Ooti","Aanekal");

       ArrayList<String> ret=
               (ArrayList<String>) city.stream()
                .filter(e->e.startsWith("A") || e.startsWith("E") || e.startsWith("I") || e.startsWith("O") ||e.startsWith("U"))
                .collect(Collectors.toList());

       System.out.println(ret);

    }
}
