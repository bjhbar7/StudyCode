package a.b.c.aaa;

import java.io.File;
import java.io.FileInputStream;

import a.b.c.common.FilePath;

public class Exam_FileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		
		try {
			
			String filePath = FilePath.FILE_PATH_CH6;
			filePath = filePath + "/" + "Exam_FileInputStream.java";
			System.out.println("filePath >>> : " + filePath);
			
			File f = new File(filePath);
			
			boolean bFile = f.exists();
			System.out.println("bFile >>> : " + bFile);
			
			if(bFile) {
				fis = new FileInputStream(f);
				System.out.println("fis >>> : " + fis);
				
				int data = 0;
				while((data= fis.read()) != -1) {
					System.out.print((char)data);
				}
				
				fis.close();
			}else {
				System.out.println("파일이 없습니다. >>> : ");
			}
		} catch (Exception e) {
			System.out.println("에러가 >>> : " + e.getMessage());
		}finally {
			
			if(fis != null) {
				try {
					fis.close(); fis=null;
				} catch(Exception e) {}
			}
		}
	}

}
