//package : ch1 ���丮�� Exam_String_102 Ŭ������ �����Ѵ�.
package ch1;
//public : ���� ������ : �ٸ� ��Ű��, ���� ��Ű�������� class ������ ����Ѵ�.
//class : �ڹ��� �ּ� ���� : class�� �Լ� + ������ �����ȴ�. : 2���� �Լ��� �����Ǿ��ִ�.
public class Exam_String_102 {
	//public : �ٸ� ��Ű��, ���� ��Ű�������� arrayTest() �Լ��� ������ ����Ѵ�.
	//void : ���ϰ��� ���� ��� ������ �ڸ��� ����Ѵ�.
	public void arrayTest() {
		//System.out.println(); : () �Ұ�ȣ �ȿ� ������ ����Ѵ�.
		System.out.println("Exam_String_102.arrayTest() �Լ��� ���� >>>>>>");
		//char�� ������ Ÿ���� �迭�̴�.
		char charArray[] = { 'a' , 'b' , 'c'};
		System.out.println("charArray�� �ּҰ� : " + charArray);
		//charArray[0] : charArray �迭�� 0�� index�ڸ��� ��
		System.out.println("charArray[0] : " + charArray[0]);
		//charArray[1] : charArray �迭�� 1�� index�ڸ��� ��
		System.out.println("charArray[1] : " + charArray[1]);
		//charArray[2] : charArray �迭�� 2�� index�ڸ��� ��
		System.out.println("charArray[2] : " + charArray[2]);
		// java.lang.System
		// public static int identityHashCode(Object x)
		System.out.println("System.indentityHashCode(charArray) : " + System.indentityHashCode(charArray));
		//String Ŭ����(���ڿ� Ŭ����)�� �ν��Ͻ��ߴ�.
		String str = new String(charArray);
		System.out.println("str : " + str);
		System.out.println("System.indentityHashCode(str) : " + System.indentityHashCode(str));
		//String Ŭ����(���ڿ� Ŭ����)�� �ν��Ͻ��ߴ�.
		String str1 = new String("abc");
		System.out.println("str1 : " + str1);
		System.out.println("System.indentityHashCode(str1) : " + System.indentityHashCode(str1));
		// String �������� = ""; : ���� ���� ����ϴ� ����̴�.
		String str2 = "abc";
		System.out.println("str2 : " + str2);
		System.out.println("System.indentityHashCode(str2) : " + System.indentityHashCode(str2));


	}
	//�ܼ� ���ø����̼��� ���������� main() �Լ��̴�. : ��������Ʈ ������� �����Ѵ�.
	public static void main(String args[]){
		//new �����ڸ� ����ؼ� Exam_String_102() �������� arrayTest() �Լ��� �����Ѵ�.
		new Exam_String_102().arrayTest();
	} //end of main()
} //end of Exam_String_102