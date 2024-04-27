package FunctionalInterface;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class BiFunctionalInterface {

    public static void main(String[] args) {
        BinaryOperator<Integer> sum=(x, y)->{
            return x+y;
        };

        System.out.println("BinaryOperator = " +sum.apply(5,15) );

        BiConsumer<Long,Integer> factor=(x,y)->{

            if(x%y==0) System.out.println(y+" is factor of "+x);
        };

       factor.accept(1000000l,100);

        BiFunction<Long,Integer,Boolean> biFunctionfactor=(x,y)->{

            if(x%y==0) return true;

            return false;
        };


        boolean ans=biFunctionfactor.apply(10001l,10);

        System.out.println("ans = " + ans);


        BiPredicate<Integer,Integer>biPredicate=(x,y)->{

            if(x%10==0 && x%9==0) return true;

            return false;

        };

        Runnable runnable=()->{

        };

    }
}
