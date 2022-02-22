package a.b.c.ch5;

public class Exam_Throws_101 {

	int aM() throws ArithmeticException {
		
		int z = bM();
		return z;
	}

	int bM() throws ArithmeticException {
		
		int z = 0;

		z = 1 / 0;

		return z;
	}
	/*
	main() 함수로 시작하는 프로그램에서 함수의 호출 순서에
	의해 수행 되다가 에러가 발생할 경우
	에러가 발행한 라인이 있는 함수부터 에러를 던져서(throws)
	그 함수를 호출하는 함수가 받고 다시 그 함수가 던져서(throws)
	main() 함수에서 마지막으로 호출을 하면 
	main() 함수에서 예외 처리하면 된다.
	*/
	public static void main(String[] args) {
	
		try{
			Exam_Throws_101 et = new Exam_Throws_101();
			int z = et.aM();

			System.out.println("z >>> : " + z);
		} catch (ArithmeticException a) {
			System.out.println("에러가 a >>> : " + a);
		}
	}
}
/*
C:\00.KOSMO108\10.JExam\src\a\b\c\ch5>java a.b.c.ch5.Exam_Throws_101
에러가 a >>> : java.lang.ArithmeticException: / by zero
*/