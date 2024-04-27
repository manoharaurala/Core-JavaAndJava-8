public class TestSingletonDesignPattern {
    public static void main(String[] args) {
        SingletonDesignPattern sdp1=SingletonDesignPattern.getInstance();
        SingletonDesignPattern sdp2=SingletonDesignPattern.getInstance();

        System.out.println("sdp1 hash code: "+sdp1.hashCode());
        System.out.println("sdp2 hash code: "+sdp1.hashCode());

        System.out.println("sdp1 equals sdp2: "+sdp1.equals(sdp2));

    }
}
