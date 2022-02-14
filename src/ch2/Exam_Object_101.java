package ch2;

public class Exam_Object_101 extends java.lang.Object {

	public String toString() {
		
		System.out.println("Object에 있는 toString() 함수 >>>>>>");

		return "문자를 리턴한다.";
	}

	public static void main(String args[]) {
	
		System.out.println("Hello Java~~~~");

		Exam_Object_101 eo = new Exam_Object_101();
		System.out.println("eo 주소값 >>>> " + eo);
		System.out.println("eo 주소값 >>>> " + eo.toString());
	}
}