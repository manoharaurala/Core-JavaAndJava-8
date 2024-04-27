public class SingletonDesignPatternBillPlugh {


    private SingletonDesignPatternBillPlugh(){

    }

    private static class BillPughSingleton{

        private static final SingletonDesignPatternBillPlugh sdp=new SingletonDesignPatternBillPlugh();

    }

    public static SingletonDesignPatternBillPlugh getInstance(){

        return  BillPughSingleton.sdp;

    }

}
