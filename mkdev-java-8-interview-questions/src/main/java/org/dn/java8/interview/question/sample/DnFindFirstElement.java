package org.dn.java8.interview.question.sample;

import java.util.Arrays;
import java.util.List;

/***
 * @author Muthukumar Thangavinayagam.
 * Created on 06-07-2023
 * Given the list of integers, find the first element of the list using Stream functions?
 ***/

public class DnFindFirstElement {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(22,1,41,5,22,50,5,23,50,4,5);

        integerList.stream().findFirst().ifPresent(System.out::println);
    }
}
