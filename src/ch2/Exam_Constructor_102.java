package ch2;

public class Exam_Constructor_102 {
	
	String s;
	int i;

	public Exam_Constructor_102() {
		System.out.println("매개변수 없는 기본 생성자");
	}

	public Exam_Constructor_102(String s) {
		System.out.println("매개변수 있는 생성자");
		System.out.println("Exam_Constructor_102 String s >>>>>>" + s);
	}
	
	public static void main(String args[]) {
		
		System.out.println("Hello Java");

		Exam_Constructor_102 ec = new Exam_Constructor_102();

		Exam_Constructor_102 ec2 = new Exam_Constructor_102("문자열");
	}
}