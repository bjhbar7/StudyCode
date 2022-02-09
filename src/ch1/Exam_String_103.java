package ch1;

public class Exam_String_103 {

	public void stringTest() {
	
		System.out.println("Exam_String_103.stringTest() 함수의 시작 >>>>>>");
		System.out.println("String 클래스에서 문자열 떠블 쿼테이션을 사용한다.");

		String str0 = "";
		String str1 = null;
		String str2 = " ab c  ";

		//public int length()
		System.out.println("str0.length()의 문자열 길이를 구하는 함수 : " + str0.length());
		int str0Length = str0.length();
		System.out.println("str0Length 문자열 길이를 구하는 함수 : " + str0Length);

		//System.out.println("str1.length()의 문자열 길이를 구하는 함수 : " + str1.length());
		/* 실행시 에러가 난다.
		Exception in thread "main" java.lang.NullPointerException
        at a.b.c.ch1.Exam_String_103.stringTest(Exam_String_103.java:18)
        at a.b.c.ch1.Exam_String_103.main(Exam_String_103.java:44)
		*/
		System.out.println("str2.length()의 문자열 길이를 구하는 함수 : " + str2.length());
		int str2Length = str2.length();
		System.out.println("str2Length 문자열 길이를 구하는 함수 : " + str2Length);

		System.out.println("str0 : " + str0);
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		//public char charAt(int index)

		//System.out.println("str0.charAt(0) : " + str0.charAt(0));
		/* 실행시 에러가 난다.
		Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 0
        at java.lang.String.charAt(String.java:658)
        at a.b.c.ch1.Exam_String_103.stringTest(Exam_String_103.java:35)
        at a.b.c.ch1.Exam_String_103.main(Exam_String_103.java:52)
		*/

		//System.out.println("str1.charAt(0) : " + str1.charAt(0));
		/* 실행시 에러가 난다.
		Exception in thread "main" java.lang.NullPointerException
        at a.b.c.ch1.Exam_String_103.stringTest(Exam_String_103.java:42)
        at a.b.c.ch1.Exam_String_103.main(Exam_String_103.java:59)
		*/
		System.out.println("str2.charAt(0) : " + str2.charAt(0));
		System.out.println("(int)str2.charAt(0) : " +(int)str2.charAt(0));
		
		//java.lang.Integer class의 toHexString
		//static String	toHexString(int i)
		System.out.println("Integer.toHexString((int)str2.charAt(0)) >>> : " + Integer.toHexString((int)str2.charAt(0)));
		System.out.println("Integer.toHexString((int)str2.charAt(1)) >>> : " + Integer.toHexString((int)str2.charAt(1)));
		System.out.println("Integer.toHexString((int)str2.charAt(2)) >>> : " + Integer.toHexString((int)str2.charAt(2)));
		System.out.println("Integer.toHexString((int)str2.charAt(3)) >>> : " + Integer.toHexString((int)str2.charAt(3)));
		System.out.println("Integer.toHexString((int)str2.charAt(4)) >>> : " + Integer.toHexString((int)str2.charAt(4)));
		System.out.println("Integer.toHexString((int)str2.charAt(5)) >>> : " + Integer.toHexString((int)str2.charAt(5)));
		System.out.println("Integer.toHexString((int)str2.charAt(6)) >>> : " + Integer.toHexString((int)str2.charAt(6)));
	}

	public static void main(String args[]){
	
		new Exam_String_103().stringTest();
	}
}