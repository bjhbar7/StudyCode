package ch1;

public class Exam_ClassTest_7 {
	
	public int aMethod(){
		System.out.println("	aMethod()의 시작 >>>>>>>");
		int x = 1;
		int y = 2;
		//System.out.println()으로 log를 찍는다.
		System.out.println("	x : " + x + " , y : " + y);
		int addSum = x + y ;
		System.out.println("	addSum : " + addSum + " = x :" + x + " + y : " + y);
		System.out.println("	aMethod()의 끝 >>>>>>>");

		return addSum;
		//return : 키워드 : statement을 수행하고 ; 종결 문자를 한 뒤에 어떠한 구문도 허락하지 않는다.
	}

	public static void main(String args[]){
		System.out.println("main() 함수의 시작 >>>>>");
		//new 연산자를 사용해서 Exam_ClassTest_7를 참조하는 참조변수 ec7를 만든다.
		Exam_ClassTest_7 ec7 = new Exam_ClassTest_7();
		System.out.println("ec7 >>> : " + ec7);
		System.out.println("ec7.aMethod >>> : " + ec7.aMethod());
		//int형 ec_aMethod 변수에 ec7.aMethod()의 값을 대입한다.
		int ec_aMethod = ec7.aMethod();
		System.out.println("ec_aMethod >>> : " + ec_aMethod);
		System.out.println("main() 함수의 끝 >>>>>");
	} //end of main()
} // end of Exam_ClassTest_7