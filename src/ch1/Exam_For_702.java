//package : keyword : ch1 디렉토리에 Exam_For_702 class를 저장한다.
package ch1;

//public : 접근 제한자 : Access Modifier : 다른 패키지, 같은 패키지에서 calss의 접근을 허용한다.
//class : 자바의 최소 단위 : class의 구성은 변수 + 함수이다
public class Exam_For_702 {
	
	/*
	forTest 함수를 리턴값 없이 선언한다.
	매개변수는 int 형 배열이다.
	int 형 배열의 참조변수는 iArr_forTest 이다.
	forTest 함수를 호출할 때는 인수(아규먼트)를 int 형 배열의 참조변수를 넘겨야 한다.
	단 변수명은 동일하지 않아도 된다.
	*/
	//(int iArr_forTest[]) : int형 iArr_fortest[] 참조변수는 배열(객체) 인수를 받는다. 
	public void forTest(int iArr_forTest[]) {
		
		System.out.println("forTest() 함수의 시작 >>>>>> ");
		System.out.println("iArr_forTest[]의 주소값 >>>> "  + iArr_forTest);

		//지역 변수는 초기화를 하여서 사용한다.
		int iArrLen = 0;
		
		// iArr_forTest의 배열이 null 아니고 iArr_forTest.length가 0보다 크면 true로 if문을 실행한다.
		if (iArr_forTest != null && iArr_forTest.length > 0) {
			
			iArrLen = iArr_forTest.length;
			// 배열의 길이를 콘솔에 출력해보기
			System.out.println("iArr_forTest.length >>> : " + iArrLen);
			//for : from to loop : 반복문
			//int i가 iArrLen보다 작으면 true로 표현식을 반복한다.
			for (int i = 0; i < iArrLen; i++) {
				System.out.println("iArr_forTest["+i+"] >>> :"+iArr_forTest[i]);
			}
		} else { // else : if 문이 false 일 때 실행한다.
			System.out.println("데이터값을 제대로 보내주세요.");
		}
		
	} //end of forTest()
	
	//콘솔 어플리케이션의 시작 지점이다 : 인터프리트 방식으로 진행된다.
	public static void main(String args[]) {
		/*
		지역변수
		int 기초자료형이면서 배열로 인스턴스(객체로)해서 참조변수를 사용한다.
		iArr_main : 참조변수
		int 형 배열을 iArr_main 참조변수 1차원 배열로 선언과 동시에 초기화했다.
		*/
		int iArr_main[] = {1,2,3,4,5,6,7,8,9};
		System.out.println("iArr_main의 주소값 >>>> : " + iArr_main);
		
		//사용자 정의 Exam_For_702 클래스를 사용하기 위해 인스턴스 했다.(메모리에 올렸다.)
		//참조 변수는 ef7 이다.
		Exam_For_702 ef7 = new Exam_For_702();
		System.out.println("Exam_For_702의 주소값 >>>> : " + ef7);
		
		//참조 변수 ef7_1를 이용해서 Exam_For_7_1 클래스의 자원 중
		//forTest() 함수를 호출하고 함수의 매개변수에 인수 iArr_main 배열 참조변수를 넘겨준다.
		//iArr_main : 인수, argument
		//메모리에 올라가 forTest 함수가 인터프리트 방식으로 수행된다.
		ef7.forTest(iArr_main);

	}//end of main()
}//end of class