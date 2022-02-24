package ch1;

public class Exam_Static_1 {
	
	static byte b;

	static void aM() {
		System.out.println("aM() 함수 ");
	}

	public static void main(String args[]){
	
		System.out.println("b >> : " + Exam_Static_1.b);
		System.out.println("b >> : 이것도 가능하지만 사용하지말자" + b);
	
		Exam_Static_1.aM();

	}
}
