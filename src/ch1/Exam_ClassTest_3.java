//package : keyword : ch1 디렉토리에 Exam_ClassTest_3을 저장한다.
//; : 문장(statement) 종결
package ch1;

//public : 접근 제한자 : Access Modifier : 같은 패키지, 다른 패키지에서 Exam_ClassTest_3 클래스의 접근을 허용한다.
//class : 자바에서 최소 단위 : class는 함수 + 변수로 구성되어 있다. : class가 메모리에 올라가면 객체(Object)가 된다.
public class Exam_ClassTest_3 {

	//멤버 변수
	//byte : 1byte 공간 : 정수 : 8 bit
	byte bVal;
	//char : 2byte 공간 : 문자
	char cVal;
	//short : 2byte 공간 : 정수
	short sVal;
	//int : 4byte 공간 : 정수
	int iVal;
	//long : 8byte 공간 : 정수
	long lVal;
	//float : 4byte 공간 : 실수
	float fVal;
	//double : 8byte 공간 : 실수
	double dVal;
	//boolean : 1byte 공간 : 참(true)과 거짓(false)을 저장
	boolean boolVal;
	//String : java.lang.String 클래스 : 문자열 클래스
	String strVal;
	//public : 접근 제한자 : Access Modifier : 같은 패키지, 다른 패키지에서 main() 함수의 접근을 허락한다.
	//static : 수정자 키워드 : 변수, 함수 앞에 기입하고 JVM가 해당 자원을 메모리 위로 올린다. 프로그램 종료시 해제된다.
	//void : 함수의 리턴값이 없을 경우 리턴형 자리에 기입한다.
	//main() : console application의 시작 지점이다. 인터프리트 방식으로 진행한다.
	//String : java.lang.String : 문자열 클래스
	public static void main(String args[]){
		//생성자가 메모리에 올라가면(인스턴트 되면) 해당 클래스에 있는 멤버 변수는 default값으로 초기화된다.
		//Exam_ClassTest_3() : 생성자
		//Exam_ClassTest_3 : 사용하려고 하는 클래스(빌트인 클래스 rt.jar에 있는 클래스, 사용자정의 클래스)
		//ec : 참조 변수 : reference variable : 참조 변수는 메모리에 올라간 클래스를 참조한다.
		//			클래스 블럭에 선언하 변수, 함수를 참조변수.(도트연산자)를 이용해서 사용할 수 있다.
		//new : keyword : 참조 변수를 선언할 때 사용한다.
		Exam_ClassTest_3 ec = new Exam_ClassTest_3();
		System.out.println("ec의 주소값 >>> :" + ec);
		System.out.println("ec의 bVal >>> :" + ec.bVal );
		System.out.println("ec의 cVal >>> :" + ec.cVal );
		System.out.println("ec의 sVal >>> :" + ec.sVal );
		System.out.println("ec의 iVal >>> :" + ec.iVal );
		System.out.println("ec의 lVal >>> :" + ec.lVal );
		System.out.println("ec의 fVal >>> :" + ec.fVal );
		System.out.println("ec의 dVal >>> :" + ec.dVal );
		System.out.println("ec의 boolVal >>> :" + ec.boolVal );
		System.out.println("ec의 strVal >>> :" + ec.strVal );

		Exam_ClassTest_3 ec_1 = new Exam_ClassTest_3();
		System.out.println("ec_1의 주소값 >>> :" + ec_1);
		System.out.println("ec_1의 bVal >>> :" + ec_1.bVal );
		System.out.println("ec_1의 cVal >>> :" + ec_1.cVal );
		System.out.println("ec_1의 sVal >>> :" + ec_1.sVal );
		System.out.println("ec_1의 iVal >>> :" + ec_1.iVal );
		System.out.println("ec_1의 lVal >>> :" + ec_1.lVal );
		System.out.println("ec_1의 fVal >>> :" + ec_1.fVal );
		System.out.println("ec_1의 dVal >>> :" + ec_1.dVal );
		System.out.println("ec_1의 boolVal >>> :" + ec_1.boolVal );
		System.out.println("ec_1의 strVal >>> :" + ec_1.strVal );

	}//end of main()
}//end of Exam_ClassTest_3