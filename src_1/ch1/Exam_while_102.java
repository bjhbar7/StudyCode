//package : keyword : ch1 디렉토리에 Exam_while_102 클래스를 저장한다.
package ch1;

/*
do while 구문 : while () 조건식이 false여도 do {} 표현식을 한 번은 실행한다.
			() 조건식에 false를 직접 입력해도 작동한다.
while 구문 : while () 조건식이 false면 실행을 안한다.
*/
//public : 접근 제한자 : Access Modifier : 다른 패키지, 같은 패키지에서 Exam_while_102 class의 접근 을 허용한다.
//class : 자바의 최소 단위 : class는 변수 + 함수로 구성되어 있다. : Exam_while_102는 1개의 함수로 구성되어있다.
public class Exam_while_102 {
	//자바 콘솔 어플리케이션의 시작 지점이다. : 인터프리트 방식으로 진행한다.
	public static void main(String args[]) {
		//지역 변수는 초기화를 해줘야 한다.
		//int : 자료형 : 4byte 공간 : 정수
		//int 형의 num 변수를 선언하고 1로 초기화한다.
		int num = 1;
		//int 형의 sum 변수를 선언하고 0으로 초기화한다.
		int sum = 0;
		//int 형의 count 변수를 선언하고 0으로 초기화한다.
		int count = 0;
		
		//do {} 를 실행 후 while () 조건이 true이면 반복을 하고 () 조건이 false이면 끝낸다.
		do {
			//sum 변수에 num 값을 더한 후 저장한다.
			sum += num;
			//num 변수에 +1을 한다.
			num++;
			//count 변수에 +1을 한다.
			count++;
		}
		while (num <= 10);
		//while (num >= 10); :() 조건문이 false여서 do {}이 한 번만 실행된다.
		//System : java.lang.System class
		//System.out.println(); : () 속 내용을 출력한다.
		System.out.println(count+"번 더한 결과는 >>>> : " + sum);
	} //end of main()
} //end of Exam_while_102