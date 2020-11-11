package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨: " );
		double Fahrenheit = sc.nextDouble();
		System.out.println("화씨 "+Fahrenheit+"의 섭씨온도는 " +(double)5/9*(Fahrenheit-32)+"입니다." );
		
		System.out.print("화씨: " );
		double Fahrenheit1 = sc.nextDouble();
		System.out.println("화씨 "+Fahrenheit1+"의 섭씨온도는 " +(double)5/9*(Fahrenheit1-32)+"입니다." );
		
		
		
		
		
		sc.close();
	}
	
	
	
}
