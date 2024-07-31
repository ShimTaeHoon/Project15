package main;

import java.io.File;
import java.io.IOException;

public class Ex13 {

	public static void main(String[] args) throws IOException {

		// File: 파일 정보를 담는 클래스(활용도가 제일 높음!)
		// 파일의 경로, 크기 등 정보를 확인하거나 파일을 생성할 수 있음
		
		// newfile.txt와 연결된 파일 클래스 생성
		File file = new File("C:\\shimtaehoon\\workspace\\newfile.txt");
		
		// 실제 새로운 파일 생성(디렉토리안에)
		file.createNewFile();
		
		// 파일 속성 보기
		// is로 시작되면 반환값이 boolean임
//		System.out.println(file.isFile()); // 파일인지?
//		System.out.println(file.isDirectory()); // 폴더인지?
//		System.out.println(file.getName()); // 파일이름
//		System.out.println(file.getAbsolutePath()); // 파일경로
//		System.out.println(file.getPath()); // 파일경로
//		System.out.println(file.canRead()); // 읽을수 있는지?
//		System.out.println(file.canWrite()); // 쓸수 있는지?
		
		// 파일 삭제
//		file.delete();
		
		// 디렉토리
		File dir = new File("C:\\shimtaehoon");
		
		System.out.println(dir.isDirectory()); // 폴더인지?
		
		// 폴더 밑에 있는 파일 목록
		File[] files = dir.listFiles();
		
		// 람다식과 toString을 통해 파일목록 가져옴
		for (File f : files) {
			System.out.println(f.toString());
		}

	}

}
