package org.dn.java8.interview.question.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/***
 * @author Muthukumar Thangavinayagam.
 * Created on 07-07-2023
 * How to use map to convert object into Uppercase in Java 8?
 ***/

public class DnConvertUpperCase {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("aaa", "bbb", "ccc","ddd" , "eee");
        list1.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
    }

}
