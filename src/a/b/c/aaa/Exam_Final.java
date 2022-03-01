package a.b.c.aaa;

public class Exam_Final {
	//상수 선언
	public static final String FILE_UPLOAD_PATH = "11";
	
	void examMethod(final String s) {
		System.out.println("Exam_Final.examMethod 진입");
		String ss = s;
		System.out.println("ss >>> : " + ss);
	}
	
	public static void main(String args[]) {
		
		String s = Exam_Final.FILE_UPLOAD_PATH;
		System.out.println(" s >>> : " + s);
		
		Exam_Final ef = new Exam_Final();
		System.out.println("ef >>> : " + ef);
		ef.examMethod("예제1");
	}
}
