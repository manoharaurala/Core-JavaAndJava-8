public class CustomThread1 extends Thread{
    @Override
    public void run(){
        System.out.println("CustomThread1 started: "+Thread.currentThread().getName());

        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("CustomThread1 completed");
    }
}
