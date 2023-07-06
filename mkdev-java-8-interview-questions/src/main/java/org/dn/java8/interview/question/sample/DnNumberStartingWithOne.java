package org.dn.java8.interview.question.sample;

import java.util.Arrays;
import java.util.List;

/***
 * @author Muthukumar Thangavinayagam.
 * Created on 06-07-2023
 ***/

public class DnNumberStartingWithOne {
    public static void main(String[] args) {
        List<Integer> integersList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,40,41,44,63,11,15,60,61,62,16,20,22,24,19,84,91,93,94,99);
        integersList.stream()
                .map(s -> s+"")
                .filter(s->s.startsWith("1"))
                .forEach(System.out::println);
    }
}
