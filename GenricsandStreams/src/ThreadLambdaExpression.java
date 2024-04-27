public class ThreadLambdaExpression {
    public static void main(String[] args) {

        //1.name
        //2.paramter list
        //3.method body
        //4.return type
        Thread t=new Thread(()->{

            System.out.println("Thread id: "+Thread.currentThread().getId());

        });
        t.start();
    }
}
