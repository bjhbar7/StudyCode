package ch1;

public class Exam_FlowControl_401 {
	
	public int add(int x, int y) {
		return x + y;
	}

	public int subtract(int x, int y) {
		return x - y;
	}

	public int multiply(int x, int y) {
		return x * y;
	}

	public int divide(int x, int y) {
		return x / y;
	}

	public static void main(String args[]) {
	
		int argsLength = args.length;
		boolean argsLengthBoolean = (argsLength == 2);
		if (argsLengthBoolean) {
			
			String args0 = args[0];
			String args1 = args[1];

			int intArgs0 = Integer.parseInt(args0);
			int intArgs1 = Integer.parseInt(args1);

			Exam_FlowControl_401 ef4 = new Exam_FlowControl_401();
			System.out.println("ef4의 주소값 : " + ef4);
			int addSum = ef4.add(intArgs0, intArgs1);
			System.out.println("addSum : " + addSum);
			int subtract = ef4.subtract(intArgs0, intArgs1);
			System.out.println("subtract : " + subtract);
			int multiple = ef4.multiply(intArgs0, intArgs1);
			System.out.println("multiple : " + multiple);
			int divide = ef4.divide(intArgs0, intArgs1);
			System.out.println("divide : " + divide);

		} else {
			System.out.println("args를 다시 입력해주세요.");
		}
	}
}