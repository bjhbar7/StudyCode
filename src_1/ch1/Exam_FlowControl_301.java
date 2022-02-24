package ch1;

public class Exam_FlowControl_301 {

	public int add(int x , int y) {
		return x + y;
	}

	public static void main(String args[]) {

		if (args.length == 2) {

			String args0 = args[0];
			String args1 = args[1];
			
			int x = Integer.parseInt(args0);
			int y = Integer.parseInt(args1);

			Exam_FlowControl_301 ef3 = new Exam_FlowControl_301();
			System.out.println("ef3의 주소값 : " + ef3);
			int addSum = ef3.add(x, y);
			System.out.println("addSum : " + addSum);


		} else {
			System.out.println("연산할 수를 잘 입력하시오.");
		}
	}
}