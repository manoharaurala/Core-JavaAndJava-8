public class ChildClass extends ParentClass{

    int a=10000;
    int b=1000;

    @Override
    protected void print() {
        super.print();
        System.out.println("ChildClass"+super.b);
    }

    public static void main(String[] args) {
        ParentClass c1=new ChildClass();
        c1.print();
    }
}
