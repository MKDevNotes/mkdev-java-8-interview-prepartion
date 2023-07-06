package org.dn.java8.interview.question.sample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/***
 * @author Muthukumar Thangavinayagam.
 * Created on 06-07-2023
 ***/

public class DnDuplicateElements {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,22,1,41,5,22,50,5,23,50,4,5);
        Set<Integer> setObj = new HashSet<Integer>();
        integerList.stream()
                .filter(n -> !setObj.add(n))
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }

}
