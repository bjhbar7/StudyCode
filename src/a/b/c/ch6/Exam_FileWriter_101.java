package a.b.c.ch6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import a.b.c.common.FilePath_101;

public class Exam_FileWriter_101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� �н� ����Ŭ�������� �ҷ�����
		String filePath = FilePath_101.FILE_PATH_CH6;
		
		//���� �н� �� ����� ���� ������ �ʱ�ȭ
		String inFile = filePath + "/" + "Exam_FileWriter_101.java";
		String outFile = filePath + "/" + "Exam_FileWriter_101.bak";
		
		//�������� ����Ʈ ������ �ʱ�ȭ
		FileReader fr = null;
		FileWriter fw = null;
		File f = null;
		int data = 0;
		boolean bFile = false;
		
		try {
			//public File(String pathname)
			f = new File(inFile);
			
			//������ �ִ��� ���� üũ �ϴ� boolean
			//public boolean exists()
			bFile = f.exists();
			System.out.println("bFile >>> : " + bFile);
			
			//������ ���� ���� ���� �Ѵ�.
			if(bFile) {
				
				// ������ �б� ���ؼ� 
				//public class FileReader
				fr = new FileReader(f);
				System.out.println("fr >>> : " + fr);
				
				// ������ ���� ���ؼ�
				//public class FileWriter
				fw = new FileWriter(outFile, true);
				System.out.println("fw >>> : " + fw);
				
				//������ �о ���Ͽ� ����
				//public int read() throws IOException
				while((data = fr.read()) != -1) {
					System.out.print((char)data);
					fw.write(data);
				}
				
				// io �� ���� ���� ���� ������ �ݴ�� �ݴ´�.
				// ���������� ������ �Ǿ��� �� ����Ǵ� ��ƾ
				//public void close() throws IOException
				fw.close();
				fr.close();
			}else {
				System.out.println("������ �����ϴ� >>> : ");
			}
		} catch (Exception e) {
			//public class Throwable
			//public String getMessage()
			//Returns the detail message string of this throwable.
			System.out.println("������ >>> : " + e.getMessage());
		}finally {
			
			if(fw != null) {
				try {fw.close(); fw=null;}catch(Exception e) {}
			}
			if(fr != null) {
				try {fr.close(); fr=null;}catch(Exception e) {}
			}
		}
	}

}