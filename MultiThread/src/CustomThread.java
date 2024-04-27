public class CustomThread {
    public static void main(String[] args) throws InterruptedException {
        CustomThread1 thread1=new CustomThread1();
        CustomThread2 thread2=new CustomThread2();

        thread1.start();
        thread2.start();
        thread1.start();

       // Thread.State new;

        Thread.sleep(10000);
        System.out.println("Main thread is completed: "+Thread.currentThread().getName());

    }
}
