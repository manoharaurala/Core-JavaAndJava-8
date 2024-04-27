public class CreateThread1 extends Thread{



    @Override
    public void run() {

        System.out.println("Thread is in run state: "+this.getName());
        try{
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread is completed: "+this.getName());
    }

    public static void main(String[] args) {
        CreateThread1 thread1=new CreateThread1();
        thread1.setDaemon(true);
        thread1.start();

        CreateThread1 thread2=new CreateThread1();
        thread2.setDaemon(true);
        thread2.start();




        System.out.println("is daemon thread: "+thread1.isDaemon());
        System.out.println("is daemon thread: "+thread2.isDaemon());



    }
}
