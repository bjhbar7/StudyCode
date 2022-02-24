//package : keyword : ch1 에 Exam_Limit_1 class를 저장하시오.
// ; : 문장(statement) 종결
package ch1;

//public : keyword : 접근 제한자 : Access Modifier : 같은 패키지, 다른 패키지의 접근을 허용한다.
//class : 자바에서 가장 작은 단위의 파일 : 메모리에 올라가면 객체(Object)
public class Exam_Limit_1{

//public : 같은 패키지 , 다른 패키지의 main() 함수 접근을 허용한다.
//static : keyword : 변수, 함수 앞에 기술해서 JVM이 해당 resource를 메모리 위에 올려 둔다. 프로그램 종료시 해제된다.
//void :
//main() : console application main() 함수
//String : java.lang.String class : 문자열이 사용 가능한 자료형
//args : 변수
//[] : 배열
	public static void main(String args[]){
		/*
		int : type : 자료형(데이터형) : 변수의 타입을 int로 선언한다. 4 byte 정수 : 자바의 기본 type
		= : 대입 연산자
		Integer.MAX_VALUE : java.lang.Integer class에 존재하는 int형 MAX_VALUE 상수 : int의 최대값을 의미한다.
		Long.MAX_VALUE : java.lang.Long class에 존재하는 Long형 MAX_VALUE 상수 : Long의 최대값을 의미한다.
		; : 문장(statement) 종결
		*/
		int intMax = Integer.MAX_VALUE;
		long longMax = Long.MAX_VALUE;
		/*
			System : java.lang.System 클래스를 선언
					 System 클래스 자바에서 시스템에 관련된 기능을 모아둔 클래스 
					 System 클래스를 그냥 사용할 수 있는 이유는 
					 클래스가 final 클래스 이기 때문이다. 
			. : 링크 연산자 : System 클래스와  out 필드를 연결하는 연산자이다. 
			out : System 클래스에 있는 변수로 stream(output)을 출력하는 통로 역활을 하는 변수 
			. : out 필드와 println() 함수를 연결하는 링크 연산자 
			println() : console에 출력을 하는 함수 이다.
						print :  출력하시오
						ln : 라인을 하나 띄우세요 		
		*/
		// println() 함수에 아규먼트로 있는 데이터를 콘솔에 출력 하시오 
		System.out.println("Integer.MAX_VALUE : " + intMax);
		/*
			System : java.lang.System 클래스를 선언
					System 클래스 : 자바에서 시스탬에 관련된 기능을 모아둔 클래스
			. : 링크 연산자 : System 클래스와 out 필드를 연결하는 연산자이다.
			out : System 클래스에 있는 변수로 stream(output)을 출력하는 통로 역할을 하는 변수
			. : out 필드와 println() 함수를 연결하는 링크 연산자
			println() : console에 출력을 하는 함수이다.
						print : 출력하시오
						ln : 라인을 하나 띄우시오
			println() 함수에 argument로 있는 데이터를 콘솔에 출력하시오.
		*/
		System.out.println("Long.MAX_VALUE : " + longMax);

		/*
		int num1 = 9223372036854775807;
		System.out.println("int num1 : " + num1);

		long num2 = 9223372036854775807;
		System.out.println("long num2 : " + num2);
		*/
		/*
		C:\00.KOSMO108\10.JExam\ch1>javac -d . Exam_Limit.java
		Exam_Limit.java:14: error: integer number too large: 9223372036854775807
						int num1 = 9223372036854775807;
								   ^
		Exam_Limit.java:17: error: integer number too large: 9223372036854775807
						long num2 = 9223372036854775807;
									^
		2 errors
		*/
		
		// long type의 값은 정수L(l)로 기입한다.
		long num3 = 9223372036854775807L;
		System.out.println("long num3 : " + num3);

		long num4 = 9223372036854775807l;
		System.out.println("long num4 : " + num4);

	} //end of main()

} //end of Class