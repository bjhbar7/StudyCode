//package : keyword : a.b.c.ch1 디렉토리에 Exam_Method_7 클래스 저장한다.
package ch1;

//public : 접근 제한자 : Access Modifier : 다른 패키지, 같은 패키지에서의 접근을 허락한다.
//class : 자바에서 가장 작은 단위 : 메모리 위에 올라가면 객체(Object)가 된다. : class의 자원은 변수 + 함수이다.
//public class Exam_Method_7 : 같은 패키지, 다른 패키지에서 접근이 가능한 Exam_Method_7를 생성한다. : 함수 2개 : 사용자 정의 함수 1개 + main() 함수 1개
public class Exam_Method_7 {
	//static : 수정자 키워드 : 변수, 함수 앞에 기술되며 JVM이 해당 resource를 메모리 위에 올려 둔다. 프로그램 종료시 해제 된다.
	//int : 리턴형 : int 자료형의 리턴형 : 함수의 리턴형과 return 뒤에 오는 변수의 데이터 형은 동일해야한다.
	//static int addMethod(int x, int y) : int x, int y를 매개 변수(parameter)를 갖은 addMethod()를 사용하여 int 리턴형의 값을 얻는다. 
	static int addMethod(int x, int y) {
		//System : java.lang.System 클래스
		//System.out.println(); 은 함수 블럭 내에 있지만, 리턴 대상이 아니다. println()은 내용을 출력하는 명령문이다.
		System.out.println("Exam_Method_7 클래스에 있는 addMethod() 메소드(함수) ");
		//int : 자료형 : 4 byte의 공간
		//int addSum = x + y; : int 자료형의 공간을 갖은 변수 addSum을 int x 와 int y를 더한 값으로 초기화한다.
		int addSum = x + y;
		//return addSum; : addSum 변수를 리턴값으로 리턴한다. 
		return addSum;
	}
	//public : 접근 제한자 : Access Modifier : 다른 패키지, 같은 패키지가 main() 함수에 접근하는 것을 허락한다.
	//static : 수정자 키워드 : 변수, 함수 앞에 기술되며 JVM이 해당 resource를 메모리 위에 올려 둔다. 프로그램 종료시 해제 된다.
	//void : 리턴형 : 리턴값이 없는 함수에서 데이터 형으로 사용한다.
	//public static void main(String args[]) : console application을 실행한다. : 자바는 main() 부터 시작하며 함수 블럭 내에서 인터프리트(interprite) 방식으로 수행한다.
	public static void main(String args[]){
		System.out.println("Exam_Method_7 클래스에 있는 main() 메소드(함수) /n");
		// argument 변수명 addMethod(a,b)와 parameter 변수명 addMethod(int x,int y)는 동일하지 않아도 된다.
		// int : 자료형 : 4 byte 공간
		// int 자료형의 공간을 갖은 sum 변수를 선언하고 Exam_Method_7.addMethod(1,2)를 호출하여 초기화한다.
		int sum = Exam_Method_7.addMethod(1,2);
		System.out.println("Exam_Method_7.addMethod(1,2) >>> : " + sum + "/n");
		//int a = 1; : int 자료형의 변수 a 를 1로 초기화하고 선언한다.
		int a = 1;
		//int b = 2; : int 자료형의 변수 b 를 2로 초기화하고 선언한다.
		int b = 2;

		int sum_1 = Exam_Method_7.addMethod(a,b);
		System.out.println("Exam_Method_7.addMethod(1,2) >>> : " + sum_1 + "/n");

		System.out.println("Exam_Method_7.addMethod(1,2) >>> : " + Exam_Method_7.addMethod(1,2) + "/n");

		System.out.println("Exam_Method_7.addMethod(1,2) >>> : " + Exam_Method_7.addMethod(a,b));
	} //end of main()
} //end of Exam_Method_7 class