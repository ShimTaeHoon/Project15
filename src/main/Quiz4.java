package main;

import java.io.FileOutputStream;
import java.io.IOException;

public class Quiz4 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("quiz4.txt");
		
		// fos.write('A'); //65
		// ...
		// fos.write('Z'); //90
		
		byte[] arr = {26};
		
		// 초기값: 문자 'A'의 아스키 값
		for(int i=65; i < 90; i++) {
			fos.write(i); // A-Z 출력
		}
		
	}

}
