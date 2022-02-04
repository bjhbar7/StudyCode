package ch1;

public class Exam_Var_6 {
	// 클래스 변수 : static 변수
	static int i;
	// 상수
	public static final int CONSTRUCTOR_VARIABLE = 10;
	// 클래스 변수 : static 변수
	static int i_var_staticVariable;
	// 전역 변수
	public int i_var_globalVariable;
	// 멤버 변수
	int i_var_MemberVariable;

	public static void main(String args[]){
		//int : 자료형 : 4 byte 공간
		//int 자료형의 ii 변수를 선언하고 1로 초기화한다.
		//main() 함수 안에 있는 ii 변수
		//함수 안에서 선언하는 변수는 지역 변수(local variable)이라고 한다.
		//; : 문장(statement) 종결
		int ii = 1;
		System.out.println("Exam_Var_6.i >>> : " + Exam_Var_6.i);
		//지역 변수 ii 는 함수 안에 있으므로 Exam_Var_6.ii로 표현 불가능
		//System.out.println("Exam_Var_6.ii >>> : " + Exam_Var_6.ii);
		System.out.println("ii >>> : " + ii);
	} //end of main()
} //end of Exam_Var_6 class