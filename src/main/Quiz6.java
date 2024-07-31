package main;

import java.io.FileWriter;
import java.io.IOException;

public class Quiz6 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("quiz6.txt");
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println("test");
				String txt = i + "*" + j + "=" + i * j + '\n';
				fw.write(txt);
				fw.flush();
			}
		}

//		FileInputStream    : 입력 / byte(Stream은 byte)
//		FileOutputStream : 출력 / byte
//		FileReader              : 입력 / 문자
//		FileOutputWriter  : 출력 / 문자
		
	}

}
