package ch1;

public class Exam_Boolean_101 {

	boolean bVal;

	public static void main(String args[]) {
	
		boolean bool = false;
		System.out.println("bool : " + bool);
		bool = true;
		System.out.println("bool : " + bool);
		bool = false;
		System.out.println("bool : " + bool);
		//new 연산자 : 인스턴스 Exam_Boolean_101()를 만든다.
		//Exam_Boolean_101() : 참조 변수
		System.out.println("Exam_Boolean_101() : " + new Exam_Boolean_101());

		System.out.println("bVal : " + new Exam_Boolean_101().bVal);

		Exam_Boolean_101 eb = new Exam_Boolean_101();
		System.out.println("eb : " + eb);
		System.out.println("eb.bVal : " + eb.bVal);

	}
}