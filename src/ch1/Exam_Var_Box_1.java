// package : 키워드 : ch1 위치에 class 저장
// ; : 문장 종결 : statement() 종결 하기
package ch1;

/*	java.lang 패키지에 있는 Integer 클래스를 가져와서 Exam_Var_Box 클래스에서 사용한다.
java.lang 패키지는 가장 기본적인 클래스들이기에 자바엔진에서 import 키워드를 사용해서 불러오지 않아도 사용할 수 있게 만들었다.
java.lang.* 패키지 이외의 다른 자원들은 무조건 import 키워드를 불러와야 한다.
import java.lang.Integer;
*/

// public : 키워드 : 접근제한자 : package의 접근을 제한하는 키워드( public : 다른 package, 같은 package에서 접근 가능 )
// class : 키워드 : 자바에서 파일을 만드는 최소 단위이다. 메모리에 들어가면 객체(Object)가 된다.
public class Exam_Var_Box_1 {

/*	public : 키워드 : 접근제한자 : package의 접근을 제한하는 키워드 ( public : 다른 package, 같은 package에서 접근 가능)
	static
	void
	main() : 콘솔 어플리케이션을 의미한다. 프로그램에 반드시 있어야한다.
	String : 문자열 API
	args : 변수
	[] : 배열
*/
	public static void main(String args[]){

/*	System : API
	. : 도트 연산자 : 링크 연산자
	out : API
	println() : API
	"" : 문자열
	+ : 덧셈 기호
	Integer : API
	toBinaryString() : API
	toOctalString() : API
	toHexString() : API
	\n : 줄바꿈 기호
	; : 문장 종결 : statement() 종결하기
*/
		System.out.println("십진수 (1) -> 이진수 : " + Integer.toBinaryString(1));
		System.out.println("십진수 (2) -> 이진수 : " + Integer.toBinaryString(2));
		System.out.println("십진수 (3) -> 이진수 : " + Integer.toBinaryString(3));
		System.out.println("십진수 (4) -> 이진수 : " + Integer.toBinaryString(4));
		System.out.println("십진수 (5) -> 이진수 : " + Integer.toBinaryString(5));
		System.out.println("십진수 (6) -> 이진수 : " + Integer.toBinaryString(6));
		System.out.println("십진수 (7) -> 이진수 : " + Integer.toBinaryString(7));
		System.out.println("십진수 (8) -> 이진수 : " + Integer.toBinaryString(8));
		System.out.println("십진수 (9) -> 이진수 : " + Integer.toBinaryString(9));
		System.out.println("십진수 (10) -> 이진수 : " + Integer.toBinaryString(10));
		System.out.println("\n");
		System.out.println("십진수 (1) -> 팔진수 : " + Integer.toOctalString(1));
		System.out.println("십진수 (1) -> 십육진수 : " + Integer.toHexString(1));
		System.out.println("십진수 (2) -> 팔진수 : " + Integer.toOctalString(2));
		System.out.println("십진수 (2) -> 십육진수 : " + Integer.toHexString(2));
		System.out.println("십진수 (3) -> 팔진수 : " + Integer.toOctalString(3));
		System.out.println("십진수 (3) -> 십육진수 : " + Integer.toHexString(3));
		System.out.println("십진수 (4) -> 팔진수 : " + Integer.toOctalString(4));
		System.out.println("십진수 (4) -> 십육진수 : " + Integer.toHexString(4));
		System.out.println("십진수 (5) -> 팔진수 : " + Integer.toOctalString(5));
		System.out.println("십진수 (5) -> 십육진수 : " + Integer.toHexString(5));
		System.out.println("십진수 (6) -> 팔진수 : " + Integer.toOctalString(6));
		System.out.println("십진수 (6) -> 십육진수 : " + Integer.toHexString(6));
		System.out.println("십진수 (7) -> 팔진수 : " + Integer.toOctalString(7));
		System.out.println("십진수 (7) -> 십육진수 : " + Integer.toHexString(7));
		System.out.println("십진수 (8) -> 팔진수 : " + Integer.toOctalString(8));
		System.out.println("십진수 (8) -> 십육진수 :" + Integer.toHexString(8));
		System.out.println("\n");
		System.out.println("십진수 (9) -> 팔진수 : " + Integer.toOctalString(9));
		System.out.println("십진수 (9) -> 십육진수 : " + Integer.toHexString(9));
		System.out.println("십진수 (10) -> 팔진수 : " + Integer.toOctalString(10));
		System.out.println("십진수 (10) -> 십육진수 : " + Integer.toHexString(10));
		System.out.println("\n");
		System.out.println("십진수 (11) -> 이진수 : " + Integer.toBinaryString(11));
		System.out.println("십진수 (11) -> 팔진수 : " + Integer.toOctalString(11));
		System.out.println("십진수 (11) -> 십육진수 : " + Integer.toHexString(11));
		System.out.println("\n");
		System.out.println("십진수 (12) -> 이진수 : " + Integer.toBinaryString(12));
		System.out.println("십진수 (12) -> 팔진수 : " + Integer.toOctalString(12));
		System.out.println("십진수 (12) -> 십육진수 : " + Integer.toHexString(12));
		System.out.println("\n");
		System.out.println("십진수 (13) -> 이진수 : " + Integer.toBinaryString(13));
		System.out.println("십진수 (13) -> 팔진수 : " + Integer.toOctalString(13));
		System.out.println("십진수 (13) -> 십육진수 : " + Integer.toHexString(13));
		System.out.println("\n");
		System.out.println("십진수 (14) -> 이진수 : " + Integer.toBinaryString(14));
		System.out.println("십진수 (14) -> 팔진수 : " + Integer.toOctalString(14));
		System.out.println("십진수 (14) -> 십육진수 : " + Integer.toHexString(14));
		System.out.println("\n");
		System.out.println("십진수 (15) -> 이진수 : " + Integer.toBinaryString(15));
		System.out.println("십진수 (15) -> 팔진수 : " + Integer.toOctalString(15));
		System.out.println("십진수 (15) -> 십육진수 : " + Integer.toHexString(15));
		System.out.println("\n");
		System.out.println("십진수 (16) -> 이진수 : " + Integer.toBinaryString(16));
		System.out.println("십진수 (16) -> 팔진수 : " + Integer.toOctalString(16));
		System.out.println("십진수 (16) -> 십육진수 : " + Integer.toHexString(16));
	
	} // end of main()

} // end of 일반 클래스 Exam_Var_Box_1
