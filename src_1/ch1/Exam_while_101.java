//package : keyword :ch1 디렉토리에 Exam_while_101 class를 저장한다.
package ch1;

//반복문 : for, while 문에 직접 false 사용이 불가능하다.
//조건문 : if 문에 직접 false 사용이 가능하다.
public class Exam_while_101 {
	//콘솔 어플리케이션의 시작 지점이다. : 인터프리트 방식으로 진행한다.
	public static void main(String args[]) {
	

		/*
		for ( ; ; ) {
		} 
		for 문은 for 뒤에 ()만 있어도 반복이 된다.
		*/
		/*
		while () {
		}
		while 문은 ()만 있으면 실행이 안된다.

		while (false) {
		}
		while 문은 ()안에 false 사용이 불가능하다
		*/
		//boolean : 자료형 : 1byte 공간 : true 나 false를 저장한다.
		boolean bool = false;
		//while : keyword : 반복문 () 속에 조건식이 true이면 while문을 반복한다. : () 속에 false를 직접 사용 불가능하다.
		while (bool) {
			System.out.println(">>>>>>>");
		}
		//int : 자료형 : 4byte 공간 : 정수 
		//지역변수 : 초기화를 해서 사용해준다.
		int num = 1;
		int sum = 0;
		int count = 0;
		//while : keyword : 반복문 :() 속에 조건식이 true면 while문을 반복한다. 
		while (num <= 10) {
			
			//증감식 : 변수에 +1를 한다.
			count++;
			//+= : 변수에 값을 더한 후 저장한다.
			sum += num;
			
			System.out.println(count+"번째까지의 sum의 값은 : " + sum);
			//if : 조건문 : () 속에 조건식이 true면 if문을 실행한다.
			if (sum > 20) {
				//break : while 반복문을 나가는 키워드
				break;
			}
			//증감식 : 변수에 +1를 한다.
			num++;
			
		}
		//System : java.lang.System class
		//System.out.println(); : ()속 내용을 출력한다.
		System.out.println("1부터 " + count + "까지 합은 " + sum + "입니다.");
		System.out.println(count + "번 계산했습니다.");

	} // end of main()
} // end of Exam_while_101