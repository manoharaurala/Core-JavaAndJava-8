import java.util.Arrays;
import java.util.Optional;

public class OptionalClassDemo {

    public static Optional<Integer> method(){

        return Optional.of(5);

    }

    public static void main(String[] args) {
        Optional<Integer> op=method();

        System.out.println(op.get());
    }
}
