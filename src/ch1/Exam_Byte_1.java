//package : keyword : ch1�� Exam_Byte_1 Ŭ������ �д�. 
// ; : ����(statement) ����
package ch1;

// public : ���� ������ : Access Modifier : ����, �ٸ� package���� class ���� ���
// class : keyword : �ڹ� ���α׷��� ����� �ּ� ���� : �޸� ���� �ö󰡸� Object�� ���Ѵ�.
public class Exam_Byte_1 {

/*	public : ���� ������ : keyword : Access Modifier : ����, �ٸ� package���� main() �Լ��� ���� ���
	static :
	void :
	main() : console application main() �Լ�
	String : java.lang.String class
	args : ����
	[] : �迭
*/
	public static void main(String args[]){
	
	// System.out.println() : java.lang.System Ŭ������ �ִ� console ��� �Լ�
	// Byte : Wrapper Ŭ���� : java.lang.Byte Ŭ����
	// . : ��Ʈ ������ : ��ũ ������
	// BYTES : byte�� Ȯ��
	// SIZE : bit�� Ȯ��
	// ; : ����(statement) ����
		System.out.println("byte�� ũ��� 1 ����Ʈ >>> :" + Byte.BYTES);
		System.out.println("byte�� ������ 8 ��Ʈ >>> :" + Byte.SIZE);
	// byte : keyword : �ڷ���, �������� (type) : 1byte ����
	// bMax : ����
	// Byte : Wrapper Ŭ���� : java.lang.Byte Ŭ����
	// 
		byte bMax = Byte.MAX_VALUE;
		System.out.println("byte�� �ִ밪 :: Byte.MAX_VALUE >>> :" + bMax);
			
		byte bMin = Byte.MIN_VALUE;
		System.out.println("byte�� �ּҰ� :: Byte.MIN_VALUE >>> :" + bMin);
	}

}
/*	������ �� �����ϴ� ��
������Ű > ������Ű + "r" > cmd > cd / > file.java �� �ִ� ���� ã�ư��� (ex) cd 0*R/1*m/ch1 ) 
> javac -d . file.java > type file.java �� package Ȯ�� ( Name space Ȯ�� ) > java package.className
*/