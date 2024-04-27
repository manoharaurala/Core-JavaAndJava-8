public class CustomThread2 extends Thread{
    @Override
    public void run(){
        System.out.println("CustomThread2 started: "+Thread.currentThread().getName());

        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("CustomThread2 completed");
    }
}
