package main;

import java.io.File;

public class Quiz9 {

	public static void main(String[] args) {

		bojoStream.fileload();

	}

}

class bojoStream {

	public static void fileload() {

		File dir = new File("C:\\Users\\G201\\Downloads");

		File[] files = dir.listFiles();

		for (File f : files) {
			System.out.println(f.toString());

		}
	}

}
