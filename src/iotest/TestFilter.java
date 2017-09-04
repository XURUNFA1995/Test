package iotest;

import java.io.File;
import java.io.FilenameFilter;

public class TestFilter implements FilenameFilter{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "d:\\";
		File file = new File(path);
		if(file.isDirectory()){
			File[] listfile = file.listFiles();
			for (File file2 : listfile) {
				System.out.println("目录中的文件"+file2);
			}

			File[] listfilter = file.listFiles(new TestFilter());
			
			for (File file2 : listfilter) {
				System.out.println("过滤后"+file2);
			}
		}			
		
		
		
	}

	@Override
	public boolean accept(File dir, String filename) {
		File file = new File(dir,filename);
		
		return (isText(filename));
	}

	private boolean isText(String filename) {
		if(filename.toLowerCase().endsWith(".txt")){
			return true;
		}else{
			return false;
		}
//		return false;
	}

}
