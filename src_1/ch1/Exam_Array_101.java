//package : ch1 디렉토리에 Exam_Array_101 class를 저장한다.
package ch1;

public class Exam_Array_101 {

	public static void main(String args[]) {
		
		//int형 1차원 배열을 선언한다.
		//int는 기초자료형인데 배열로 선언하면 객체로 변한다.
		//자료형 참조변수[] = new 자료형[배열의 길이];
		//new : 인스턴스 연산자 선언
		//JVM이 int[3] 구문을 보고 int형 데이터 상자 3개를 생성하고 default 값으로 초기화한다.
		//각 상자에 int형의 디폴트값이 0이 초기화 된다.
		int iReferenceVariable[] = new int[3];
		System.out.println("iReferenceVariable[]의 주소값 : " + iReferenceVariable);

		int iVal0 = iReferenceVariable[0];
		System.out.println("iReferenceVariable[0] >>>> : " + iVal0);
		int iVal1 = iReferenceVariable[1];
		System.out.println("iReferenceVariable[1] >>>> : " + iVal1);
		int iVal2 = iReferenceVariable[2];
		System.out.println("iReferenceVariable[2] >>>> : " + iVal2);
		
		//double형 2차원 배열을 선언한다.
		//double는 기초자료형인데 배열로 선언하면 객체로 변한다.
		//new double[3][2] : 앞 [] 배열은 행을 의미하고 뒤 [] 배열은 열을 의미한다.
		double dReferenceVariable[][] = new double[3][2];
		System.out.println("dReferenceVariable[]의 주소값 : " + dReferenceVariable);
		
		double dVal00 = dReferenceVariable[0][0];
		System.out.println("dReferenceVariable[0][0] >>> : " + dVal00);
		double dVal01 = dReferenceVariable[0][1];
		System.out.println("dReferenceVariable[0][1] >>> : " + dVal01);
		double dVal02 = dReferenceVariable[0][2];
		System.out.println("dReferenceVariable[0][2] >>> : " + dVal02);
		double dVal10 = dReferenceVariable[1][0];
		System.out.println("dReferenceVariable[1][0] >>> : " + dVal10);
		double dVal11 = dReferenceVariable[1][1];
		System.out.println("dReferenceVariable[1][1] >>> : " + dVal11);
		double dVal20 = dReferenceVariable[2][0];
		System.out.println("dReferenceVariable[2][0] >>> : " + dVal20);
		double dVal21 = dReferenceVariable[2][1];
		System.out.println("dReferenceVariable[2][1] >>> : " + dVal21);
		double dVal22 = dReferenceVariable[2][2];
		System.out.println("dReferenceVariable[2][2] >>> : " + dVal22);
	} // end of main()
} // end of Exam_Array_101