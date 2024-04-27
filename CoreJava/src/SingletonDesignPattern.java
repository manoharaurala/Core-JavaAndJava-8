public class SingletonDesignPattern {

    private static volatile SingletonDesignPattern sdp;
    int a=10;

    private SingletonDesignPattern(){

    }

    public static  SingletonDesignPattern getInstance(){

        if(sdp==null){

            synchronized(SingletonDesignPattern.class) {
                if(sdp==null) {
                    sdp = new SingletonDesignPattern();
                }
            }
        }
        // a=10;

        return sdp;
    }


   /* @Override
    public int hashCode() {
        return 12345;
    }

    @Override
    public boolean equals(Object obj) {
       return this==obj;
    }*/


}
