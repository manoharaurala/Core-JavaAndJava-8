import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class InternalIterator {
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(1,2,3,4,5,6,7,8,9);

        //Annonymous Inner Class
        arr.forEach(new Consumer<Integer>(){

            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });


        //lambda expression type interference
        arr.forEach((i)->{
            System.out.println(i);
        });


        //when lamda has one parameter
        arr.forEach(System.out::println);
    }
}
