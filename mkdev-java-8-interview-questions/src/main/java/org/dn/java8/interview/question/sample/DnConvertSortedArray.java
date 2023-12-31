package org.dn.java8.interview.question.sample;

import java.util.Arrays;

/***
 * @author Muthukumar Thangavinayagam.
 * Created on 07-07-2023
 * Write a Java 8 program to sort an array and then convert the sorted array into Stream?
 ***/

public class DnConvertSortedArray {
    public static void main(String[] args) {
        int arr[] = { 99, 55, 203, 99, 4, 91 };
        Arrays.parallelSort(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }
}
