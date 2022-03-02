//package 선언
package a.b.c.ch6;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

//class 선언
public class Exam_File_106 {
	//상수 선언
	//맴버 변수 선언
	static int totalFiles = 0;
	static int totalDirs = 0;
	//생성자 선언
	//함수 선언
	public static void printFileList(File dir) {
		System.out.println("" + dir.getAbsolutePath());
		
		File[] files = dir.listFiles();
		
		ArrayList subDir = new ArrayList();
		
		for (int i=0; i < files.length; i++) {
			String fileName = files[i].getName();
			
			if (files[i].isDirectory())
			{
				fileName = "디렉토리 >>> : [" + fileName + "]";
				subDir.add(i + "");
			}
			System.out.println("파일 >>> : " + fileName);
		}
		
		int dirNum = subDir.size();
		int fileNum = files.length - dirNum;
		
		totalFiles += fileNum;
		totalDirs += dirNum;
		
		System.out.println(fileNum + "개의 파일, " + dirNum + "개의 디렉토리");
		System.out.println();
		
		System.out.println("subDir >>> : " + subDir);
		for (int i=0; i < subDir.size(); i++) {
			System.out.println("subDir.get("+i+") >>> : " + subDir.get(i));
			
			int index = Integer.parseInt((String)subDir.get(i));
			
			printFileList(files[index]);
		}
	}
	
	//main() 선언
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("디렉토리를 입력하시오");
		String str = sc.next();
		
		System.out.println("str.isEmpty() >>> : " + str.isEmpty());
		if (str.isEmpty()) {
			System.out.println(" USAGE : java Exam_File_106 DIRECTORY");
			System.exit(0);
		}
		/*
		//public class ArrayList<E>
		 ArrayList<String> arr = new ArrayList();
		 arr.add(str);
		 System.out.println("arr.size() >>> : " + arr.size());
		 if (arr.size() != 1){
			System.out.println(" USAGE : java FileTest_5 DIRECTORY");
			System.exit(0);
			}
		 */
		File dir = new File(str);
		
		if (!dir.exists() || !dir.isDirectory()) {
			System.out.println(" 유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		printFileList(dir);
		System.out.println();
		System.out.println(" 총 : " + totalFiles + " 개의 파일");
		System.out.println(" 총 : " + totalDirs + " 개의 디렉토리");
	}

}
