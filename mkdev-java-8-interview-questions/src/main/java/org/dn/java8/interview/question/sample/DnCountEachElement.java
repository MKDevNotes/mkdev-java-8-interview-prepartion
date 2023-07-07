package org.dn.java8.interview.question.sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/***
 * @author Muthukumar Thangavinayagam.
 * Created on 07-07-2023
 ***/

public class DnCountEachElement {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

        Map<String,Long> namesCount =  names.stream().collect(Collectors.groupingBy(
                Function.identity() , Collectors.counting()
                ));

        System.out.println(namesCount);

    }
}
