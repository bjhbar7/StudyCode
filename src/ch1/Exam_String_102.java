//package : ch1 디렉토리에 Exam_String_102 클래스를 저장한다.
package ch1;
//public : 접근 제한자 : 다른 패키지, 같은 패키지에서의 class 접근을 허용한다.
//class : 자바의 최소 단위 : class는 함수 + 변수로 구성된다. : 2개의 함수로 구성되어있다.
public class Exam_String_102 {
	//public : 다른 패키지, 같은 패키지에서의 arrayTest() 함수의 접근을 허용한다.
	//void : 리턴값이 없을 경우 리턴형 자리에 사용한다.
	public void arrayTest() {
		//System.out.println(); : () 소괄호 안에 내용을 출력한다.
		System.out.println("Exam_String_102.arrayTest() 함수의 시작 >>>>>>");
		//char의 데이터 타입의 배열이다.
		char charArray[] = { 'a' , 'b' , 'c'};
		System.out.println("charArray의 주소값 : " + charArray);
		//charArray[0] : charArray 배열의 0번 index자리의 값
		System.out.println("charArray[0] : " + charArray[0]);
		//charArray[1] : charArray 배열의 1번 index자리의 값
		System.out.println("charArray[1] : " + charArray[1]);
		//charArray[2] : charArray 배열의 2번 index자리의 값
		System.out.println("charArray[2] : " + charArray[2]);
		// java.lang.System
		// public static int identityHashCode(Object x)
		System.out.println("System.indentityHashCode(charArray) : " + System.indentityHashCode(charArray));
		//String 클래스(문자열 클래스)를 인스턴스했다.
		String str = new String(charArray);
		System.out.println("str : " + str);
		System.out.println("System.indentityHashCode(str) : " + System.indentityHashCode(str));
		//String 클래스(문자열 클래스)를 인스턴스했다.
		String str1 = new String("abc");
		System.out.println("str1 : " + str1);
		System.out.println("System.indentityHashCode(str1) : " + System.indentityHashCode(str1));
		// String 참조변수 = ""; : 가장 많이 사용하는 방법이다.
		String str2 = "abc";
		System.out.println("str2 : " + str2);
		System.out.println("System.indentityHashCode(str2) : " + System.indentityHashCode(str2));


	}
	//콘솔 어플리케이션의 시작지점은 main() 함수이다. : 인터프리트 방식으로 진행한다.
	public static void main(String args[]){
		//new 연산자를 사용해서 Exam_String_102() 생성자의 arrayTest() 함수를 실행한다.
		new Exam_String_102().arrayTest();
	} //end of main()
} //end of Exam_String_102