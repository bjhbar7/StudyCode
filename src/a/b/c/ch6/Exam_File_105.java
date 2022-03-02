package a.b.c.ch6;

import java.util.Scanner;

public class Exam_File_105 {
	
	public static int factorial(int n) {
		System.out.println("Exam_File_105.factorial(int n) 진입 >>>>");
		System.out.println("int n >>> : " + n);
		if (n > 0) {
			System.out.println("Exam_File_105.factorial() if 진입 >>>>");
			System.out.println(">>> : " + n);
			System.out.println(n + "*" + (n-1) + "\n");
			
			return n * factorial(n-1);
		}else {
			System.out.println("Exam_File_105.factorial() else 진입 >>>>");
			System.out.println(">>> : " + n);
			System.out.println("return 1;");
			return 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Exam_File_105.main() 진입 >>>>");
		Scanner sc = new Scanner(System.in);
		System.out.println("sc >>> : " + sc);
		
		System.out.println("정수를 입력 하시오 >>> : ");
		int i = sc.nextInt();
		System.out.println("입력한 정수가 >>> : " + i + "\n");
		
		System.out.println(i+ "의 팩토리얼은 " + Exam_File_105.factorial(i));
		
		sc.close();
	}

}
