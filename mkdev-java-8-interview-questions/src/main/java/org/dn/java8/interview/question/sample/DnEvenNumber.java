package org.dn.java8.interview.question.sample;


import java.util.Arrays;
import java.util.List;

/***
 * @author Muthukumar Thangavinayagam.
 * Created on 06-07-2023
 * Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
 ***/

public class DnEvenNumber {
    public static void main(String[] args) {
        List<Integer> integersList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,15,16,19,20,22,24,40,41,44,60,61,62,63,84,91,93,94,99);

        integersList.stream()
                .filter(n -> n%2 ==0)
                .forEach(System.out::println);
    }
}
