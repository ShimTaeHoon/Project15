package main;

import java.io.File;

public class Quiz8 {

	public static void main(String[] args) {

		File dir = new File("C:\\Users\\G201\\Downloads");
		
		File[] files = dir.listFiles();
		
		for(File f : files) {
			System.out.println(f.toString());
		}
		
	}

}
