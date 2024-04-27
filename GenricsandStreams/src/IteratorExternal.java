import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IteratorExternal {
    public static void main(String[] args) {

       List<Integer> arr= Arrays.asList(1,2,3,4,5,6,7,8,9);

       for(int i=0;i<arr.size();i++){
           System.out.println(arr.get(i));
       }

       for(int num:arr){
           System.out.println(num);
       }
    }
}
