package a.b.c.ch6;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam_IOTest_103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "C:\\Users\\user\\eclipse-workspace\\studyCode\\src\\a\\b\\c\\ch6";
		filePath = filePath.replace('\\', '/');
		
		try {
			FileInputStream fis = new FileInputStream(filePath + "/" + "Exam_IOTest_103.java");
			System.out.println("fis >>> : " + fis);
			
			FileOutputStream fos = new FileOutputStream(filePath + "/" + "Exam_IOTest_103.txt");
			System.out.println("fos >>> : " + fos);
			
			int data = 0;
			while ((data = fis.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {
			//e.printStackTrace(); : 길어져서 사용 안 한다.
			System.out.println("에러가 >>> : " + e.getMessage());
		}
	}

}
