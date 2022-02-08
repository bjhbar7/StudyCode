package ch1;

public class Exam_FlowControl_102 {

	public static void main(String args[]) {
	
		int x = 1;
		int y = 2;

		boolean xybool = x < y;
		System.out.println("xybool : " + xybool);
		
		//if문은 ()소괄호 안의 산식이 true일 때만 수행된다.
		//x < y, 1 < 2 의 연산이 잘 안될 수도 있다.
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