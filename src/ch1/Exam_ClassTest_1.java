//package : keyword : a.b.c.ch1 디렉토리에 Exam_ClassTest_1 클래스를 저장한다.
//; : 문장(statement) 종결
package ch1;

//public : 접근 제한자 : Access Modifier : 다른 패키지, 같은 패키지에서의 해당 class의 접근을 허락한다.
//class : 자바의 최소 단위 : class 의 구성은 함수 + 변수 이다.
public class Exam_ClassTest_1 {
	//멤버 변수
	//int : 자료형 : 4 byte 공간
	//int 형의 iVal 변수 선언
	//; : 문장(statement) 종결
	int iVal;
	//static : keyword : 변수 혹은 함수 앞에 기술하며 JVM 이 메모리에 올려준다. 프로그램 종료시 해제된다.
	//static 키워드가 붙은 변수는 실행할 때 JVM이 값을 초기화 해준다.
	//int : 자료형 : 4 byte 공간
	//int 형의 iValStatic 클래스 변수 선언
	//; : 문장 종결
	static int iValStatic;
	//public : 접근 제한자 : Access Modifier :  다른,같은 패키지에서 main() 함수의 접근을 허용한다.
	//static : keyword : 변수 혹은 함수 앞에 기술하며 JVM 이 메모리에 올려준다. 프로그램 종료시 해제된다.
	//void : 리턴값이 없을 때 사용한다.
	//main() : 매인 함수 : console application의 시작점이다.
	public static void main(String args[]){
		System.out.println("main()의 시작");
		//함수 내부에서 선언한 변수는 지역변수이다.
		//지역변수는 반드시 초기화를 해서 사용한다.
		int i = 10;
		System.out.println("지역변수 i >>> : " + i);

		System.out.println("클래스변수 iValStatic >>> : " + iValStatic);
		//iVal 멤버 변수는 해당 클래스를 new 연산자로 메모리에 올려서 사용한다. 
		//객체(Object) ec와 객체(Object) ec_1는 다른 메모리(객체)이다.
		Exam_ClassTest_1 ec = new Exam_ClassTest_1();
		System.out.println("객체 ec >>> :" + ec);
		System.out.println("객체 ec의 멤버변수 iVal >>> : " + ec.iVal);

		Exam_ClassTest_1 ec_1 = new Exam_ClassTest_1();
		System.out.println("객체 ec_1 >>> :" +ec_1);
		System.out.println("객체 ec_1의 멤버변수 iVal >>> : " + ec_1.iVal);
		
		//static 변수는 첨조변수로 참조하지 않는다. 실행은 되나 프로그램이 망가진다.
		//System.out.println(ec_1.iValStatic);

		}//end of main()
}//end of Exam_ClassTest_1