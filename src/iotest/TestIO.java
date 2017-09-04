package iotest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

public class TestIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path ="d:\\def.txt";
		String content ="hfdkjhf很多附加收费";
		writerIO(path,content);
		readerIO(path);
		
	}
	
	public static void writerIO(String path,String content) throws IOException{
		File file = new File(path);
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		byte[]buffer = content.getBytes("utf-8");
//		int len = 0;
//		while((len = ))
		fileOutputStream.write(buffer);
		fileOutputStream.close();
		
	}
	
	public static void readerIO(String path) throws IOException{
		FileInputStream fileInputStream = new FileInputStream(path);
		int len = 0;
		byte []buffer = new byte[1024];
		
		while((len=fileInputStream.read(buffer))!=-1){
			System.out.println(new String(buffer,0,len,"utf-8"));
			
		}
		fileInputStream.close();
	}

	
	
	
	
	
}
