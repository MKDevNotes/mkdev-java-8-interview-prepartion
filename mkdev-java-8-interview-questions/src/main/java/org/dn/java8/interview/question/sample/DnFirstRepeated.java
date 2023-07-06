package org.dn.java8.interview.question.sample;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/***
 * @author Muthukumar Thangavinayagam.
 * Created on 06-07-2023
 ***/

public class DnFirstRepeated {
    public static void main(String[] args) {
        String stringObj = "Success will not be achieved without hard work and struggle";
      //  String stringObj = "Stress";
        Character result =  stringObj.chars()           // Stream of String
                .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))  // convert to lowercase & then to Character object Stream
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // store in a LinkedHashMap with the count
                .entrySet()
                .stream()                       // EntrySet stream
                .filter(entry -> entry.getValue() > 1L)   // extracts characters with a count greater than  1
                .map(entry -> entry.getKey())              // get the keys of EntrySet
                .findFirst().get();

            System.out.println(" Result "+result);
    }
}
