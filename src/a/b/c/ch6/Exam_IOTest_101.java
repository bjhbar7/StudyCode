//package ����
package a.b.c.ch6;
//import ����
import java.util.Scanner;
//class ����
public class Exam_IOTest_101 {
	//��� ����
	//�ɹ� ���� ����
	//������ ����
	//�Լ� ����
	
	//main ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("IO �׽�Ʈ ���� : ");
		Scanner sc = new Scanner(System.in);
		//public int nextInt()
		//Scans the next token of the input as an int.
		int data = sc.nextInt();
		System.out.println("data >>> : " + data);
		System.out.println("binary >>> : " + Integer.toBinaryString(data));
		
		System.out.println("IO �׽�Ʈ ���� : ");
		Scanner sc1 = new Scanner(System.in);
		//public String nextLine()
		String dataS = sc1.nextLine();
		
		System.out.println("���� >>> : " + dataS);
		
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
