//package : ch2 디렉토리에 Ex_MessageTest_101 class를 저장한다.
package ch2;

//public : 접근 제한자 : Access Modifier : 같은 페키지 다른 페키지에서 class의 접근을 허용한다.
//class : 자바의 최소 단위 : class의 구성은 함수 + 변수이다.
public class Ex_MessageTest_101 {
	
	//console application의 시작 지점이다. : 함수는 인터프리트 방식으로 진행된다.
	public static void main(String args[]) {
		
		//Ex_MessageInterface_101 인터페이스의 참조 변수 emk를 선언한다.
		//new 연산자를 이용해서 Ex_MessageKorImpl_101()을(생성자을) 인스턴스한다.
		//인스턴스한 Ex_MessageKorImpl_101() 생성자로 참조 변수 emk를 초기화한다.
		Ex_MessageInterface_101 emk = new Ex_MessageKorImpl_101();
		//emk는 Ex_MessageKorImpl_101()의 주소값을 갖는다.
		System.out.println("emk 의 주소값 >>>>>>>> : " + emk);
		//Ex_MessageInterface_101의 sayHello(); 추상 함수를 호출한다.
		emk.sayHello("홍길동");
		Ex_MessageInterface_101 eme = new Ex_MessageEngImpl_101();
		//eme는 Ex_MessageEngImpl_101()의 주소값을 갖는다.
		System.out.println("eme 의 주소값 >>>>>>>> : " + eme);
		//Ex_MessageInterface_101의 sayHello(); 추상 함수를 호출한다.
		eme.sayHello("Hong Gil Dong");
	} //end of main()
} //end of Ex_MessageTest_101
/*
C:\00.KOSMO108_BJR\10.JExam\ch2>java a.b.c.ch2.Ex_MessageTest_101
emk 의 주소값 >>>>>>>> : a.b.c.ch2.Ex_MessageKorImpl_101@15db9742
안녕하세요, 홍길동 !!
eme 의 주소값 >>>>>>>> : a.b.c.ch2.Ex_MessageEngImpl_101@6d06d69c
Hello, Hong Gil Dong !!
*/