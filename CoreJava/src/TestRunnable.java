public class TestRunnable Runnable{

    public static void main(String[] args) {
        Runnable run=new Runnable() {
            @Override
            public void run() {

            }
        };
    }



    Runnable run2=()->{

    };

    run2.run();

}
