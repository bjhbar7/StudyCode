//package : keyword : ch1 디렉토리에 Exam_ClassTest_5를 저장한다.
//; : 문장(statement) 종결
package ch1;

//public : Access Modifier : 접근 제한자 : 같은 패키지, 다른 패키지에서 해당 class를 호출합니다.
//class : 자바 프로그램의 최소 단위이다. 구성은 함수 + 변수 : class가 메모리 위에 올라가면 객체(Object)가 된다.
public class Exam_ClassTest_5 {
	
	//멤버 변수
	//상수
	//public : 접근 제한자 : Access Modifier : 다른 패키지, 같은 패키지에서 변수에 접근을 허용한다.
	//static : 수정자 키워드 : 변수, 함수 앞에 기입하며 JVM이 메모리 위에 올려둔다. 프로그램이 종료시 해제된다.
	public static final int ID_NUM = 1;
	//클래스 변수, static 변수
	static int id_val = 11;
	//전역 변수
	public int iVal_G;
	//멤버 변수
	int iVal;
	//리턴형이 없는 함수, static이 없는 함수
	public void aMethod(){
		System.out.println("aMethod()");
	}
	//리턴형이 없는 함수, static이 있는 함수
	public static void aaMethod(){
		System.out.println("aaMethod()");
	}
	//리턴형이 있는 함수(리턴형 int), static이 없는 함수
	public int bMethod(){
		System.out.println("bMethod()");
		return 1 + 1;
	}
	//리턴형이 있는 함수(리턴형 int), static이 있는 함수
	public static int bbMethod(){
		System.out.println("bbMethod()");
		return 10 + 10;
	}

	public static void main(String args[]){
		
		//static이 있는 자원(변수, 함수) 호출하는 방법
		//패키지명.클래스명.자원이름
		System.out.println("ID_NUM >>> : " + Exam_ClassTest_5.ID_NUM + "\n");
		System.out.println("id_val >>> : " + Exam_ClassTest_5.id_val + "\n");
		//리턴형이 없는 함수는 println()함수에서 사용 불가능하다.
		Exam_ClassTest_5.aaMethod();
		System.out.println("bbMethod() >>> : " + Exam_ClassTest_5.bbMethod() + "\n");
		//리턴형이 있는 함수는 리턴값을 받아서 사용 가능하다.
		int idd = Exam_ClassTest_5.bbMethod();
		System.out.println("idd >>> : " + idd +"\n");
		
		Exam_ClassTest_5 ec = new Exam_ClassTest_5();
		System.out.println("iVal_G >>> : " + ec.iVal_G + "\n");
		System.out.println("iVal >>> : " + ec.iVal + "\n");
		ec.aMethod();
		System.out.println("bMethod() >>> : " + ec.bMethod() + "\n");
		//리턴형이 있는 함수는 리턴값을 받아서 사용 가능하다.
		int iB = ec.bMethod();
		System.out.println("iB >>> : " + iB);
	} //end of main()
} // end of class