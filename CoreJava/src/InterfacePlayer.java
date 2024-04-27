public interface InterfacePlayer extends InterfaceTest {


    public static void staticmove(){

        System.out.println("Static move method");

    }

    default void defaultmove(){
        System.out.println("default move method InterfacePlayer");
    }

    @Override
    default void test() {
        InterfaceTest.super.test();
    }

    void move();

    int a=10;
}
