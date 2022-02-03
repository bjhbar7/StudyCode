//package : keyword : a.b.c.ch1에 Exam_Method_3 class 를 저장한다.
//; : 문장(statement) 종결
package ch1;

//public : 접근 제한자 : Access Modifier : Exam_Method_3 class를 다른 패키지, 같은 패키지에서 접근 가능하게 한다.
//class : 자바에서 가장 작은 단위 : 메모리 위에 올라가면 객체(Object)가 된다.
//public class Exam_Method_3 {} : Exam_Method_3 class를 생성한다.
public class Exam_Method_3 {

	//public : 접근 제한자 : Access Modifier : 함수 aM()를 다른 패키지, 같은 패키지에서 접근 가능하게 한다.
	//static : 수정자 키워드 : 변수, 함수 앞에 기술하며 JVM이 해당 resource를 메모리 위에 올려 둔다. 프로그램 종료시 해제된다.
	//void : 리턴형 : aM() 함수의 리턴값이 없을 때 사용한다.
	//public static void aM() : 리턴값이 없는 정적 aM() 함수를 선언한다.
	public static void aM(){
		//System : java.lang.System 클래스 호출
		//. : 도트 연산자 : 링크 연산자
		//out : 
		//println :
		//System.out.println() : println() 함수 안의 내용을 console로 출력한다.
		//; : 문장(statement) 종결
		System.out.println("aM() method 함수");
		System.out.println("aM() method 함수 블럭 두 번째 라인에서 bM() 함수 호출을 한다.");
	}
	//public : 접근 제한자 : Access Modifier : 함수 bM()를 다른 패키지, 같은 패키지에서 접근 가능하게 한다.
	//static : 수정자 키워드 : 변수, 함수 앞에 기술하며 JVM이 해당 resource를 메모리 위에 올려 둔다. 프로그램 종료시 해제된다.
	//void : 리턴형 : bM() 함수의 리턴값이 없을 때 사용한다.
	//public static void bM() : 리턴값이 없는 정적 bM() 함수를 선언한다.
	public static void bM(){
		//System : java.lang.System 클래스 호출
		//System.out.println() : println() 함수 안에 내용을 console로 출력한다.
		//; : 문장(statement) 종결
		System.out.println("bM() method 함수");
	}
	//public : 접근 제한자 : Access Modifier : 함수 cM()를 다른 패키지, 같은 패키지에서 접근 가능하게 한다.
	//static : 수정자 키워드 : 변수, 함수 앞에 기술하며 JVM이 해당 resource를 메모리 위에 올려 둔다. 프로그램 종료시 해제된다.
	//void : 리턴형 : cM() 함수의 리턴값이 없을 때 사용한다.
	//public static void cM() : 리턴값이 없는 정적 cM() 함수를 선언한다.
	public static void cM(){
		//System : java.lang.System 클래스 호출
		//System.out.println() : println() 함수 안에 내용을 console로 출력한다.
		//; : 문장(statement) 종결
		System.out.println("cM() method 함수");
	}
	//public : 접근 제한자 : Access Modifier : main() 함수를 다른 패키지, 같은 패키지에서 접근 가능하게 한다.
	//static : 수정자 키워드 : 변수, 함수 앞에 기술하며 JVM이 해당 resource를 메모리 위에 올려 둔다. 프로그램 종료시 해제된다.
	//void : 리턴형 : main() 함수의 리턴값이 없으므로 사용한다.
	//public static void main(String args[]) : console application의 main() 함수를 실행한다.
	//String : 자료형 : java.lang.String 클래스 호출, 문자열을 변수에 저장 가능하게 한다.
	public static void main(String args[]){
		//System : java.lang.System 클래스 호출
		//System.out.println() : println() 함수 안에 내용을 console로 출력한다.
		//; : 문장(statement) 종결
		//"" : "" 사이에 내용을 문자열
		System.out.println("첫 번째 라인에서 Exam_Method_3 클래스 블럭에 있는 main() 함수 시작 >>> : ");
		System.out.println("두 번째 라인에서 Exam_Method_3 클래스 블럭에 있는 aM() 함수를 호출한다. >>> : ");
		System.out.println("aM() 함수 블럭의 첫 번째 라인이 수행된다. >>> : ");
		//Exam_Method_3.aM() : Exam_Method_3 클래스의 aM() 함수를 호출한다.
		//; : 문장(statement) 종결
		Exam_Method_3.aM();
		//System : java.lang.System 클래스 호출
		//System.out.println() : println() 함수 안에 내용을 console로 출력한다.
		//; : 문장(statement) 종결
		System.out.println("세 번째 라인에서 Exam_Method_3 클래스 블럭에 있는 cM() 함수를 호출한다. >>> : ");
		System.out.println("cM() 함수 블럭의 첫 번째 라인이 수행된다. >>> : ");
		//Exam_Method_3.cM() : Exam_Method_3 클래스의 cM() 함수를 호출한다.
		//; : 문장(statement) 종결
		Exam_Method_3.cM();
		System.out.println("네 번째 라인에서 Exam_Method_3 클래스 블럭에 있는 bM() 함수를 호출한다. >>> : ");
		System.out.println("bM() 함수 블럭의 첫 번째 라인이 수행된다. >>> : ");
		//Exam_Method_3.bM() : Exam_Method_3 클래스의 bM() 함수를 호출한다.
		//; : 문장(statement) 종결
		Exam_Method_3.bM();
	} // end of main()
} // end of Exam_Method_3 class
