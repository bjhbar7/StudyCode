//package ����
package a.b.c.ch6;

//import ����
import java.io.File;
import java.io.FileInputStream;

import a.b.c.common.FilePath_101;

//class ����
public class Exam_FileInputStream_101 {
	//��� ����
	//�ɹ� ���� ����
	//������ ����
	//�Լ� ����
	
	//main() ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�������� �ʱ�ȭ : ����Ʈ��
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
				
				//�������� �ʱ�ȭ : ����Ʈ��
				int data = 0;
				while((data = fis.read()) != -1) {
					System.out.print((char)data);
				}//end of while
				
				//public void close() throws IOException
				fis.close();
			}else {
				System.out.println("������ �����ϴ�. >>> : ");
			}//end of if else
		} catch (Exception e) {
			System.out.println("������ >>> : " + e.getMessage());
		}finally {
			
			if (fis != null) {
				try {
					//public void close() throws IOException
					//��ü �ݱ�, ����� ���� ��ü null �ʱ�ȭ
					fis.close(); fis=null;
				}catch(Exception e) {}
			}//end of if
		}
	}//end of main()

}//end of Exam_FileInputStream_101
