package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long light_m_speed = 300000*60;
		long light_h_speed = light_m_speed * 60;
		long light_d_speed = light_h_speed*24;
		long light_y_speed = light_d_speed*365; 
		
		System.out.println("빛이 1년 동안 가는 거리는 " +light_y_speed+ "km 입니다.");
		
		sc.close();
	}
}
