package main;

import java.io.IOException;

public class Ex1 {

	public static void main(String[] args) {

		    // out: 표준 출력(출력대상: 모니터) 클래스
		System.out.println("안녕하세요");
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");

		
		try {
			// in: 표준 입력 스트림(대상: 키보드)
			// 문자가아니고 바이트 단위로 입력 받음
			// 문자를 숫자로 변환해서 받는다!(문자형태 그대로 받을 수 없음)
			int i = System.in.read();
			System.out.println(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
