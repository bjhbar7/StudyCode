//package : keyword : ch1 �� Exam_Limit_1 class�� �����Ͻÿ�.
// ; : ����(statement) ����
package ch1;

//public : keyword : ���� ������ : Access Modifier : ���� ��Ű��, �ٸ� ��Ű���� ������ ����Ѵ�.
//class : �ڹٿ��� ���� ���� ������ ���� : �޸𸮿� �ö󰡸� ��ü(Object)
public class Exam_Limit_1{

//public : ���� ��Ű�� , �ٸ� ��Ű���� main() �Լ� ������ ����Ѵ�.
//static : keyword : ����, �Լ� �տ� ����ؼ� JVM�� �ش� resource�� �޸� ���� �÷� �д�. ���α׷� ����� �����ȴ�.
//void :
//main() : console application main() �Լ�
//String : java.lang.String class : ���ڿ��� ��� ������ �ڷ���
//args : ����
//[] : �迭
	public static void main(String args[]){
		/*
		int : type : �ڷ���(��������) : ������ Ÿ���� int�� �����Ѵ�. 4 byte ���� : �ڹ��� �⺻ type
		= : ���� ������
		Integer.MAX_VALUE : java.lang.Integer class�� �����ϴ� int�� MAX_VALUE ��� : int�� �ִ밪�� �ǹ��Ѵ�.
		Long.MAX_VALUE : java.lang.Long class�� �����ϴ� Long�� MAX_VALUE ��� : Long�� �ִ밪�� �ǹ��Ѵ�.
		; : ����(statement) ����
		*/
		int intMax = Integer.MAX_VALUE;
		long longMax = Long.MAX_VALUE;
		/*
			System : java.lang.System Ŭ������ ����
					 System Ŭ���� �ڹٿ��� �ý��ۿ� ���õ� ����� ��Ƶ� Ŭ���� 
					 System Ŭ������ �׳� ����� �� �ִ� ������ 
					 Ŭ������ final Ŭ���� �̱� �����̴�. 
			. : ��ũ ������ : System Ŭ������  out �ʵ带 �����ϴ� �������̴�. 
			out : System Ŭ������ �ִ� ������ stream(output)�� ����ϴ� ��� ��Ȱ�� �ϴ� ���� 
			. : out �ʵ�� println() �Լ��� �����ϴ� ��ũ ������ 
			println() : console�� ����� �ϴ� �Լ� �̴�.
						print :  ����Ͻÿ�
						ln : ������ �ϳ� ��켼�� 		
		*/
		// println() �Լ��� �ƱԸ�Ʈ�� �ִ� �����͸� �ֿܼ� ��� �Ͻÿ� 
		System.out.println("Integer.MAX_VALUE : " + intMax);
		/*
			System : java.lang.System Ŭ������ ����
					System Ŭ���� : �ڹٿ��� �ý��ƿ� ���õ� ����� ��Ƶ� Ŭ����
			. : ��ũ ������ : System Ŭ������ out �ʵ带 �����ϴ� �������̴�.
			out : System Ŭ������ �ִ� ������ stream(output)�� ����ϴ� ��� ������ �ϴ� ����
			. : out �ʵ�� println() �Լ��� �����ϴ� ��ũ ������
			println() : console�� ����� �ϴ� �Լ��̴�.
						print : ����Ͻÿ�
						ln : ������ �ϳ� ���ÿ�
			println() �Լ��� argument�� �ִ� �����͸� �ֿܼ� ����Ͻÿ�.
		*/
		System.out.println("Long.MAX_VALUE : " + longMax);

		/*
		int num1 = 9223372036854775807;
		System.out.println("int num1 : " + num1);

		long num2 = 9223372036854775807;
		System.out.println("long num2 : " + num2);
		*/
		/*
		C:\00.KOSMO108\10.JExam\ch1>javac -d . Exam_Limit.java
		Exam_Limit.java:14: error: integer number too large: 9223372036854775807
						int num1 = 9223372036854775807;
								   ^
		Exam_Limit.java:17: error: integer number too large: 9223372036854775807
						long num2 = 9223372036854775807;
									^
		2 errors
		*/
		
		// long type�� ���� ����L(l)�� �����Ѵ�.
		long num3 = 9223372036854775807L;
		System.out.println("long num3 : " + num3);

		long num4 = 9223372036854775807l;
		System.out.println("long num4 : " + num4);

	} //end of main()

} //end of Class