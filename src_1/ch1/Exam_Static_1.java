package ch1;

public class Exam_Static_1 {
	
	static byte b;

	static void aM() {
		System.out.println("aM() �Լ� ");
	}

	public static void main(String args[]){
	
		System.out.println("b >> : " + Exam_Static_1.b);
		System.out.println("b >> : �̰͵� ���������� �����������" + b);
	
		Exam_Static_1.aM();

	}
}
