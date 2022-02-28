package a.b.c.ch6;

import java.io.FileInputStream;

public class Exam_IOTest_102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "C:\\Users\\user\\eclipse-workspace\\studyCode\\src\\a\\b\\c\\ch6";
		String file = "Exam_IOTest_102.java";
		try {
			FileInputStream fis = new FileInputStream(filePath + "\\" + file);
			System.out.println("fis >>> : " + fis);
			
			int data = fis.read();
			System.out.println("data >>> : " + data);
			System.out.println("(byte)data >>> : " + (byte)data);
			System.out.println("(char)data >>> : " + (char)data);
			
			while((data = fis.read()) != -1) {
				System.out.println(data + " : " + (char)data);
			}
		} catch (Exception e) {
			System.out.println("¿¡·¯°¡ >>> : " + e.getMessage());
		}
		
	}

}
