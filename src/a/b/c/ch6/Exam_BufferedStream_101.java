package a.b.c.ch6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import a.b.c.common.FilePath;

public class Exam_BufferedStream_101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 파일 패스 공통클래스에서 불러오기
		String filePath = FilePath.FILE_PATH_CH6;
		
		// 파일 패스 및 사용할 파일 명까지 초기화
		String inFile = filePath + "/" + "Exam_BufferedStream_101.java";
		String outFile = filePath + "/" + "Exam_BufferedStream_101.bak";
		
		// 사용할 지역변수 초기화 하기
		BufferedInputStream inbuf = null;
		BufferedOutputStream outbuf = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		File f = null;
		int data = 0;
		
		try {
			
			f = new File(inFile);
			
			// 파일이 있는지 여부 체크하는 boolean
			boolean bFile = f.exists();
			System.out.println("bFile >>> : " + bFile);
			
			// 파일이 있을 때만 수행한다.
			if(bFile) {
				
				// 파일을 읽기 위해 서
				fis = new FileInputStream(f);
				inbuf = new BufferedInputStream(fis);
				
				
				fos = new FileOutputStream(outFile, true);
				outbuf = new BufferedOutputStream(fos);
				
				while ((data=inbuf.read())!=-1) {
					System.out.print((char)data);
					outbuf.write(data);
				}
				//public void flush() throws IOException
				outbuf.flush();
				
				outbuf.close(); outbuf=null;
				inbuf.close(); inbuf=null;
				
				fos.close(); fos=null;
				fis.close(); fis=null;
				
			}else {
				System.out.println("사용하려는 해당 데이터(파일이)가 없습니다.");
				}
			}catch (Exception e) {
				System.out.println("에러가 e.getMessage() >>> : " + e.getMessage());
			}finally {
				if(inbuf != null) {
					try {inbuf.close(); inbuf=null;}catch(Exception e) {}
				}
				if(outbuf != null) {
					try {outbuf.close(); outbuf=null;}catch(Exception e) {}
				}
				if(fis != null) {
					try {fis.close(); fis=null;}catch(Exception e) {}
				}
				if(fos != null) {
					try {fos.close(); fos=null;}catch(Exception e) {}
				}
			}
		}
	}


