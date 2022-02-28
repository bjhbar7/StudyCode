//package 선언
package a.b.c.ch6;

//import 선언
import java.io.File;
import java.io.FileInputStream;

import a.b.c.common.FilePath_101;

//class 선언
public class Exam_FileInputStream_101 {
	//상수 선언
	//맴버 변수 선언
	//생성자 선언
	//함수 선언
	
	//main() 선언
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//지역변수 초기화 : 디폴트값
		FileInputStream fis = null;
		
		try {
			
			String filePath = FilePath_101.FILE_PATH_CH6;
			filePath = filePath + "/" + "Exam_FileInputStream_101.java";
			System.out.println("filePath >>> : " + filePath);
			//java.io.File
			//public class File
			File f = new File(filePath);
			
			//public boolean exists()
			//true if and only if the file or directory denoted by this abstract pathname exists; false otherwise
			boolean bFile = f.exists();
			System.out.println("bFile >>> : " + bFile);
			
			if(bFile) {
				//java.io.FileInputStream
				//public class FileInputStream
				//public FileInputStream(File file) throws FileNotFoundException
				fis = new FileInputStream(f);
				System.out.println("fis >>> : " + fis);
				
				//지역변수 초기화 : 디폴트값
				int data = 0;
				while((data = fis.read()) != -1) {
					System.out.print((char)data);
				}//end of while
				
				//public void close() throws IOException
				fis.close();
			}else {
				System.out.println("파일이 없습니다. >>> : ");
			}//end of if else
		} catch (Exception e) {
			System.out.println("에러가 >>> : " + e.getMessage());
		}finally {
			
			if (fis != null) {
				try {
					//public void close() throws IOException
					//객체 닫기, 사용을 다한 객체 null 초기화
					fis.close(); fis=null;
				}catch(Exception e) {}
			}//end of if
		}
	}//end of main()

}//end of Exam_FileInputStream_101
