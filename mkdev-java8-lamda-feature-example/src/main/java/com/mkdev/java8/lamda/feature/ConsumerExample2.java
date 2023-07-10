package com.mkdev.java8.lamda.feature;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

	public static void main(String[] args) {
		Consumer<Integer> con1 = a -> System.out.println(a);
		con1.accept(14);
		
		  // Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer> > modify = list ->
        {
            
        	for (int i = 0; i < list.size(); i++) {
				list.set(i, 2 * list.get(i));
			}
            
        };

        Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
        
        List<Integer> list = Arrays.asList(2,5,6);
        
        modify.accept(list);
        
        dispList.accept(list);
	
	}
	
}
