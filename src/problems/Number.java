package problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Number {


    public static void main(String[] args) {
        int[] numbers={3,4,53,445,322,45};
        List<Integer> list=Arrays.asList(10,10,50,40,20,30,40,50,5,57);
        System.out.println("maximum number from the array is : "+ getMaximumNumber(numbers));

        System.out.println("=========================================");

        System.out.println("Numbers in Desc Order : {}");
        displayNumbersInDescendingOrder(list);

        System.out.println("=========================================");

        System.out.println("List before Duplicates");
        printList(list);
        System.out.println();
        System.out.println("List after removing Duplicates");
        printList( removeDuplicates(list));
        System.out.println("=========================================");


        System.out.println("Second Smallest number from a list is "+getSecondSmallestNumber(list));
        System.out.println("=========================================");
        int N=4;
        System.out.printf("find the %d highest number from a list : ",N);
        System.out.println(getNthHighestNumber(list,N));;
        System.out.println("=========================================");


        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers1.stream()
                .reduce(0,Integer::sum);
        System.out.println(sum);



    }

    private static int getNthHighestNumber(List<Integer> list, int N){
        return list.stream()
                .distinct()
                .sorted(Collections.reverseOrder())
                .skip(N-1)
                .findFirst().get();

    }


    private static int getSecondSmallestNumber(List<Integer> list){
        return list.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst().get();

    }

    private static void printList(List<Integer> list) {
        list.forEach(val -> System.out.print(val + " "));
    }

    private static List<Integer> removeDuplicates(List<Integer> list){
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }


    private static int getMaximumNumber(int[] numbers){
        return Arrays.stream(numbers).max().orElseThrow();
    }

    private static void displayNumbersInDescendingOrder(List<Integer> numbers){
        numbers.stream()
                .sorted((Integer val, Integer val1)-> val1-val)
                .forEach(System.out::println);
    }

}
