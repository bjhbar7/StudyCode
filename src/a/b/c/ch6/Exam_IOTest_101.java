//package 선언
package a.b.c.ch6;
//import 선언
import java.util.Scanner;
//class 선언
public class Exam_IOTest_101 {
	//상수 선언
	//맴버 변수 선언
	//생성자 선언
	//함수 선언
	
	//main 선언
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("IO 테스트 숫자 : ");
		Scanner sc = new Scanner(System.in);
		//public int nextInt()
		//Scans the next token of the input as an int.
		int data = sc.nextInt();
		System.out.println("data >>> : " + data);
		System.out.println("binary >>> : " + Integer.toBinaryString(data));
		
		System.out.println("IO 테스트 문자 : ");
		Scanner sc1 = new Scanner(System.in);
		//public String nextLine()
		String dataS = sc1.nextLine();
		
		System.out.println("문자 >>> : " + dataS);
		
		for (int i=0; i < dataS.length(); i++) {
			//public char charAt(int index)
			//the char value at the specified index of this string. The first char value is at index 0.
			char c = dataS.charAt(i);
			System.out.println("binary >>> : "
					+ " : " + c
					+ " : " + (byte)c
					+ " : " + Integer.toBinaryString(c));
		}//end of for
		
		sc.close();
		sc1.close();
	}//end of main()

}//end of Exam_IOTest_101
