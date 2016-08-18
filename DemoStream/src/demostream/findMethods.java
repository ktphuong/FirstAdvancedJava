/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostream;

import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author hv
 */
public class findMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stream<Student> sts = Stream.of(new Student(100, "John"), new Student(100, "Jane"),
                new Student(99, "Deb"), new Student(100, "Susan"),
                new Student(98, "Baley"), new Student(100, "Chilly"));
        Optional<Student> type100 = sts.filter((Student a) -> 100 == a.type).findAny();
        System.out.println(type100.get().name); // John

        Stream<Student> sts1 = Stream.of(new Student(100, "John"), new Student(100, "Jane"),
                new Student(99, "Deb"), new Student(100, "Susan"),
                new Student(98, "Baley"), new Student(100, "Chilly"));
        boolean b = sts1.anyMatch(e -> "Susan".equalsIgnoreCase(e.name));
        if (b) {
            System.out.println("There is an student with name 'Susan'");
        }

        List<Integer> ints = Arrays.asList(1, 6, 22, 21, 35, 36);
        Optional<Integer> result = ints.stream().filter(i -> i % 7 == 0).findFirst();
        System.out.println(result.get()); // 21

        Stream<Student> sts2 = Stream.of(new Student(100, "John"), new Student(100, "Jane"),
                new Student(99, "Jeb"), new Student(100, "Jusan"),
                new Student(98, "Jaley"), new Student(100, "Jilly"));
        boolean b1 = sts2.allMatch(e -> e.name.startsWith("J"));
        if (b1) {
            System.out.println("All students have name start with 'J'");
        }
        Stream<Student> sts3 = Stream.of(new Student(100, "John"), new Student(100, "Jane"),
                new Student(99, "Jeb"), new Student(100, "Jusan"),
                new Student(98, "Jaley"), new Student(100, "Jilly"));
        boolean b2 = sts3.noneMatch(e -> e.name.equals("Jenny"));
        if (b2) {
            System.out.println("Jenny is not member in this class");
        }

        List<Integer> together = Stream.of(asList(1, 2), asList(3, 4)) // Stream of List<Integer>
                .flatMap(numbers -> numbers.stream())
                .map(integer -> integer + 1)
                .collect(Collectors.toList());
        together.forEach(System.out::print);

        List<String> names1 = Arrays.asList("Dzmitry", "John");
        List<String> names2 = Arrays.asList("David", "Laura");
        Stream<List<String>> s = Stream.of(names1, names2);
        s.flatMap(names -> names.stream()).forEach(System.out::println);

        System.out.println("forEach Demo");
        Stream.of("AAA", "BBB", "CCC").forEach(s1 -> System.out.println("Output:" + s1));
        System.out.println("forEachOrdered Demo");
        Stream.of("CCC", "BBB", "AAA").forEachOrdered(s1 -> System.out.println("Output:" + s1));

        Integer value1 = null;
        Integer value2 = 10;

        //Optional.ofNullable - allows passed parameter to be null.
        Optional<Integer> a3 = Optional.ofNullable(value1);

        //Optional.of - throws NullPointerException if passed parameter is null
        Optional<Integer> b3 = Optional.of(value2);
        System.out.println(sum(a3, b3));

        Optional<String> empty = Optional.empty();
        System.out.println(empty); // Optional.empty

        Optional<String> str = Optional.of("phuong");
        System.out.println(str); // Optional[phuong]

        String nullableString = "";
        Optional<String> str2 = Optional.of(nullableString);
        System.out.println(str2);// Optional[]

        if (str.isPresent()) {
            String value = str.get();
            System.out.println("Optional contains " + value);
        } else {
            System.out.println("Optional is  empty.");
        }
        
        str.ifPresent(value -> System.out.println("Optional contains " + value));

    }

    public static Integer sum(Optional<Integer> a, Optional<Integer> b) {

        //Optional.isPresent - checks the value is present or not
        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        //Optional.orElse - returns the value if present otherwise returns
        //the default value passed.
        Integer value1 = a.orElse(new Integer(0));

        //Optional.get - gets the value, value should be present
        Integer value2 = b.get();
        return value1 + value2;

    }

}
