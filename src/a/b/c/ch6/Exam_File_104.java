//package ����
package a.b.c.ch6;

//import ����
import java.io.File;
import java.io.FileWriter;

import a.b.c.common.DateUtil;

//class ����
public class Exam_File_104 {
	
	//main() ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//�������� ����
			File f3 = new File("test/aa/bb/cccc");
			//public boolean mkdirs()
			f3.mkdirs();
			System.out.println("f3 >>> : " + f3);
			
			File f4 = new File(f3, DateUtil.yyyymmdd() + "_" + f3.getName() + ".txt");
			//public boolean createNewFile() throws IOException
			f4.createNewFile();
			//public class File
			//public String getPath()
			//Returns: The string form of this abstract pathname
			String getPath1 = f4.getPath();
			System.out.println("getPath1 >>> : " + getPath1);
			
			if(f4.exists()) {
				java.io.FileWriter fw = null;
				fw = new java.io.FileWriter(f4);
				fw.write("mkdirs :: ���� ������ �Ẹ���� ~~~ !!");
				fw.close();
			}
			
		}catch(Exception e) {
			System.out.println("e >>> : " + e.getMessage());
		}//end of try catch
	}//end of main()

}//end of Exam_File_104
