package a.b.c.ch5;

public class Exam_Throw_101 {
	
	public static void main(String[] args) {
		
		try {
			throw new Exception("���� �޼���");
			// Exception e = new Exception("���� �޼���");
			// throw e;
		}catch(Exception e) {
			System.out.println("e >>> : " + e);
			System.out.println("e.getMessage() >>> : " + e.getMessage());
		}
		
		System.out.println("try-catch �� ���� >> : ");
	}
}
