package ch1;

public class Exam_For_102 {

	public void for_1() {
		System.out.println("Exam_For_102�� for_1 �Լ� �� ����");
		for (int i = 0; ; ) {
			System.out.println("i >>>> :" + i);
		}
	}

	public void for_2() {
		System.out.println("Exam_For_102�� for_2 �Լ� �� ����");
		int i=0;
		for (i=0; ; ) {
			System.out.println("i >>>> :" + i);
		}
	}

	public void for_3() {
		System.out.println("Exam_For_102�� for_3 �Լ� �� ����");
		int i=0;
		for (; ; ) {
			System.out.println("i >>>> :" + i);
		}
	}

	public void for_4() {
		System.out.println("Exam_For_102�� for_4 �Լ� �� ����");
		int i=0;
		for (i=0; i<3; ) {
			System.out.println("i >>>> :" + i);
		}
	}

	public void for_5() {
		System.out.println("Exam_For_102�� for_5 �Լ� �� ����");
		int i=0;
		for (; i<3 ; ) {
			System.out.println("i >>>> : " +i);
		}
	}

	public void for_6() {
		System.out.println("Exam_For_102�� for_6 �Լ� �� ����");
		int i=0;
		for (i=0; i<3; i++) {
			System.out.println("for �Լ� ���� i >>> : " + i);
		}
		System.out.println("for �Լ� �ܺ� i >>> : " + i);
	}

	public void for_7() {
		System.out.println("Exam_For_102�� for_7 �Լ� �� ����");
		for (int i=0; i<3; i++) {
			System.out.println("for �Լ� ���� i >>> : " + i);
		}
		// System.out.println("for �Լ� �ܺ� i >>> : " + i);
	}

	public static void main(String args[]) {
		
		boolean argsExistence = args.length == 1;
		System.out.println("argsExistence >>> : " + argsExistence);
		if (argsExistence) {
			String sVal = args[0];
			if (sVal != null && sVal.length() > 0) {
				if ("1".equals(sVal)) {
					new Exam_For_102().for_1();
				}
				if ("2".equals(sVal)) {
					new Exam_For_102().for_2();
				}
				if ("3".equals(sVal)) {
					new Exam_For_102().for_3();
				}
				if ("4".equals(sVal)) {
					new Exam_For_102().for_4();
				}
				if ("5".equals(sVal)) {
					new Exam_For_102().for_5();
				}
				if ("6".equals(sVal)) {
					new Exam_For_102().for_6();
				}
				if ("7".equals(sVal)) {
					new Exam_For_102().for_7();
				}
			} else {
				System.out.println("����� �μ��� ����� ġ����");
			}
		} else {
			System.out.println("����� �μ��� �Ѱ��� ġ���� (1~7)");
		}
	}
}