package main;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// true를 주어 무한루프
		while(true) {
			System.out.println("문자를 입력하세요:");
			String str = scanner.nextLine();
			
			// 대소문자 상관없이 비교
			if(str.equalsIgnoreCase("STOP")) {
				break; //stop이 입력됐으면 빠져나가기
			}
			
			// 대문자로 변경한 다음에 비교
//			str.toUpperCase().equals("STOP");
			
			// 소문자로 변경한 다음에 비교
//			str.toLowerCase().equals("stop");
		}

	}

}
