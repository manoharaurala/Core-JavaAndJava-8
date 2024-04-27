package FunctionalInterface;

import java.util.Arrays;
import java.util.function.*;

public class FunctionalIntefcae {

    public static void main(String[] args) {
        Consumer<Integer> consumer=((x)->{
            System.out.println("consumer"+x);
        });

        consumer.accept(5);

        Supplier<Integer> supplier=()->{

            return 420;
        };

        System.out.println("supplier = "+supplier.get());

        Predicate<Integer> predicate=(x)->{

            if(x%2==0) return true;

            return false;
        };

        System.out.println("Prdeicate "+predicate.test(5));

        Function<Integer,Double>function=X->{

            return X.doubleValue();

        };

        System.out.println("Function = " + function.apply(100));

        UnaryOperator<Integer> square=(x)->{

            return (x*x);
        };

        System.out.println("UnaryOperator = " + square.apply(99));






    }
}
