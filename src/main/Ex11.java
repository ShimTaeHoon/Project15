package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) throws IOException {

		// 기반스트림을 사용해서 파일 복사하기
		
		// 시간 측정
		long start = 0;
		long end = 0;
		
		// 입력 스트림 생성
		FileInputStream fis = new FileInputStream("a.txt");
		
		// 출력 스트림 생성
		FileOutputStream fos = new FileOutputStream("copy.txt");
		
		// 한문자씩 읽어서 복사하는 중
		while (true) {
			int i = fis.read(); // 입력스트림으로 읽기
			if(i == -1) {
				break;
			}
			
			fos.write(i); // 출력스트림으로 내보내기
			
		}
		
		// 복사가 끝나는 시간 저장
		end = System.currentTimeMillis();
		                                                // ,뒤의 변수값이 %d에 치환이 됨
		                                               // %d 숫자                    // , 찍어주고..변수
		System.out.println(String.format("파일 복사하는 데 %d milliseconds 소요되었습니다.", (end - start)));

	}

}
