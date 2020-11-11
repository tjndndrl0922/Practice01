package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		int i = 10;
		int n = i++ %2; // 10 % 2 = 5....0 n = 0
		
		System.out.println(i); //i = 11
		System.out.println(n); //n = 0
		
	}
}
