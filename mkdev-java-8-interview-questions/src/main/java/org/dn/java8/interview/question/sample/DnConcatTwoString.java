package org.dn.java8.interview.question.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/***
 * @author Muthukumar Thangavinayagam.
 * Created on 07-07-2023
 * Write a Java 8 program to concatenate two Streams?
 ***/

public class DnConcatTwoString {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");

        Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());
        concatStream.forEach(str -> System.out.print(str + " "));
    }

}
