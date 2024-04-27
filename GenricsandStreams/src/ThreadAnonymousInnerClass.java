public class ThreadAnonymousInnerClass {

    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In threda: "+Thread.currentThread().getId());
            }
        });
        t.start();
        System.out.println("In main thread+ "+Thread.currentThread().getId());
    }
}
