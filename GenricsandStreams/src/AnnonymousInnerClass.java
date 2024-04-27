public class AnnonymousInnerClass {
    public static void main(String[] args) {

        CustomInterface t1=new CustomInterface<Integer>() {
            @Override
            public Integer add(Integer a, Integer b) {
                return (a+b);
            }
        };

        Object ans=  t1.add(5,3);
        Integer ans1=(Integer)ans;


        System.out.println(ans1.intValue());

    }
}
