import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<Integer> isOdd = x -> x % 2 != 0;

        Consumer<Integer> printNumber = System.out::println;


        Function<String, Integer> parseInteger = x -> Integer.parseInt(x);


        Supplier<Integer> supplyNumber = () -> parseInteger.apply("1");


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        long count = numbers.stream().filter(isEven).count();
        System.out.println(count);


        String[] stringArray = {"a", "b", "c", "d", "e", "f", "g"};

        Stream<String> stream1 = Arrays.stream(stringArray);
        Stream<String> stringArray1 = Stream.of(stringArray);


        Stream<Integer> numbers1=Stream.generate(supplyNumber).limit(100);
        System.out.println(numbers1.count());

        //Intermediate Operations
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        // Create a set to hold intermediate results
        Set<String> intermediateResults = new HashSet<>();

        // Stream pipeline demonstrating various intermediate operations
        List<String> result = listOfLists.stream()
                .flatMap(List::stream)
                .filter(s -> s.startsWith("S"))
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .peek(s -> intermediateResults.add(s))
                .collect(Collectors.toList());

        // Print the intermediate results
        System.out.println("Intermediate Results:");
        intermediateResults.forEach(System.out::println);

        // Print the final result
        System.out.println("Final Result:");
        result.forEach(System.out::println);


        String word="hello world";

        count=word.chars().filter(x-> x=='l').count();
        System.out.println(count);

    }
}