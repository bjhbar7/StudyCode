package a.b.c.ch6;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Exam_IOTest_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		����, ���丮 ������ 
		������ \  
		��Ŭ���� \\
		���н�, ������ /  
		*/
		// ���� ��� :  ������ �ִ� ��ġ���� �� ���丮�� ��Ʈ ���� �о���� ��� 
		String filePath = "C:\\00.KOSMO108\\10.JExam\\eclipse_java_work\\firstProject\\src\\a\\b\\c\\ch6";
		filePath = filePath.replace('\\', '/');
				
		try {
			FileInputStream fis = new FileInputStream(filePath + "/" + "Exam_IOTest_3.java");
			System.out.println("fis >>> : " + fis);
			
			FileOutputStream fos = new FileOutputStream(filePath + "/" + "Exam_IOTest_3.txt");
			System.out.println("fos >>> : " + fos);
			
			// public int read() throws IOException
			int data = 0;
			while((data = fis.read()) !=-1) {
				System.out.print((char)data);
				fos.write(data);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("������ >>> : " + e.getMessage());
		}
	}
}
