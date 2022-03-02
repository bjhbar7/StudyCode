//package ����
package a.b.c.ch6;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

//class ����
public class Exam_File_106 {
	//��� ����
	//�ɹ� ���� ����
	static int totalFiles = 0;
	static int totalDirs = 0;
	//������ ����
	//�Լ� ����
	public static void printFileList(File dir) {
		System.out.println("" + dir.getAbsolutePath());
		
		File[] files = dir.listFiles();
		
		ArrayList subDir = new ArrayList();
		
		for (int i=0; i < files.length; i++) {
			String fileName = files[i].getName();
			
			if (files[i].isDirectory())
			{
				fileName = "���丮 >>> : [" + fileName + "]";
				subDir.add(i + "");
			}
			System.out.println("���� >>> : " + fileName);
		}
		
		int dirNum = subDir.size();
		int fileNum = files.length - dirNum;
		
		totalFiles += fileNum;
		totalDirs += dirNum;
		
		System.out.println(fileNum + "���� ����, " + dirNum + "���� ���丮");
		System.out.println();
		
		System.out.println("subDir >>> : " + subDir);
		for (int i=0; i < subDir.size(); i++) {
			System.out.println("subDir.get("+i+") >>> : " + subDir.get(i));
			
			int index = Integer.parseInt((String)subDir.get(i));
			
			printFileList(files[index]);
		}
	}
	
	//main() ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���丮�� �Է��Ͻÿ�");
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
			System.out.println(" ��ȿ���� ���� ���丮�Դϴ�.");
			System.exit(0);
		}
		
		printFileList(dir);
		System.out.println();
		System.out.println(" �� : " + totalFiles + " ���� ����");
		System.out.println(" �� : " + totalDirs + " ���� ���丮");
	}

}
