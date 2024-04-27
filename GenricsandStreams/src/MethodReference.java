import java.util.Arrays;
import java.util.List;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class MethodReference {
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(1,2,3,4,5,6,7,8,9);
        //println object method
        arr.forEach(System.out::println);

        //arr.stream().map((i)->String.valueOf(i)).forEach((i)->System.out.println(i));

        //value of static method
       arr.stream().map(String::valueOf).forEach(System.out::println);


       arr.stream().map((i)->i.toString()).forEach((i)->System.out.println(i));
       //Parameter as target tostring instnace method and valueOf static method
        arr.stream().map(String::valueOf).map(String::toString).forEach(System.out::println);



        //two parameters

        System.out.println(arr.stream().reduce(0,(e,total)->Integer.sum(e,total)));

        System.out.println(arr.stream().reduce(0,Integer::sum));

       System.out.println( arr.stream().map(String::valueOf).reduce("",(carry,str)->carry.concat(str)));
       System.out.println(arr.stream().map(String::valueOf).reduce("",String::concat).toString());
    }
}
