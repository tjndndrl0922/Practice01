package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("반지름: ");
		double r = sc.nextDouble();
		double pie = 3.14;
		double volume = (double)4/3;
		
		System.out.println("구의부피는:" +volume*pie*r*r*r+ " 입니다.");
		
		System.out.print("반지름: ");
		double r1 =sc.nextDouble();
				
		System.out.println("구의부피는:" +volume*pie*r1*r1*r1+ " 입니다.");		
		
		
		sc.close();
		
	}

}
