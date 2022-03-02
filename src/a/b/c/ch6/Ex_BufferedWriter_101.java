package a.b.c.ch6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import a.b.c.common.FilePath;

public class Ex_BufferedWriter_101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� �н� ����Ŭ�������� Ǯ������
		String filePath = FilePath.FILE_PATH_CH6;
		
		//���� �н� �� ����� ���� ����� �ʱ�ȭ
		String inFile = filePath + "/" + "Ex_BufferedWriter_101.java";
		String outFile = filePath + "/" + "Ex_BufferedWriter_101.bak";
		
		BufferedReader inbuf = null;
		BufferedWriter outbuf = null;
		FileReader fr = null;
		FileWriter fw = null;
		File f = null;
		int data = 0;
		
		try {
			
			f = new File(inFile);
			
			// ������ �ִ��� ���� üũ�ϴ� boolean
			boolean bFile = f.exists();
			System.out.println("bFile >>> : " + bFile);
			
			//������ ���� ���� �����Ѵ�.
			if(bFile) {
				
				//������ �б� ���ؼ�
				fr = new FileReader(f);
				inbuf = new BufferedReader(fr);
				
				//������ ���� ���ؼ�
				fw = new FileWriter(outFile, true);
				outbuf = new BufferedWriter(fw);
				
				//������ �о ���Ͽ� ����
				while ((data = inbuf.read()) != -1) {
					System.out.print((char)data);
					outbuf.write(data);
				}
				outbuf.flush();
				
				outbuf.close(); outbuf=null;
				inbuf.close(); inbuf=null;
				
				fw.close(); fw=null;
				fr.close(); fr=null;
				
			} else {
				System.out.println("����Ϸ��� �ش� ������(������)�� �����ϴ�.");
			}
			
		}catch (Exception e) {
			System.out.println("������ e.getMessage() >>> : " + e.getMessage());
		}finally {
			if (inbuf != null) {
				try {inbuf.close(); inbuf=null;}catch(Exception e) {}
			}
			if (outbuf != null) {
				try {outbuf.close(); outbuf=null;}catch(Exception e) {}
			}
			if (fr != null) {
				try {fr.close(); fr=null;}catch(Exception e) {}
			}
			if (fw != null) {
				try {fw.close(); fw=null;}catch(Exception e) {}
			}
		}
	}

}
