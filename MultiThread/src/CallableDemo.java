import java.util.concurrent.*;

public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "msg-1 from server1";
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CountDownLatch countDownLatch = new CountDownLatch(3);
        Future<String> stringFuture = executorService.submit(callable);

        System.out.println(stringFuture.get());

        System.out.println("Done");
    }
}
