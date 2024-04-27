public class AbstractClassTest extends AbstractClass{

    @Override
    void draw() {
        System.out.println("From draw method and hash code"+this.hashCode());
    }

    public static void main(String[] args) {
        AbstractClass ab=new AbstractClassTest();

        ab.draw();
        ab.printHello();

        AbstractClass ab2=new AbstractClass() {
            @Override
            void draw() {

                System.out.println("Hash code"+this.hashCode());

            }
        };

        AbstractClassTest ab3= new AbstractClassTest();


    }
}
