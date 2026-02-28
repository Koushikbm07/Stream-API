import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<Integer> isOdd = x -> x % 2 != 0;

        Consumer<Integer> printNumber = System.out::println;


        Function<String, Integer> parseInteger = x -> Integer.parseInt(x);


        Supplier<Integer>  supplyNumber=()-> parseInteger.apply("1");


    }
}