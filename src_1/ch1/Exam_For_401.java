package ch1;

public class Exam_For_401 {

	public static void main(String args[]) {
		/*
		1. ���� ����, �ʱ�ȭ�ؼ� ����ؾ� �Ѵ�.
		2. ���� ����, �ּҰ��� ���´�.(����)
		// public static int identityHashCode(Object x)
		3. rt.jar : java.lang.String : import ���� �ʾƵ� ��� ����
		4. ���ڿ��� �ٷ�� ��Ʈ�� Ŭ����
		*/
		String s0 = "abc";
		//public String toUpperCase()
		//Converts all of the characters in this String to upper case using the rules of the default locale.
		String s1 = s0.toUpperCase();

		for (int i=0; i<s0.length(); i++) { 
			//public char charAt(int index)
			//Returns the char value at the specified index.
			System.out.println("s0�� charAt("+i+") >>> :"+s0.charAt(i));
		}
		for (int i=0; i<s1.length(); i++) {
			System.out.println("s1�� charAt("+i+") >>> :"+s1.charAt(i));
		}
	}
}