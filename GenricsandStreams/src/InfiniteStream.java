import java.util.stream.Stream;

public class InfiniteStream {
    public static void main(String[] args) {
        System.out.println(Stream.iterate(100,e->e+1));
    }
}
