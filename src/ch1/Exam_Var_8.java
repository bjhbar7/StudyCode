package ch1;

public class Exam_Var_8 {

	void charMethod() {
		System.out.println("Exam_Var_8.charMethod() ���� >>>>");

		char c1 = 'A';
		System.out.println("c1 >>> : " + c1);
		System.out.println("(int)c1 >>> : " + (int)c1);
		int c2 = (int)c1;
		System.out.println("c2 >>> : " + c2);

		//static String		toBinaryString(int i)
		//Returns a string representation of the integer argument as an unsigned integer in base 2.
		//String s_1 = java.lang.Integer.toBinaryString(int i);
		String s_1 = Integer.toBinaryString(c2);
		System.out.println("c2�� 2���� :" + s_1);

		//static String		toHexString(int i)
		//Returns a string representation of the integer argument as an unsigned integer in base 16.
		//String s_2 = java.lang.Integer.toHexString(int i);
		String s_2 = Integer.toHexString(c2);
		System.out.println("c2�� 16���� :" + s_2);

		//static String		toOctalString(int i)
		//Returns a string representation of the integer argument as an unsigned integer in base 8.
		//String s_3 = java.lang.Integer.toOctalString(int i);
		String s_3 = Integer.toOctalString(c2);
		System.out.println("c2�� 8���� :" + s_3);
		System.out.println("Exam_Var_8.charMethod() �� >>>>");
	}

	public static void main(String args[]){
		System.out.println("main() �Լ��� ���� >>>>>>>");
		
		Exam_Var_8 ev8 = new Exam_Var_8();
		System.out.println("ev8�� �������� �ּҰ� : " + ev8);
		ev8.charMethod();
		System.out.println("main() �Լ��� �� >>>>>>>>");
	}
}