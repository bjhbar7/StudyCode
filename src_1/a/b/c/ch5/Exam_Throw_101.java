package a.b.c.ch5;

public class Exam_Throw_101 {
	
	public static void main(String[] args) {
		
		try {
			throw new Exception("오류 메세지");
			// Exception e = new Exception("오류 메세지");
			// throw e;
		}catch(Exception e) {
			System.out.println("e >>> : " + e);
			System.out.println("e.getMessage() >>> : " + e.getMessage());
		}
		
		System.out.println("try-catch 블럭 이후 >> : ");
	}
}
