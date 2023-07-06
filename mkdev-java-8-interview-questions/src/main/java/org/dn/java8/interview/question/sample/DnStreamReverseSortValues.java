package org.dn.java8.interview.question.sample;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/***
 * @author Muthukumar Thangavinayagam.
 * Created on 06-07-2023
 ***/

public class DnStreamReverseSortValues {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(22,1,41,5,22,50,5,23,50,4,5);

        integerList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
