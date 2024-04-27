import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorInto {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        CountDownLatch countDownLatch=new CountDownLatch(3);

        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println("Executed in thread: " + Thread.currentThread().getName());
                countDownLatch.countDown();

            }

        };

        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.submit(runnable);

        countDownLatch.await();
        System.out.println("Done "+Thread.currentThread().getName());
        executorService.shutdown();

    }
}
