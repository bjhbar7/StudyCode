//package : keyword : ch1 디렉토리에 Exam_For_901 class를 저장한다.
package ch1;

//public : 접근 제한자 : Access Modifier : 다른 패키지, 같은 패키지에서 class의 접근을 허용한다.
//class : 자바의 최소 단위 : class는 변수 + 함수로 구성되어있다. : Exam_For_901는 1개의 main() 함수로 구성되어있다.
public class Exam_For_901 {
	//public : 접근 제한자 : 다른 패키지, 같은 패키지에서 main() 함수의 접근을 허용한다.
	//static : 수정자 키워드 : 변수나 함수 앞에 기입하며 JVM이 프로그램이 시작하면 메모리 위에 올린다. 프로그램 종료시 해제된다.
	//void : 리턴값이 없는 함수에서 리턴형 위치에 기입한다.
	//main() : 콘솔 어플리케이션의 시작 지점이다. : interpreter 방식으로 진행한다.
	//String args[] : 명령행 인수
	//String : java.lang.String 클래스
	//args : 참조 변수
	//[] : 배열
	public static void main(String args[]) {
		
		//for 문 : from to loop : 반복문 : 특정 조건부터 특정 조건까지 반복한다.
		//for (초기화식, 조건식, 증감식) {수행할 표현식}
		for (int j = 1; j<10; j++) {
			for (int i = 2; i<6; i++) {
				/*
				static PrintStream	out : The "standard" output stream.
				public PrintStream format(String format,
                          Object... args)
				... : 배열을 의미한다.
				*/
				//%d : 정수형 출력
				//%2d : 2자리 정수형 출력
				System.out.format("%d * %d = %2d  ",i,j,i*j);
			}
			System.out.println();
		}
		System.out.println();

		for (int j = 1; j<10; j++) {
			for (int i = 6; i<10; i++) {
				/*
				static PrintStream	out : The "standard" output stream.
				public PrintStream printf(String format,
                          Object... args)
				*/
				System.out.printf("%d * %d = %2d  ",i,j,i*j);
			}
			System.out.println();
		}

		for (int i =1; i<10; i++) {
			for (int j =1; j<10; j++) {
				/*
				public static String format(String format,
                            Object... args)
				*/
				System.out.print(String.format("%d * %d = %2d  ",i,j,i*j));
			}
			System.out.println();
		}
	}//end of main()
}//end of Exam_For_901
/*
	서식 지정자 format specifier
		%d		정수형 출력
		%s		문자형 출력
		%f		실수형 출력
		%o		8진수 출력
		%x, %X	16진수 출력
		%e, %E	지수 출력
		%c		문자 출력
		%n		줄 바꿈
		%b		boolean 출력

*/