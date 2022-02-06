//package : keyword : ch1 디렉토리 내에 Exam_Method_5 클래스를 저장한다.
package ch1;

//public : 접근 제한자 : Access Modifier : Exam_method_5 class를 다른 패키지(디렉토리), 같은 패키지(디렉토리)에서 접근할 수 있다.
//class : 자바에서 가장 작은 단위 : 메모리 위에 올라가면 객체(Object)가 된다. : class의 자원은 변수 + 함수이다.
//Exam_Method_5 class의 함수 4개 : main() 함수 1개 + 사용자 정의 함수 3개
public class Exam_Method_5 {
	//static : 수정자 키워드 : 변수, 함수 앞에 기술하며 JVM이 해당 resource를 메모리 위에 올려 둔다. 프로그램 종료 시 해제 된다.
	//int : 자료형 : 4byte 크기의 공간
	//int : 리턴형 : int 자료형의 리턴형 : 함수의 리턴형과 return 키워드 뒤에 오는 데이터형은 동일 해야 한다.
	//static int addMethod() : static 함수 addMethod()를 사용하여 int 자료형 값을 얻는다. 
	static int addMethod(){
		//System : java.lang.System 클래스
		//System.out.println(); 은 addMethod() 함수 블럭 내에 있지만, 리턴 대상이 아니다. : println()의 내용을 출력하는 명령문이다.
		System.out.println("Exam_Method_5 클래스에 있는 addMethod() 메소드(함수) ");
		//int : 자료형 : 4 byte 공간
		//int a = 1 : 4 byte 공간의 변수 a를 선언하고 1로 초기화한다.
		//; : 문장(statement) 종결
		int a = 1;
		int b = 2;
		//return a + b : 리턴값 a + b를 리턴한다.
		//리턴값 a + b의 데이터 형과 addMethod() 선언부에 있는 int 리턴형은 데이터 형은 항시 동일해야 한다.
		//; : 문장(statement) 종결
		return a + b;
	}
	//default : keyword : 접근 제한자 : Exam_Method_5의 aM() 함수를 같은 패키지에서만 호출이 가능하다.
	//static : 수정자 키워드 : 변수, 함수 앞에 기술하며 JVM이 해당 resource를 메모리 위에 올려 둔다. 프로그램 종료 시 해제 된다.
	//void : 리턴값이 없는 함수에서 선언부에 데이터 형으로 사용한다.
	//static void aM() : 같은 패키지 내에서만 호출 가능한 리턴형이 void인(없는) static aM() 함수를 선언한다.
	static void aM(){
		//System : java.lang.System 클래스
		//System.out.println(); 은 aM() 함수 블럭 내에 있지만, 리턴 대상이 아니다. : println()의 내용을 출력하는 명령문이다.
		//; : 문장(statement) 종결
		System.out.println("Exam_Method_5 클래스에 있는 aM() 메소드(함수) ");
	}
	//public : keyword : 접근 제한자 : Exam_Method_5의 bM() 함수를 같은 패키지, 다른 패키지에서 호출이 가능하다.
	//static : 수정자 키워드 : 변수, 함수 앞에 기술하며 JVM이 해당 resource를 메모리 위에 올려 둔다. 프로그램 종료 시 해제 된다.
	//void : 리턴값이 없는 함수에서 선언부에 데이터 형으로 사용한다.
	//public static void bM() : 같은 패키지, 다른 패키지에서 호출 가능한 리턴형이 void인(없는) static bM() 함수를 선언한다.
	public static void bM(){
		//System : java.lang.System 클래스
		//System.out.println(); 은 bM() 함수 블럭 내에 있지만, 리턴 대상이 아니다. : println()의 내용을 출력하는 명령문이다.
		System.out.println("Exam_Method_5 클래스에 있는 bM() 메소스(함수) ");		
	}
	//public : keyword : 접근 제한자 : 같은 패키지, 다른 패키지에서 main() 함수을 호출 가능하게 한다.
	//static : 수정자 키워드 : 변수, 함수 앞에 기술하며 JVM이 해당 resource를 메모리 위에 올려 둔다. 프로그램 종료 시 해제 된다.
	//void : 리턴형 : 리턴값이 없는 함수에서 선언부에 데이터 형으로 사용한다.
	//main() : 자바 콘솔 어플리케이션은 main() 함수부터 시작된다. : 자바는 인터프리트(interprite)방식으로 수행되는데, 함수 블럭 안에서만 인터프리트 방식으로 수행된다.
	public static void main(String args[]){
		//System : java.lang.System 클래스
		//System.out.println(); 은 내용을 출력하는 명령문이다.
		// "/n" : 연산자 : 한 줄 건너 뛴다.
		//; : 문장(statement) 종결
		System.out.println("Exam_Method_5 클래스에 있는 main() 메소드(함수) /n");

		System.out.println("리턴형이 있는 함수는 리턴 값을 받는 변수를 선언해서 사용한다. ");
		//int : 자료형 : 4 byte 크기의 공간
		// 리턴형이 있는 함수(Exam.Method_5.addMethod())는 리턴 값을 받는 변수를 선언해서 사용한다.
		int sum = Exam_Method_5.addMethod();
		System.out.println("int sum = " + sum + "/n");

		System.out.println("리턴형이 void인 함수(리턴 값이 없는 함수, return 키워드가 없는 함수)는");
		System.out.println("리턴값을 받는 변수를 사용하지 않는다. 그냥 함수만 호출해서 사용한다.");
		// 리턴형이 없는 함수(Exam.Method_5.aM())는 리턴 값을 받는 변수를 사용하지 않고 함수만 호출해서 사용한다.
		Exam_Method_5.aM();
	} // end of main()
} // end of Exam_Method_5 class