//package : keyword : class를 package ch1 하위에 저장한다.
// ; : statement 종결
package ch1;
/*
import java.lang.* 는 생략가능
*/

//public : 접근 제한자 : Access Modifier : keyword : 다른 패키지, 같은 패키지에서의 사용(접근)을 허락한다. : class에 접근
//class : keyword : 자바 프로그램을 만드는 최소 단위 : 메모리에 들어가면 객체(Object)가 된다.
public class Exam_Var_2 {

/*	public : 접근 제한자 : Access Modifier : keyword : 다른 패키지, 같은 패키지에서의 사용(접근)을 허락한다. : main() 함수에 접근
	static :
	void :
	main () : 콘솔 어플리케이션 main() 함수
	String : java.lang.String class
	args : 변수
	[] : 배열
*/
	public static void main(String args[]){
	
	/*	int : 자료형 (type) : 4byte 공간
		System : java.lang.System class
		. : 도트 연산자
		out : public static final PrintStream out
		println() : println methods in class PrintStream
		level : int type의 메모리 공간이 할당된 변수
		= : 대입 연산자
		; : 문장(statement) 종결
		int level = 10; : 변수 'level' 를 int type으로 선언하고 10으로 초기화
	*/
		int level = 10;
		System.out.println(level);
	// int : 자료형 : 데이터형 (type) : 4byte 공간
	// i : int type의 메모리 공간이 할당된 변수
	// ; : 문장(statement) 종결
	// int i; : 변수 'i' 를 int type으로 선언
		int i;
	/*	System.out.println(i);
		변수를 선언하고 초기화 하지 않으면 사용불가
	*/
	// = : 대입 연산자
	// i = 100; : 변수 'i' 를 100으로 초기화한다.
	// ; : 문장(statement) 종결
		i = 100;
		System.out.println(i);

	}

}