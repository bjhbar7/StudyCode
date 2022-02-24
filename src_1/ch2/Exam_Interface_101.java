package ch2;

class Interface_B_101_Impl implements Interface_B_101 {
	public void inter_b() {
		System.out.println("Interface_B_101_Impl.inter_b() 함수 실행");
	}
}

interface Interface_B_101 {

	public void inter_b();
}

class Interface_A_101_Impl implements Interface_A_101 {

	public void inter_a() {
		System.out.println("Interface_A_101_Impl.inter_a() 함수 실행");
	}
}

interface Interface_A_101 {
	
	public void inter_a();
}

public class Exam_Interface_101 {

	public static void main(String args[]) {
		
		//부모_인터페이스클래스 선언 참조변수 = new 자식클래스생성자();
		Interface_A_101 ia = new Interface_A_101_Impl();
		ia.inter_a();

		/*
		//자식_클래스 선언 참조변수 = new 자식클래스생성자();
		Interface_A_101_Impl ia2 = new Interface_A_101_Impl();
		ia2.inter_a();
		*/
	}
}