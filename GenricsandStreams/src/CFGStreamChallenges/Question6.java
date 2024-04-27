package CFGStreamChallenges;

import com.sun.xml.internal.bind.v2.util.CollisionCheckStack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question6 {

        public static void main(String[] args) {
            List<String> city= Arrays.asList("Udupi","Kota","Ooti","Aanekal");

            //ascending order
            List<String> ans=city.stream()
                            .sorted((x,y)->x.compareTo(y))
                    .collect(Collectors.toList());

            System.out.println(ans);

            //descending order

            List<String> ans2=city.stream()
                    .sorted((x,y)->{
                        return y.compareTo(x);
                    }).collect(Collectors.toList());

            System.out.println(ans2);

            List<String> ans3=city.stream()
                    .sorted((x,y)->{
                        int X=x.length();
                        int Y=y.length();
                        return Integer.compare(X,Y);
                    }).collect(Collectors.toList());

            System.out.println(ans3);


            List<String> ans4=city.stream()
                    .sorted((x,y)->{
                        int X=x.length();
                        int Y=y.length();
                        return Integer.compare(Y,X);
                    }).collect(Collectors.toList());

            System.out.println(ans4);

        }
    }

