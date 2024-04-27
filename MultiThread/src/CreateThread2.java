public class CreateThread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is in run state: "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread p1=new Thread(new CreateThread2());
        //p1.start();
        p1.run();
    }
}
