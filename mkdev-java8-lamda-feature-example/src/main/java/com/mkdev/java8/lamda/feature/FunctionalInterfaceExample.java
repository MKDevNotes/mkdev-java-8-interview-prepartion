package com.mkdev.java8.lamda.feature;

/**
 * @author Muthukumar Thangavinayagam
 * Created on Date 10-07-2023
 */
@FunctionalInterface
public interface FunctionalInterfaceExample {
	public void add();
//	public void add1(); if remove @@FunctionalInterface it became normal interface.
	
	default String sayHai() {
		return "Hello ";
	}
	
	static boolean isTrue() {
		return true;
	}
}
