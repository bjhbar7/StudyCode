//package : keyword : ��Ű�� ch1�� class Exam_Integer_1�� �����Ѵ�.
//; : ����(statement) ����
package ch1;

//public : keyword : ���� ������ : Access Modifier : �ٸ� ��Ű��, ���� ��Ű�� ������ ����Ѵ�.
//class	 : keyword : �ڹ� ������ ����� �ּ� �����̴�. �޸𸮿� �ö󰡸� ��ü(Object)�� �ȴ�.
//Exam_Integer_1 class�� public ���� �����ڷ� �����Ѵ�.
public class Exam_Integer_1{

/*	public : keyword : ���� ������ : Access Modifier : �ٸ� ��Ű��, ���� ��Ű�� ������ ����Ѵ�.
	static : keyword : ����, �Լ� �տ� ����ؼ� JVM�� �ش� resource�� �޸� ���� �÷� �д�. ���α׷� ����� �����ȴ�.
	void :
	main() : main �Լ� : console application �� �ϴ� �Լ�
	String : java.lang.String Ŭ���� : ���ڿ��� ��� �����ϰ� �ϴ� �ڷ���
	args : ����
	[] : �迭
*/
	public static void main(String args[]){
	
	/* 
	Integer iByte = Integer.BYTES;
	System.out.println("int iByte >>> : " + iByte);
	boxing �Ǿ��־ ��� �����ϳ�, ���� ����(JDK 1.6 ����)���� ����ϴ� ��Ģ���� int  �� ����Ѵ�. 
	*/
	
	/*
	1. int ��������(�ڷ���)�� ���� : BYTES ������ ��������(�ڷ���)�� int �̱� ������ 
	2. int �� �����͸� ���� ������ intBytes �� ���� : �������� ���������� �����ϱ� ���� ����Ѵ�.
	3. = : ���� ������ ���� 
	4. Integer.BYTES : int �� �������� ����Ʈ ũ�⸦ ������ �ִ� Integer ���� Ŭ������ BYTES ��� �̴�. 
				 ���⿡  int �� ����Ʈ ũ�Ⱑ 4 ����Ʈ�� �ʱ�ȭ �Ǿ� �ִ�. 
	*/
	
	/*
	int : type : ��������(�ڷ���) : 4 byte ũ���� ���� ����
	intBytes : ����
	= : ���� ������
	Integer.BYTES	: int �� �������� byte ũ�⸦ ������ �ִ� Integer Wrapper class�� BYTES ��� �̴�.
	Integer.SIZE	: int �� �������� byte ũ�⸦ ������ �ִ� Integer Wrapper class�� SIZE ��� �̴�.
	Integer.MAX_VALUE	: int �� �������� byte ũ�⸦ ������ �ִ� Integer Wrapper class�� MAX_VALUE ��� �̴�.
	Integer.MIN_VALUE	: int �� �������� byte ũ�⸦ ������ �ִ� Integer Wrapper class�� MIN_VALUE ��� �̴�.
	; : ����(statement) ����
	*/
	int intBytes = Integer.BYTES;
	int intSize = Integer.SIZE;
	int intMax = Integer.MAX_VALUE;
	int intMin = Integer.MIN_VALUE;
	
	// System.out.println(); : �Լ� ������ ���ڿ��� ����Ѵ�.
	// ; : ����(statement) ����
	System.out.println("Integer.BYTES �� : " + intBytes);
	System.out.println("Integer.SIZE �� : " + intSize);
	System.out.println("Integer.MAX_VALUE �� : " + intMax);
	System.out.println("Integer.MIN-VALUE �� : " + intMin);
	
	} //end of main()

} //end of Exam_Integer_1 class