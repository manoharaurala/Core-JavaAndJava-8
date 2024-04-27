import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaExpress {
    public static void main(String[] args) {
        CustomInterface<Integer> c2=(a,b)->a+b;

       System.out.println(c2.add(4,7));

    }
}
