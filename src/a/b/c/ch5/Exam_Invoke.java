package a.b.c.ch5;

public class Exam_Invoke {
	
	Exam_Invoke() {
		System.out.println("Exam_Invoke() ������ >>>> : ");
		
		aM();
	}
	
	void aM() {
		System.out.println("aM() �Լ� >>> : ");
		
		bM();
	}
	
	void bM() {
		System.out.println("bM() �Լ� >>> : ");
		
		cM();
		/*ccM();
		 * Exception in thread "main" Exam_Invoke() ������ >>>> : 
			aM() �Լ� >>> : 
			java.lang.Error: Unresolved compilation problem: 
		The method ccM() is undefined for the type Exam_Invoke	

		at a.b.c.ch5.Exam_Invoke.bM(Exam_Invoke.java:20)
		at a.b.c.ch5.Exam_Invoke.aM(Exam_Invoke.java:14)
		at a.b.c.ch5.Exam_Invoke.<init>(Exam_Invoke.java:8)
		at a.b.c.ch5.Exam_Invoke.main(Exam_Invoke.java:31)

		 * */
	}
	
	void cM() {
		System.out.println("cM() �Լ� >>> : ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exam_Invoke()  �����ڸ� ȣ���Ѵ�. Invoke�Ѵ�.
		new Exam_Invoke();
	}

}
