package main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Quiz7 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("quiz7.txt");
		OutputStreamWriter bos = new OutputStreamWriter(fos);
		
		bos.write("프로그래밍");
		bos.flush();
		
	}

}
