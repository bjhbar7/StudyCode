package a.b.c.ch5;

public class Exam_TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x = 1;
			int y = 0;
			
			int z = x / y;
			
			System.out.println("x / y  = " + z);
		} catch(ArithmeticException e) {
			System.out.println("에러 로그 찍기 >>> : " + e);
		} finally {
			System.out.println("finally 블럭 >>> : ");
			System.out.println("에러 또는 정상 모두 수행한다. >>> : ");
		}
		/*
		int x = 1;
		int y = 0;
		
		int z = x / y;
		
		System.out.println("x / y  = " + z);
		
		 실행할 때 에러가 난다.
		Exception in thread "main" java.lang.ArithmeticException: / by zero
		at a.b.c.ch5.Exam_TryCatch.main(Exam_TryCatch.java:24)

		*/
		
	}//end of main()

}//end of Exam_TryCatch
