//package : keyword : ch1 디렉토리에 Exam_For_603 클래스를 저장한다.
//; : 문장(statement) 종결
package ch1;

//import : 사용하고 싶은 클래스를 불러내기 위해서 사용하는 키워드 : 패키지명.클래스명 으로 사용한다.
import java.util.Scanner;

//public : 접근 제한자 : Access Modifier : 같은 패키지, 다른 패키지에서 class의 접근을 허용한다.
//class : 자바의 최소 단위 : class는 변수 + 함수로 구성되어있다.
public class Exam_For_603 {

	//public : 접근 제한자 : 같은 패키지, 다른 패키지에서 함수의 접근을 허용한다.
	//void : 함수의 리턴값이 없을 때 리턴형 위치에 사용한다.
	//String : java.lang.String : 문자열을 표현할 수 있게하는 클래스
	//(String str) : parameter : 매개 변수 
	public void toHex_Str(String str) {
		System.out.println("Exam_For_6.toHex_Str() 함수 진입 >>> : ");
		//str != null && str.length() >0 : str변수가 null가 아니고, str.length()가 0이 아니면 true(참)이다.
		if(str !=null && str.length() >0) {
			//char : 자료형 : 1byte : 양의 정수 : 문자
			//char형 변수 c를 선언 후 ' '(빈 문자)로 초기화한다.
			char c = ' ';
			//for : keyword : from to loop : 특정 조건부터 특정 조건까지 반복한다.
			for (int i = 0; i < str.length(); i++) 	{	
				//public char charAt(int index)
				//index = 0 에 있는 String 문자열을 char형으로 바꾼다.
				c =  str.charAt(0);
				System.out.print(c + " ");
				//public static String toHexString(int i)
				//int 형 숫자를 16진수로 표현한다.
				System.out.print("0x" + Integer.toHexString(c) + " ");
				System.out.println();
			}
		}
	}


	public static void main(String args[]) {
	
		// 영문자 소문자
		String s0 = "abcdefghijklmnopqrstuvwxyz";
		// 영문자 대문자 
		// public String toUpperCase()
		String s1 = s0.toUpperCase();
		// 숫자 
		String s2 = "0123456789";
		// 연산기호
		String s3 = "*+-/";
		// 특수 문자
		String s4 = "!@#%%^&*";
		
		System.out.println(   "1 : 영문자 소문자 \n"
							+ "2 : 영문자 대문자 \n"
							+ "3 : 숫자 \n"
							+ "4 : 연산 기호 \n"
							+ "5 : 특수 문자 \n"
							+ "를 입력하시오 ");
		
		
		/*
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		*/
		Scanner sc = new Scanner(System.in);
		int iVal = sc.nextInt();

		if (1 == iVal) {
			new Exam_For_603().toHex_Str(s0);
		}
		if (2 == iVal) {
			new Exam_For_603().toHex_Str(s1);
		}
		if (3 == iVal) {
			new Exam_For_603().toHex_Str(s2);
		}
		if (4 == iVal) {
			new Exam_For_603().toHex_Str(s3);
		}
		if (5 == iVal) {
			new Exam_For_603().toHex_Str(s4);
		}

	}
}