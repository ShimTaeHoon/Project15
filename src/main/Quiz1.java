package main;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		int[] jung = new int[5];
		int sum = 0;
		int total = 0;
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			sum = scanner.nextInt();
			total = total + sum;
			
		}
		
		System.out.println("숫자 5개의 합은 :" + total + "입니다");
		
	}

}
