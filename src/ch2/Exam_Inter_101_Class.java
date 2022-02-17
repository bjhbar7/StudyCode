package ch2;

public class Exam_Inter_101_Class implements Exam_Inter_102, Exam_Inter_103 {

	@Override
	public void aM() {
		System.out.println("Exam_Inter_101_Class ::: aM() >>>> ");
	}
	
	@Override
	public void bM() {
		System.out.println("Exam_Inter_101_Class ::: bM() >>>> ");
	}

	@Override
	public void cM() {
		System.out.println("Exam_Inter_101_Class ::: cM() >>>> ");
	}

	@Override
	public void eM() {
		System.out.println("Exam_Inter_101_Class ::: eM() >>>> ");
	}
}
