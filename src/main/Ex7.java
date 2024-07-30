package main;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex7 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("output2.txt");
		
		// 아스키코드 값으로 변경되서 나옴 A,B,C
		byte[] arr = { 65, 66 , 67 };
		
		// 배열의 모든 데이터 출력
		fos.write(arr);

	}

}
