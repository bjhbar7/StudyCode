package a.b.c.ch6;

import java.util.Scanner;

public class Exam_File_105 {
	
	public static int factorial(int n) {
		System.out.println("Exam_File_105.factorial(int n) ���� >>>>");
		System.out.println("int n >>> : " + n);
		if (n > 0) {
			System.out.println("Exam_File_105.factorial() if ���� >>>>");
			System.out.println(">>> : " + n);
			System.out.println(n + "*" + (n-1) + "\n");
			
			return n * factorial(n-1);
		}else {
			System.out.println("Exam_File_105.factorial() else ���� >>>>");
			System.out.println(">>> : " + n);
			System.out.println("return 1;");
			return 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Exam_File_105.main() ���� >>>>");
		Scanner sc = new Scanner(System.in);
		System.out.println("sc >>> : " + sc);
		
		System.out.println("������ �Է� �Ͻÿ� >>> : ");
		int i = sc.nextInt();
		System.out.println("�Է��� ������ >>> : " + i + "\n");
		
		System.out.println(i+ "�� ���丮���� " + Exam_File_105.factorial(i));
		
		sc.close();
	}

}
