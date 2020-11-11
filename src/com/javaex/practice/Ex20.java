package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int f00 = sc.nextInt();
		int five_h = 500*f00;
		
		System.out.print("100원 개수: ");
		int o00 = sc.nextInt();
		int one_h = 100*o00;
		
		System.out.print("50원 개수: ");
		int f0 = sc.nextInt();
		int five_o = 50*f0;
		
		System.out.print("10원 개수: ");
		int o0 = sc.nextInt();
		int one_o = 10*o0;
		
		int all = five_h+ one_h+five_o+one_o;
		System.out.println("동전의 총합은 "+all+"원 입니다.");
		
		
		sc.close();
		
	}
}
