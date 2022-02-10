package ch1;

public class Exam_For_102 {

	public void for_1() {
		System.out.println("Exam_For_102의 for_1 함수 블럭 시작");
		for (int i = 0; ; ) {
			System.out.println("i >>>> :" + i);
		}
	}

	public void for_2() {
		System.out.println("Exam_For_102의 for_2 함수 블럭 시작");
		int i=0;
		for (i=0; ; ) {
			System.out.println("i >>>> :" + i);
		}
	}

	public void for_3() {
		System.out.println("Exam_For_102의 for_3 함수 블럭 시작");
		int i=0;
		for (; ; ) {
			System.out.println("i >>>> :" + i);
		}
	}

	public void for_4() {
		System.out.println("Exam_For_102의 for_4 함수 블럭 시작");
		int i=0;
		for (i=0; i<3; ) {
			System.out.println("i >>>> :" + i);
		}
	}

	public void for_5() {
		System.out.println("Exam_For_102의 for_5 함수 블럭 시작");
		int i=0;
		for (; i<3 ; ) {
			System.out.println("i >>>> : " +i);
		}
	}

	public void for_6() {
		System.out.println("Exam_For_102의 for_6 함수 블럭 시작");
		int i=0;
		for (i=0; i<3; i++) {
			System.out.println("for 함수 내부 i >>> : " + i);
		}
		System.out.println("for 함수 외부 i >>> : " + i);
	}

	public void for_7() {
		System.out.println("Exam_For_102의 for_7 함수 블럭 시작");
		for (int i=0; i<3; i++) {
			System.out.println("for 함수 내부 i >>> : " + i);
		}
		// System.out.println("for 함수 외부 i >>> : " + i);
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
				System.out.println("명령행 인수를 제대로 치세요");
			}
		} else {
			System.out.println("명령행 인수를 한개만 치세요 (1~7)");
		}
	}
}