package ch1;

public class Exam_String_103 {

	public void stringTest() {
	
		System.out.println("Exam_String_103.stringTest() �Լ��� ���� >>>>>>");
		System.out.println("String Ŭ�������� ���ڿ� ���� �����̼��� ����Ѵ�.");

		String str0 = "";
		String str1 = null;
		String str2 = " ab c  ";

		//public int length()
		System.out.println("str0.length()�� ���ڿ� ���̸� ���ϴ� �Լ� : " + str0.length());
		int str0Length = str0.length();
		System.out.println("str0Length ���ڿ� ���̸� ���ϴ� �Լ� : " + str0Length);

		//System.out.println("str1.length()�� ���ڿ� ���̸� ���ϴ� �Լ� : " + str1.length());
		/* ����� ������ ����.
		Exception in thread "main" java.lang.NullPointerException
        at a.b.c.ch1.Exam_String_103.stringTest(Exam_String_103.java:18)
        at a.b.c.ch1.Exam_String_103.main(Exam_String_103.java:44)
		*/
		System.out.println("str2.length()�� ���ڿ� ���̸� ���ϴ� �Լ� : " + str2.length());
		int str2Length = str2.length();
		System.out.println("str2Length ���ڿ� ���̸� ���ϴ� �Լ� : " + str2Length);

		System.out.println("str0 : " + str0);
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		//public char charAt(int index)

		//System.out.println("str0.charAt(0) : " + str0.charAt(0));
		/* ����� ������ ����.
		Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 0
        at java.lang.String.charAt(String.java:658)
        at a.b.c.ch1.Exam_String_103.stringTest(Exam_String_103.java:35)
        at a.b.c.ch1.Exam_String_103.main(Exam_String_103.java:52)
		*/

		//System.out.println("str1.charAt(0) : " + str1.charAt(0));
		/* ����� ������ ����.
		Exception in thread "main" java.lang.NullPointerException
        at a.b.c.ch1.Exam_String_103.stringTest(Exam_String_103.java:42)
        at a.b.c.ch1.Exam_String_103.main(Exam_String_103.java:59)
		*/
		System.out.println("str2.charAt(0) : " + str2.charAt(0));
		System.out.println("(int)str2.charAt(0) : " +(int)str2.charAt(0));
		
		//java.lang.Integer class�� toHexString
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