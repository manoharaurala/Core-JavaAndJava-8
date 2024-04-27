import java.util.Arrays;

public class MyFunctionalImpl {

    public static void main(String[] args) {
        MyFunactionalInterface myFunactionalInterface=((int x,int y)->{
            return x+y;
        });

        System.out.println(myFunactionalInterface.add(2,3));

        Consumer consumer=(X)->{
            System.out.println("X = " + X);
        };

        consumer.print(5);
    }
}
