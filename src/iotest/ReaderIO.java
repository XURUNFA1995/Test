package iotest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class ReaderIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path = "d:\\abc.txt";
		File file = new File(path);
		fileCopy(path);
	}
	
	public static void fileCopy(String path) throws IOException{
		
		FileReader filereader = new FileReader(path);
		FileWriter filewriter = new FileWriter("d:\\def.txt");
		
		int len = 0;
		while((len=filereader.read())!=-1){
			
			System.out.print((char)len+" ");
			filewriter.write(len);
		}
		filewriter.close();
		filereader.close();
		
		
		
	}

}
