//package : keyword : 패키지 ch1에 class Exam_Integer_1을 저장한다.
//; : 문장(statement) 종결
package ch1;

//public : keyword : 접근 제한자 : Access Modifier : 다른 패키지, 같은 패키지 접근을 허용한다.
//class	 : keyword : 자바 파일을 만드는 최소 단위이다. 메모리에 올라가면 객체(Object)가 된다.
//Exam_Integer_1 class를 public 접근 제한자로 생성한다.
public class Exam_Integer_1{

/*	public : keyword : 접근 제한자 : Access Modifier : 다른 패키지, 같은 패키지 접근을 허용한다.
	static : keyword : 변수, 함수 앞에 기술해서 JVM이 해당 resource를 메모리 위에 올려 둔다. 프로그램 종료시 해제된다.
	void :
	main() : main 함수 : console application 을 하는 함수
	String : java.lang.String 클래스 : 문자열을 사용 가능하게 하는 자료형
	args : 변수
	[] : 배열
*/
	public static void main(String args[]){
	
	/* 
	Integer iByte = Integer.BYTES;
	System.out.println("int iByte >>> : " + iByte);
	boxing 되어있어서 사용 가능하나, 과거 버전(JDK 1.6 이전)부터 사용하던 규칙으로 int  로 사용한다. 
	*/
	
	/*
	1. int 데이터형(자료형)을 선언 : BYTES 변수의 데이터형(자료형)이 int 이기 때문에 
	2. int 형 데이터를 담을 변수명 intBytes 을 선언 : 변수명은 직관적으로 이해하기 쉽게 명명한다.
	3. = : 대입 연산자 선언 
	4. Integer.BYTES : int 형 데이터의 바이트 크기를 가지고 있는 Integer 래퍼 클래스의 BYTES 상수 이다. 
				 여기에  int 형 바이트 크기가 4 바이트로 초기화 되어 있다. 
	*/
	
	/*
	int : type : 데이터형(자료형) : 4 byte 크기의 변수 생성
	intBytes : 변수
	= : 대입 연산자
	Integer.BYTES	: int 형 데이터의 byte 크기를 가지고 있는 Integer Wrapper class의 BYTES 상수 이다.
	Integer.SIZE	: int 형 데이터의 byte 크기를 가지고 있는 Integer Wrapper class의 SIZE 상수 이다.
	Integer.MAX_VALUE	: int 형 데이터의 byte 크기를 가지고 있는 Integer Wrapper class의 MAX_VALUE 상수 이다.
	Integer.MIN_VALUE	: int 형 데이터의 byte 크기를 가지고 있는 Integer Wrapper class의 MIN_VALUE 상수 이다.
	; : 문장(statement) 종결
	*/
	int intBytes = Integer.BYTES;
	int intSize = Integer.SIZE;
	int intMax = Integer.MAX_VALUE;
	int intMin = Integer.MIN_VALUE;
	
	// System.out.println(); : 함수 내용을 문자열로 출력한다.
	// ; : 문장(statement) 종결
	System.out.println("Integer.BYTES 값 : " + intBytes);
	System.out.println("Integer.SIZE 값 : " + intSize);
	System.out.println("Integer.MAX_VALUE 값 : " + intMax);
	System.out.println("Integer.MIN-VALUE 값 : " + intMin);
	
	} //end of main()

} //end of Exam_Integer_1 class