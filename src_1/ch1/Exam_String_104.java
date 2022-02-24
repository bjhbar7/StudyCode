package ch1;

public class Exam_String_104 {

	public void stringTest() {
		System.out.println("Exam_String_104.stringTest() 함수의 시작 >>>>>>>");

		String str0 = "";

		str0.length();

		System.out.println("" + str0.length());

		int str0Length = str0.length();

		System.out.println("" + str0Length);
	}
	public static void main(String args[]) {
		new Exam_String_104().stringTest();
	}
}