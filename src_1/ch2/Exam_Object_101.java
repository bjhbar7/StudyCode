package ch2;

public class Exam_Object_101 extends java.lang.Object {

	public String toString() {
		
		System.out.println("Object�� �ִ� toString() �Լ� >>>>>>");

		return "���ڸ� �����Ѵ�.";
	}

	public static void main(String args[]) {
	
		System.out.println("Hello Java~~~~");

		Exam_Object_101 eo = new Exam_Object_101();
		System.out.println("eo �ּҰ� >>>> " + eo);
		System.out.println("eo �ּҰ� >>>> " + eo.toString());
	}
}