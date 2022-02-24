package a.b.c.ch5;

public class Exam_Invoke {
	
	Exam_Invoke() {
		System.out.println("Exam_Invoke() 생성자 >>>> : ");
		
		aM();
	}
	
	void aM() {
		System.out.println("aM() 함수 >>> : ");
		
		bM();
	}
	
	void bM() {
		System.out.println("bM() 함수 >>> : ");
		
		cM();
		/*ccM();
		 * Exception in thread "main" Exam_Invoke() 생성자 >>>> : 
			aM() 함수 >>> : 
			java.lang.Error: Unresolved compilation problem: 
		The method ccM() is undefined for the type Exam_Invoke	

		at a.b.c.ch5.Exam_Invoke.bM(Exam_Invoke.java:20)
		at a.b.c.ch5.Exam_Invoke.aM(Exam_Invoke.java:14)
		at a.b.c.ch5.Exam_Invoke.<init>(Exam_Invoke.java:8)
		at a.b.c.ch5.Exam_Invoke.main(Exam_Invoke.java:31)

		 * */
	}
	
	void cM() {
		System.out.println("cM() 함수 >>> : ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exam_Invoke()  생성자를 호출한다. Invoke한다.
		new Exam_Invoke();
	}

}
