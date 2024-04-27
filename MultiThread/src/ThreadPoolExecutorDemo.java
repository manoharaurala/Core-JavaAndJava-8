import java.util.concurrent.*;

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executorService=new ThreadPoolExecutor(5,10,5000, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>(4));
        CountDownLatch countDownLatch=new CountDownLatch(3);
        Runnable runnable=()->{
            System.out.println("Executed in thread: " + Thread.currentThread().getName());
            countDownLatch.countDown();
        };

        for(int i=0;i<15;i++){
            executorService.submit(runnable);
        }

        try{
            countDownLatch.await();
        }
        catch (InterruptedException e){

        }

        executorService.shutdownNow();

        System.out.println("stooping manin thread: "+Thread.currentThread().getName());
    }
}
