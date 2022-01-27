// package 키워드 사용 : ch1 위치에 class 저장 
//	(;) 사용 , 자바 소스 최상단에 기입
//; : 문장 종결 : statement() 종결 하기 
package ch1;

//public 접근제한자 : package의 접근을 제한하는 키워드 ( public : 다른 package, 같은 package 사용가능 ) : 클래스에서 사용
//class 키워드 : 자바에서 프로그램을 만드는 최소 단위 : 메모리에 저장할 때 객체(Object)가 된다 
//클래스명 : 첫문자 대문자, 파일명과 동일
public class Exam_Variable_1 {

/*	public 접근 제한자 : package의 접근을 제한하는 키워드 ( public : 다른 package , 같은 package 사용가능 ): main 메소드에 사용
static 
void
main : main() 함수 : 콘솔 어플리케이션을 의미한다.
String : 문자열
args : 변수
[] : 배열
*/ 
public static void main(String args[]){

/*	System : API
. : 도트 연산자 : 링크 연산자
out : API
println() : API
(;) 사용
*/
System.out.println("Exam_Variable_1");

/*	int : 기초 자료형 ( primitive type )
i : 변수
= : 대입 연산자
10 : 값 variable data 선언
(;) 사용
*/
int i = 10;

/*	System : API
. : 도트 연산자 : 링크 연산자
out : API
println : API : 함수
i : 변수
(;) 사용
*/
System.out.println("Exam_Variable_1 >>>" + i);	

} // end of main()

} // end of 일반 클라스 Exam_Variable_1

/*	컴파일 후 실행하는 법
윈도우키 > 윈도우키 + "r" > cmd > cd / > file.java 이 있는 폴더 찾아가기 (ex) cd 0*R/1*m/ch1 ) 
> javac -d . file.java > type file.java 로 package 확인 ( Name space 확인 ) > java package.className
*/

