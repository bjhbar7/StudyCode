package ch1;

public class Exam_FlowControl_102 {

	public static void main(String args[]) {
	
		int x = 1;
		int y = 2;

		boolean xybool = x < y;
		System.out.println("xybool : " + xybool);
		
		//if���� ()�Ұ�ȣ ���� ����� true�� ���� ����ȴ�.
		//x < y, 1 < 2 �� ������ �� �ȵ� ���� �ִ�.
		if (xybool) {
			System.out.println("true boolean");
		}

		if (x < y) {
			System.out.println("x < y >>> : true");
		}

		if (1 < 2) {
			System.out.println("1 < 2 >>> : true");
		}
		
	}
}