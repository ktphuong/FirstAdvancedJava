/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 *
 * @author hv
 */
public class DemoStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            myList.add(i);
        }
        //sequential stream
        Stream<Integer> sequentialStream = myList.stream();
        //parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Limit stream:");
        stream.limit(4).forEach(System.out::print);
        System.out.println("finish");
        Stream<Integer> stream1 = Stream.of(new Integer[]{3, 2, 3, 4});
        stream1.sorted().forEach(System.out::print);

        Stream<String> stream3 = Stream.generate(() -> {
            return "abc";
        });

        LongStream is = Arrays.stream(new long[]{1, 2, 3, 4});
        IntStream is2 = "abc".chars();

        Random random = new Random();
        random.ints(0, 10).limit(10).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//get list of unique squares
        Stream<Integer> streamSquare = numbers.stream();

        streamSquare.map(i -> i * i).distinct().forEach(System.out::println);
// loc cac phan tu co "ab"
        List<String> lststrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        int count = (int) lststrings.stream().filter(string -> string.contains("ab")).count();
        System.out.println("Count = " + count);

        //    http://www.tutorialspoint.com/java8/java8_streams.htm
        List<String> strings1 = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered1 = strings1.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered1);

        String mergedString = strings1.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);

        List<Integer> numbers1 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = numbers1.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());

        int sum = Stream.of(1, 2, 3, 4, 5)
                .peek(e -> System.out.println("Taking integer: " + e))
                .filter(n -> n % 2 == 1)
                .peek(e -> System.out.println("Filtered integer: " + e))
                .map(n -> n * n).peek(e -> System.out.println("Mapped integer: " + e))
                .reduce(0, Integer::sum);
        System.out.println("Sum = " + sum);

    }

}
