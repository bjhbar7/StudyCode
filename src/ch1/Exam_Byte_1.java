//package : keyword : ch1에 Exam_Byte_1 클래스를 둔다. 
// ; : 문장(statement) 종결
package ch1;

// public : 접속 제한자 : Access Modifier : 같은, 다른 package에서 class 접근 허용
// class : keyword : 자바 프로그램을 만드는 최소 단위 : 메모리 위로 올라가면 Object로 변한다.
public class Exam_Byte_1 {

/*	public : 접속 제한자 : keyword : Access Modifier : 같은, 다른 package에서 main() 함수의 접근 허용
	static :
	void :
	main() : console application main() 함수
	String : java.lang.String class
	args : 변수
	[] : 배열
*/
	public static void main(String args[]){
	
	// System.out.println() : java.lang.System 클래스에 있는 console 출력 함수
	// Byte : Wrapper 클래스 : java.lang.Byte 클래스
	// . : 도트 연산자 : 링크 연산자
	// BYTES : byte를 확인
	// SIZE : bit를 확인
	// ; : 문장(statement) 종결
		System.out.println("byte의 크기는 1 바이트 >>> :" + Byte.BYTES);
		System.out.println("byte의 사이즈 8 비트 >>> :" + Byte.SIZE);
	// byte : keyword : 자료형, 데이터형 (type) : 1byte 공간
	// bMax : 변수
	// Byte : Wrapper 클래스 : java.lang.Byte 클래스
	// 
		byte bMax = Byte.MAX_VALUE;
		System.out.println("byte의 최대값 :: Byte.MAX_VALUE >>> :" + bMax);
			
		byte bMin = Byte.MIN_VALUE;
		System.out.println("byte의 최소값 :: Byte.MIN_VALUE >>> :" + bMin);
	}

}
/*	컴파일 후 실행하는 법
윈도우키 > 윈도우키 + "r" > cmd > cd / > file.java 이 있는 폴더 찾아가기 (ex) cd 0*R/1*m/ch1 ) 
> javac -d . file.java > type file.java 로 package 확인 ( Name space 확인 ) > java package.className
*/