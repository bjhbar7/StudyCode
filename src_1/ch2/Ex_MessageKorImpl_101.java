package ch2;

//public : 접근 제한자 : Access Modifier : 다른 패키지, 같은 패키지에서 class의 접근을 허용한다.
//class : 자바의 최소 단위 : class는 변수 + 함수
//implements : keyword : 인터페이스의 상속의 기능을 갖고 있다. : 인터페이스에서 인터페이스의 상속은 extends를 사용해야한다. implements를 사용한 상속은 다중 상속이 가능하다.
public class Ex_MessageKorImpl_101 implements Ex_MessageInterface_101 {
	//@Override : 어노테이션 : 추상 함수를 재정의할 때 사용한다. 컴파일러가 문법을 검사한다.
	@Override
	//public : 접근 제한자 : Access Modifier : 다른 패키지, 같은 패키지에서 함수() 접근을 허용한다.
	public void sayHello(String name) {
		System.out.println("안녕하세요, " + name + " !!");
	}
}