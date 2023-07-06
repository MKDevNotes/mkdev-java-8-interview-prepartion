package org.dn.java8.interview.question.sample;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/***
 * @author Muthukumar Thangavinayagam.
 * Created on 06-07-2023
 ***/

public class DnContainDuplicateElement {

    public static void main(String[] args) {

        // List<Integer> integerList = Arrays.asList(1,22,11,41,5,22,50,5,23,50,4,5);

      //  Integer[] intArray = integerList.stream().toArray(Integer[]::new);

        List<Integer> numbers = Arrays.asList(new Integer[]{1,2,3,41,5,22,50,5,23,50,4,5});
        //List<Integer> numbers = Arrays.asList(new Integer[]{1,2,3,41,53,22,50,5,23,580,4,55});

        numbers.stream().filter(i -> Collections.frequency(numbers, i) >1)
                .collect(Collectors.toSet()).forEach(System.out::println);

        Set<Integer> setValue =  numbers.stream().filter(i -> Collections.frequency(numbers, i) >1)
                .collect(Collectors.toSet());

        Optional<Integer> optionalValue =  numbers.stream().filter(i -> Collections.frequency(numbers, i) >1).findFirst();

        System.out.println("Is Arrays contain duplicate value : "+optionalValue.isPresent());
    }

}
