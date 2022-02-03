//package : keyword : class Exam_Method_1를 a.b.c.ch1에 저장한다.
//; : 문장(statement) 종결
package ch1;

//public : 접근 제한자 : Access Medifier : 다른 패키지, 같은 패키지의 접근을 허용한다.
//class : 자바에서 가장 작은 단위 : 메모리에 올라가면 객체(Object)가 된다.
//class 키워드를 사용해서 이름이 Exam_Method_1 사용자 정의 class를 선언한다.
//사용자 정의 클래스 Exam_Method_1 에 있는 구성원은 변수 + 함수 이다. : aMethod() 함수, mai() 함수 
public class Exam_Method_1 {
	//public : 접근 제한자 : Access Medifier : 다른 패키지, 같은 패키지의 접근을 허용한다.
	//static : 수정자 키워드 : 변수, 함수 앞에 기술하며 JVM이 해당 resource를 메모리 위에 올려 둔다. 프로그램 종료시 해제된다.
	//void : 리턴형 : Method의 return 되는 값이 없을 때 사용한다.
	//aMethod() 함수 : Function : 함수는 기능을 하기 위해 데이터를 담아 두는 상자이다.
	//int : 자료형 : 4byte 공간 : int i 는 4byte 공간을 갖은 parameter(매개변수)이다.
	//() : 소괄호 안에는 parameter를 순차적으로 입력한다.
	public static void aMethod(int i) {
		//int : 자료형 : 4byte 공간
		//int ii = i; : int 자료형으로 ii 변수를 선언하고 i로 초기화한다.
		//; : 문장(statement) 종결
		int ii = i;
		//System : java.lang.System 클래스
		//System.out.println() 을 이용해서 println() 함수 안의 내용을 console에 출력한다.
		System.out.println("aMethod 함수 블럭 안에서 출력 >>" + ii);
	}
	//public : 접근 제한자 : Access Medifier: 다른 패키지, 같은 패키지의 접근을 허용한다.
	//static : 수정자 키워드 : 변수, 함수 앞에 기술하며 JVM이 해당 resource를 메모리 위에 올려 둔다. 프로그램 종료시 해제된다.
	//void : 리턴형 : 함수의 return 되는 값이 없을 때 사용한다.
	//main() 함수 : console application main() 함수
	//String : 참조 자료형 : 문자열을 변수에 저장 가능하게 한다. : java.lang.String
	//args : 변수
	//[] : 배열
	//public static void main(String args[]){} : console application을 실행한다.
	public static void main(String args[]) {
		//Exam_Method_1에 있는 aMethod() 함수를 호출한다.
		//100 : argument
		//; : 문장(statement) 종결
		Exam_Method_1.aMethod(100);

	} //end of main()
} //end of Exam_Method_1 class