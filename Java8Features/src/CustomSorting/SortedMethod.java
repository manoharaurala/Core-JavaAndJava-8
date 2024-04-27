package CustomSorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedMethod {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
        numbers.stream()
                .sorted()
                .forEach(System.out::println);
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        words.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);



    }
}
