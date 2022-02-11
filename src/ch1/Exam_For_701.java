//package : keyword : ch1 디렉토리에 Exam_For_701 class 저장한다.
package ch1;

//public : 접근 제한자 : Access Modifier : 다른 패키지, 같은 패키지에서 Exam_For_701 class의 접근을 허용한다.
//class : 자바의 최소 단위 : 자바는 변수 + 함수로 이루어져있다.
public class Exam_For_701 {
	//public : 접근 제한자 : 다른 패키지, 같은 패키지에서 main() 함수의 접근을 허용한다.
	//static : 수정자 키워드 : 변수, 함수 앞에 기입하고 JVM이 프로그램 시작시 메모리 위에 올려둔다. 프로그램 종료시 해제된다.
	//void : 리턴값이 없을 경우 리턴형 위치에 사용한다.
	//main() : console application의 시작지점이다. : 인터프리트 방식(함수들은 모두 포함)으로 진행한다.
	//String : java.lang.String class
	//String args[] : 명령행 인수 : String 배열의 args 변수 (객체)
	public static void main(String args[]) {
		//int : 자료형 : 4byte 공간 : 정수
		//int형 값을 갖는 배열을 iArr 변수에 초기화한다.
		int iArr[] = {1,2,3,4,5,6,7,8,9};
		System.out.println("iArr의 주소값 >>>> : " + iArr);
		
		//iArr 변수를 선언하고 null(default)로 초기화한다.
		iArr = null;

		/*
		아래 식 같이 null을 제대로 검열 안하면 null 에러가 실행시 난다.

		int iArrLen = iArr.length; -> 이곳부터 나기 시작한다.
		System.out.println("iArr.length 배열의 길이 >>> : " + iArr.length); 
		
		if (iArrLen > 0){

			for (int i=0; i < iArrLen; i++ ){
				System.out.println("iArr[" + i + "] >>> : " + iArr[i]);
			}
		}
		*/
		
		//int : 자료형 : 4byte 공간 : 정수
		//int형 iArrLen 변수를 선언하고 0(default)으로 초기화한다.
		int iArrLen = 0;
		// iArr가 null 이 아니고, 길이가 0이 아니면 true로 if문이 실행한다.
		if (iArr != null && iArr.length > 0) {
			//iArrLen 변수를 iArr배열의 길이로 초기화한다.
			iArrLen = iArr.length;
			System.out.println("iArr의 길이 >>>> : " + iArrLen);
			
			//for 문 : from to loop : 반복문 : 특정 조건부터 특정 조건까지 반복한다.
			for (int i = 0; i<iArrLen; i++) {
				System.out.println("iArr["+i+"] >>>> : " + iArr[i]);
			}
		} else { //else : if문 조건이 false이면 실행된다.
			//System.out.println(); : () 내용을 출력한다.
			System.out.println("데이터를 제대로 보내세요." + iArr);
		}
	}//end of main()
}//end of Exam_For_701