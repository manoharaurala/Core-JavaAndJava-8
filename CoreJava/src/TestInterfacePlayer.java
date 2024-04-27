public class TestInterfacePlayer extends AbstractClass implements InterfacePlayer,InterfaceTest{

    int a=100;

    @Override
    public void defaultmove() {
        InterfacePlayer.super.defaultmove();
    }

    @Override
    public void move() {
        System.out.println("move method and a value is"+a);


    }



    public static void main(String[] args) {
        InterfacePlayer ip=new TestInterfacePlayer();

        ip.move();
        InterfacePlayer.staticmove();
        ip.defaultmove();

        TestInterfacePlayer ip2=new TestInterfacePlayer();
        ip2.move();
        ip2.defaultmove();

        //InterfacePlayer.a=1000;
        System.out.println("Value "+ip2.a);
        System.out.println("Value "+InterfacePlayer.a);
    }


    @Override
    void draw() {

    }
}
