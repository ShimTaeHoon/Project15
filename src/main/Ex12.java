package main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex12 {

	public static void main(String[] args) throws IOException {

		// 보조 스트림을 사용해서 파일 복사하기
		
		// 시간 측정
		long start = 0;
		long end = 0;
		
		// 입출력 기반 스트림 생성  // 1바이트로..
		FileInputStream fis = new FileInputStream("a.txt");
		FileOutputStream fos = new FileOutputStream("copy2.txt");
		
		// 버퍼 보조스트림 생성  // 8킬로바이트만큼의 배열에 내용을 왕창 담아서 한번에 가지고 감
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		// 복사 시간 측정하기
		start = System.currentTimeMillis();

		while (true) {
			int i = bis.read();
			if(i == -1) {
				break;
			}
			bos.write(i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.println(String.format("파일 복사하는 데 %d milliseconds 소요되었습니다.", (end - start)));
		
		// 1722390008341 milliseconds
		// 38 milliseconds
		
	}

}
