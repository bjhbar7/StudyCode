package a.b.c.ch5;

// �Լ��� �θ��� ������ ���α׷������� �Լ��� ȣ���Ѵ� �ϰ� �δ´�. invoke �Ѵ�.

public class Exam_Invoke {

	// �⺻ ������ 
	Exam_Invoke() {
		System.out.println("Exam_Invoke() ������ >>> : ");
		
		// aM() �Լ��� ȣ�� �Ѵ�.
		aM();
	}
	
	void aM() {
		System.out.println("aM() �Լ� >>> : ");
		
		// bM() �Լ��� ȣ���Ѵ�.
		bM();
	}

	void bM() {
		System.out.println("bM() �Լ� >>> : ");
		
		// cM() �Լ��� ȣ���Ѵ�.
		cM();
	}
	
	void cM() {
		System.out.println("cM() �Լ� >>> : ");		
	}
	
	// main() �Լ��� �� ���α׷��� �������̴�. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Exam_Invoke() �����ڸ� ȣ���Ѵ�. invoke �Ѵ�.
		new Exam_Invoke();
	}
}
