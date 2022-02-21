package a.b.c.ch4;

public class Exam_ToString_101 {
	
	//java.lang.Object의 toString()을 재정의할 때, 오버라이딩 어노테이션으로 표기한다.
	//Exam_ToString_101 class를 사용하는 블럭에서 toString() 함수를 호출하면, 재정의된 toString() 값이 리턴된다.
	@Override
	public String toString() {
		
		return "Exam_ToString_101 클래스에 있는 오버라이딩한 toString() 함수 ";
	}
	//자바 console application의 시작지점이다. : 함수()는 인터프리트 방식으로 진행한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam_ToString_101 et_1 = new Exam_ToString_101();
		//et_1에 et_1.toString() 함수가 생략되어 있다.
		System.out.println("et_1 의 주소값 >>>>> : " + et_1);
		//et_1의 주소값 : a.b.c.ch4.Exam_ToString_101@15db9742
		// public String toString()
		// java.lang.Object
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		System.out.println("et_1.toString()의 값 >>>>> : " + et_1.toString());
		
		System.out.println("et_1.getClass().getName()의 값 >>>>> : " + et_1.getClass().getName());
		
		Exam_ToStringVO_101 etvo_1 = new Exam_ToStringVO_101();
		etvo_1.setIval(30);
		etvo_1.setSval("배진량");
		System.out.println("etvo_1.toString() >>>>> : " + etvo_1.toString());
		System.out.println("etvo_1 >>>>> : " + etvo_1);
		
	}//end of main()

}//end of Exam_ToString_101
