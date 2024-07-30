package main;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) throws IOException {

		// 입력 스트림 생성
		FileInputStream fis = new FileInputStream("input.txt");
		
		while(true) {
			int i = fis.read();
			// 파일의 끝에 도달하면 -1
			if(i == -1) {
				break;
			}
			System.out.println((char)i);
		}

	}

}
