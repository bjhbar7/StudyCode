package ch1;

public class Exam_FlowControl_101 {

	public static void main(String args[]) {
		//if문 : ()에 조건이 ture 이면 {} 내용을 실행한다.
		if (true) {
			System.out.println(true);
		}

		if (false){
			System.out.println(false);
		}
		//boolean : 기초자료형 : 1 byte : true 또는 false를 저장한다.
		//boolean 자료형의 bool 변수를 선언하고 false로 초기화 한다.
		boolean bool = false;
		System.out.println("bool >>> : " + bool );
		if (bool) {
			System.out.println("true bool");
		}
		
		bool = true;
		System.out.println("bool >>> : " + bool );
		//! : 부정 연산자 : not 연산자 : true를 false로, false를 true로 바꿔준다.
		System.out.println("!bool >>> : " + !bool );

		if (!bool) {
			System.out.println("true bool");
		}
	}
}