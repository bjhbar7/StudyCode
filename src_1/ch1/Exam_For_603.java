//package : keyword : ch1 ���丮�� Exam_For_603 Ŭ������ �����Ѵ�.
//; : ����(statement) ����
package ch1;

//import : ����ϰ� ���� Ŭ������ �ҷ����� ���ؼ� ����ϴ� Ű���� : ��Ű����.Ŭ������ ���� ����Ѵ�.
import java.util.Scanner;

//public : ���� ������ : Access Modifier : ���� ��Ű��, �ٸ� ��Ű������ class�� ������ ����Ѵ�.
//class : �ڹ��� �ּ� ���� : class�� ���� + �Լ��� �����Ǿ��ִ�.
public class Exam_For_603 {

	//public : ���� ������ : ���� ��Ű��, �ٸ� ��Ű������ �Լ��� ������ ����Ѵ�.
	//void : �Լ��� ���ϰ��� ���� �� ������ ��ġ�� ����Ѵ�.
	//String : java.lang.String : ���ڿ��� ǥ���� �� �ְ��ϴ� Ŭ����
	//(String str) : parameter : �Ű� ���� 
	public void toHex_Str(String str) {
		System.out.println("Exam_For_6.toHex_Str() �Լ� ���� >>> : ");
		//str != null && str.length() >0 : str������ null�� �ƴϰ�, str.length()�� 0�� �ƴϸ� true(��)�̴�.
		if(str !=null && str.length() >0) {
			//char : �ڷ��� : 1byte : ���� ���� : ����
			//char�� ���� c�� ���� �� ' '(�� ����)�� �ʱ�ȭ�Ѵ�.
			char c = ' ';
			//for : keyword : from to loop : Ư�� ���Ǻ��� Ư�� ���Ǳ��� �ݺ��Ѵ�.
			for (int i = 0; i < str.length(); i++) 	{	
				//public char charAt(int index)
				//index = 0 �� �ִ� String ���ڿ��� char������ �ٲ۴�.
				c =  str.charAt(0);
				System.out.print(c + " ");
				//public static String toHexString(int i)
				//int �� ���ڸ� 16������ ǥ���Ѵ�.
				System.out.print("0x" + Integer.toHexString(c) + " ");
				System.out.println();
			}
		}
	}


	public static void main(String args[]) {
	
		// ������ �ҹ���
		String s0 = "abcdefghijklmnopqrstuvwxyz";
		// ������ �빮�� 
		// public String toUpperCase()
		String s1 = s0.toUpperCase();
		// ���� 
		String s2 = "0123456789";
		// �����ȣ
		String s3 = "*+-/";
		// Ư�� ����
		String s4 = "!@#%%^&*";
		
		System.out.println(   "1 : ������ �ҹ��� \n"
							+ "2 : ������ �빮�� \n"
							+ "3 : ���� \n"
							+ "4 : ���� ��ȣ \n"
							+ "5 : Ư�� ���� \n"
							+ "�� �Է��Ͻÿ� ");
		
		
		/*
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		*/
		Scanner sc = new Scanner(System.in);
		int iVal = sc.nextInt();

		if (1 == iVal) {
			new Exam_For_603().toHex_Str(s0);
		}
		if (2 == iVal) {
			new Exam_For_603().toHex_Str(s1);
		}
		if (3 == iVal) {
			new Exam_For_603().toHex_Str(s2);
		}
		if (4 == iVal) {
			new Exam_For_603().toHex_Str(s3);
		}
		if (5 == iVal) {
			new Exam_For_603().toHex_Str(s4);
		}

	}
}