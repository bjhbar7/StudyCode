//package : keyword : ch1 디렉토리에 Exam_Var_4 클래스를 저장한다.
//; : 문장(statement) 종결
package ch1;
//public : 접근 제한자 : Access Modifier : 같은 패키지, 다른 패키지에서 Exam_Var_4 클래스에 접근하는 것을 허락한다.
//class : keyword : 자바에서 가장 작은 단위 : 메모리 위에 올라가면 객체(Object)가 된다. : class의 자원은 변수 + 함수이다.
public class Exam_Var_4 {
	//public : 접근 제한자 : Access Modifier : 같은 패키지, 다른 패키지에서 main() 함수의 접근을 허락한다.
	//static : 수정자 키워드 : 변수, 함수 앞에 작성하며 JVM이 해당 resource를 메모리 위에 올려둔다. 프로그램 종료시 해제된다.
	//void : 함수의 리턴값이 없을시 리턴형에 작성
	//java console application을 main() 함수로 시작한다.
	public static void main(String args[]){
		//System : java.lang.System
		//System.out.println(); : 소괄호()의 내용을 콘솔에 출력한다.
		System.out.println("Exam_Var_4.main() 함수 시작");
		System.out.println("인터프리트 방식으로 수행 된다.");
		System.out.println("main() 함수 블럭 왼쪽 부터 오른쪽 80컬럼 기준으로 수행된다.");
		//int : 자료형 : 4byte 공간
		//int 자료형의 변수 i를 선언하고 10으로 초기화한다.
		//i의 유효범위는 선언한 하위 라인부터 main() 블럭이 끝나는 라인까지 유효하다.
		//; : 문장(statement) 종결
		int i = 10;
		System.out.println("i >>> : " + i );
		//이름이 없는(익명) 블럭을 선언한다.
		{
			//int : 자료형 : 4byte 공간
			//int 자료형의 변수 ii를 선언하고 1000으로 초기화한다.
			//ii의 유효범위는 선언한 하위 라인부터 이름이 없는 블럭이 끝나는 라인까지 유효하다.
			int ii = 1000;
			System.out.println("ii >>> : " + ii);
			System.out.println("{}안에서 i >>> : " + i);
			//변수 i를 101으로 초기화한다.
			i = 101;
		} // end of 익명 블럭
		System.out.println("i >>> : " + i);
	} // end of main()
} // end of Exam_Var_4 class