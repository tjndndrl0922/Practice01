package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int x =1;
		int y =1;
		
		int a = ++x *2; // a는 x를 먼저 올린 후에 *2를 해야하니 a = 4 
		int b = y++ *2; // b는 1*2를 먼저 한후 뒤의 생기는 변수에 +1을 해야하니 b = 2
		
		System.out.println("a=" +a); //4
		System.out.println("b=" +b); //2
		System.out.println("x=" +x); //2
		System.out.println("y=" +y); //2
		
		
		
		
	}
}
