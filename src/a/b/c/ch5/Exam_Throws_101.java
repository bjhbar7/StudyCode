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
	main() �Լ��� �����ϴ� ���α׷����� �Լ��� ȣ�� ������
	���� ���� �Ǵٰ� ������ �߻��� ���
	������ ������ ������ �ִ� �Լ����� ������ ������(throws)
	�� �Լ��� ȣ���ϴ� �Լ��� �ް� �ٽ� �� �Լ��� ������(throws)
	main() �Լ����� ���������� ȣ���� �ϸ� 
	main() �Լ����� ���� ó���ϸ� �ȴ�.
	*/
	public static void main(String[] args) {
	
		try{
			Exam_Throws_101 et = new Exam_Throws_101();
			int z = et.aM();

			System.out.println("z >>> : " + z);
		} catch (ArithmeticException a) {
			System.out.println("������ a >>> : " + a);
		}
	}
}
/*
C:\00.KOSMO108\10.JExam\src\a\b\c\ch5>java a.b.c.ch5.Exam_Throws_101
������ a >>> : java.lang.ArithmeticException: / by zero
*/