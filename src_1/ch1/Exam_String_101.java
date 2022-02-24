package ch1;

public class Exam_String_101 {

	public void arrayTest() {
		System.out.println("Exam_String_101 클래스의 arrayTest() 함수의 시작 >>>>>> ");

		char cArray[] = { 'a' , 'b' , 'c' };
		System.out.println("cArray[] >>>> : " +cArray);
		System.out.println("cArray[0] >>>> : " +cArray[0]);
		System.out.println("cArray[1] >>>> : " +cArray[1]);
		System.out.println("cArray[2] >>>> : " +cArray[2]);
		
		String str = new String(cArray);
		System.out.println("str : " + str);
		System.out.println("str.charAt(0) : " + str.charAt(0));
		System.out.println("str.charAt(1) : " + str.charAt(1));
		System.out.println("str.charAt(2) : " + str.charAt(2));

		String str1 = new String("abc");
		System.out.println("str1 : " + str1);
		System.out.println("str1.charAt(0) : " + str1.charAt(0));
		System.out.println("str1.charAt(1) : " + str1.charAt(1));
		System.out.println("str1.charAt(2) : " + str1.charAt(2));

		String str2 = "abc";
		System.out.println("str2 : " + str2);
		System.out.println("str2.charAt(0) : " + str2.charAt(0));
		System.out.println("str2.chatAt(1) : " + str2.charAt(1));
		System.out.println("str2.chatAt(2) : " + str2.charAt(2));
	}

	public static void main(String args[]) {

		//new 연산자를 이용해서 Exam_String_101() 생성자의 arrayTest() 함수를 불러온다.
		new Exam_String_101().arrayTest();
	}
}