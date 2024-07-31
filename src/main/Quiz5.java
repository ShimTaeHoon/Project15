package main;

import java.io.FileWriter;
import java.io.IOException;

public class Quiz5 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("quiz5.txt");
		
		byte[] arr = {10};
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				fw.write(i + " "); // 문자로 인식하기위해 " "을 추가해줌(안에 있는 인자가 String으로 변환)
				
			}
			
		}

		fw.flush();
		fw.close();
	}

}
