package org.dn.java8.interview.question.sample;

import java.util.Arrays;
import java.util.List;

/***
 * @author Muthukumar Thangavinayagam.
 * Created on 06-07-2023
 * Given a list of integers, find the total number of elements present in the list using Stream functions?
 ***/

public class DnFindTheTotalNumberOfElements {
    public static void main(String[] args) {
        List<Integer> integersList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,15,16,19,20,22,24,40,41,44,60,61,62,63,84,91,93,94,99);
        System.out.println("Count "+integersList.stream().count());
    }
}
