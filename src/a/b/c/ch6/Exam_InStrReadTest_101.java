//package 선언
package a.b.c.ch6;

//import 선언
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import a.b.c.common.FilePath;

//class 선언
public class Exam_InStrReadTest_101 {

	//상수 선언
	//맴버 변수 선언
	//생성자 선언
	//함수 선언
	
	//main() 선언
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//지역 변수 선언
		//String : java.lang.String class : 문자열 참조변수를 갖는다.
		String filePath = FilePath.FILE_PATH_CH6;
		System.out.println("Exam_InStrReadTest_101.main() filePath >>> : " + filePath);
		
		String inFile = filePath + "/" + "Exam_InStrReadTest_101.java";
		System.out.println("Exam_InStrReadTest_101.main() inFile >>> : " + inFile);
		
		//public class File
		File ff = null;
		//public class FileInputStream
		FileInputStream fis = null;
		//public class InputStreamReader
		InputStreamReader isr = null;
		
		//public class BufferedReader
		BufferedReader br = null;
		
		int data = 0;
		boolean bFile = false;
		
		try {
			ff = new File(inFile);
			//public boolean exists()
			//Tests whether the file or directory denoted by this abstract pathname exists.
			bFile = ff.exists();
			
			if (bFile) {
				fis = new FileInputStream(ff);
				isr = new InputStreamReader(fis);
				
				//public class BufferedReader
				br = new BufferedReader(isr);
				
				//public int read() throws IOException
				/*
				The character read, as an integer in the range 0 to 65535 (0x00-0xffff), 
				or -1 if the end of the stream has been reached
				*/
				while ((data=br.read()) != -1) {
					System.out.print((char)data);
				}//end of while
			}else {
				System.out.println("해당 경로에 파일이 존재하지 않습니다.");
			}//end of if else
			//public void close() throws IOException
			br.close(); br=null;
			isr.close(); isr=null;
			fis.close(); fis=null;
		}
		catch (Exception e) {
			System.out.println("e >>> : " + e.getMessage());
		}finally {
			if (br != null) {
				try {br.close(); br=null;}catch (Exception e) {}
			}
			if (isr != null) {
				try {isr.close(); isr=null;}catch (Exception e) {}
			}
			if (fis != null) {
				try {fis.close(); fis=null;}catch (Exception e) {}
			}// end of if
		}// end of try catch finally
	}//end of main()
}//end of Exam_InStrReadTest_101
